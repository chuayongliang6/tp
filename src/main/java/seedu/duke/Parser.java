package seedu.duke;
import java.time.LocalDate;

public class Parser {
    public static Application createApplication(String input) throws InternTrackException {
        if (!input.contains("c/") || !input.contains("r/")) {
            throw new InternTrackException("An event must include both c/ and r/.");
        }
        String company = null;
        String role = null;
        LocalDate deadline = null;
        String contact = null;
        String[] parts = input.split("\\s+");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].startsWith("c/")) {
                company = parts[i].substring(2);
            } else if (parts[i].startsWith("r/")) {
                role = parts[i].substring(2);
            } else if (parts[i].startsWith("d/")) {
                deadline = LocalDate.parse(parts[i].substring(2));
            } else if (parts[i].startsWith("ct/")) {
                contact = parts[i].substring(3);
            }
        }
        return new Application(company, role, deadline, contact);
    }
}
