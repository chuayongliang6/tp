package seedu.duke;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

/**
 * Manages the loading and saving of applications to a local text file.
 * Converts application objects to a persistent string format and vice versa.
 */
public class Storage {
    private static final String FILE_PATH = "./data/applications.txt";

    /**
     * Loads applications from the local file into the provided list.
     *
     * @param userApplications The list where loaded applications are stored.
     */
    public static void loadApplications(ArrayList<Application> userApplications) {
        try {
            File f = new File(FILE_PATH);
            //Creates directory if it does not exist
            if (f.getParentFile() != null && !f.getParentFile().exists()) {
                f.getParentFile().mkdirs();
            }
            //Create file if it does not exist
            if (!f.exists()) {
                f.createNewFile(); // This physically creates the empty duke.txt file
            }
            Scanner s = new Scanner(f);
            //read lines from text file
            //while loop means as long as there is more data to be read
            //ie as long as there are more lines in the text file,
            //keep reading and converting to Task objects
            while (s.hasNext()) {
                //Reads one full line from the text file
                String line = s.nextLine();
                //Convert text back to object
                Application t = parseFileString(line);
                if (t != null) {
                    userApplications.add(t);
                }
            }
            //includes errors for CreateNewFile and scanner which both involve IOException
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
    /**
     * Parses a single line from the data file into an Application object.
     *
     * @param line The string representing an application.
     * @return The reconstructed Application object.
     */
    private static Application parseFileString(String line) {
        String[] parts = line.split("\\|");
        String company = parts[0];
        String role = parts[1];
        LocalDate deadline = null;
        if (!parts[2].equals("null") && !parts[2].isEmpty()) {
            deadline = LocalDate.parse(parts[2]);
        }
        String contact = parts[3];
        String status = parts[4];
        Application app = new Application(company, role, deadline, contact);
        // Preserve the stored status instead of always defaulting to "Pending"
        app.status = status;
        return app;
    }

    /**
     * Saves the current list of applications to the local file.
     *
     * @param userApplications The list of applications to be saved.
     */
    public static void saveApplications(ArrayList<Application> userApplications) {
        try {
            FileWriter fw = new FileWriter(FILE_PATH);
            StringBuilder sb = new StringBuilder();

            // Convert all applications to string format
            for (Application application : userApplications) {
                sb.append(applicationToFileFormat(application)).append(System.lineSeparator());
            }

            fw.write(sb.toString());
            fw.close();

        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    /**
     * Formats an Application object into a string for file storage.
     *
     * @param application The application to format.
     * @return The formatted string.
     */
    private static String applicationToFileFormat(Application application) {
        return application.company + "|" + application.role + "|"
                + application.deadline + "|" + application.contact
                + "|" + application.status;
    }

}
