package seedu.duke;

import java.util.ArrayList;

public class InternTrack {
    private static final String ADD_COMMAND = "add";
    private static final String BYE_COMMAND = "bye";

    public static void main(String[] args) {
        ArrayList<Application> userApplications = new ArrayList<>();
        Storage.loadApplications(userApplications);
        String line = Ui.readCommand();
        while (!line.equals(BYE_COMMAND)) {
            Ui.printBorder();
            handleCommand(line, userApplications);
            Ui.printBorder();
            line = Ui.readCommand();
        }
        Ui.printGoodbye();
    }

    private static void handleCommand(String line, ArrayList<Application> userApplications) {
        try {
           if (line.startsWith(ADD_COMMAND)) {
               ApplicationList.addApplications(userApplications, line);
               Storage.saveApplications(userApplications);
           }
        } catch (InternTrackException e) {
            System.out.println(e.getMessage());
        }
    }
}

