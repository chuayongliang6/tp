package seedu.duke;
import java.time.LocalDate;

public class Parser {

    public static final String REGEX = "(?=c/|r/|ct/|d/)";

    public static Application createApplication(String input) throws InternTrackException {
        String[] parts = input.split(REGEX);
        String company = null, role = null, contact = null;
        LocalDate deadline = null;
        for (String part : parts) {
            String trimmed = part.trim();
            if (trimmed.startsWith("c/")) {
                company = trimmed.substring(2).trim();
            } else if (trimmed.startsWith("r/")) {
                role = trimmed.substring(2).trim();
            } else if (trimmed.startsWith("ct/")) {
                contact = trimmed.substring(3).trim();
            } else if (trimmed.startsWith("d/")) {
                try {
                    deadline = LocalDate.parse(trimmed.substring(2).trim());
                } catch (Exception e) {
                    throw new InternTrackException("Date must be in YYYY-MM-DD format.");
                }
            }
        }
        if (company == null || role == null) {
            throw new InternTrackException("Both company (c/) and role (r/) are required!");
        }
        return new Application(company, role, deadline, contact);
    }
}
