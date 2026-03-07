package seedu.duke;

import java.util.ArrayList;

public class ApplicationList {
    public static void addApplications(ArrayList<Application> userApplications, String line) throws InternTrackException{
        Application newApplication = Parser.createApplication(line);
        userApplications.add(newApplication);
        Ui.printAddApplication(newApplication, userApplications);
    }
}
