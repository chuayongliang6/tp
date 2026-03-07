package seedu.duke;

import java.time.LocalDate;
/**
 * Represents an application with company, role, deadline, contact and status.
 */
public class Application {
    protected String company;
    protected String role;
    protected LocalDate deadline;
    protected String contact;
    protected String status;


    /**
     * Initializes a new application with the specified details.
     * The status is set to "Pending" by default.
     *
     * @param company Name of the company.
     * @param role Job role being applied for.
     * @param deadline Date of the application deadline.
     * @param contact Contact details provided.
     */
    public Application(String company, String role, LocalDate deadline, String contact) {
        this.company = company;
        this.role = role;
        this.deadline = deadline;
        this.contact = contact;
        this.status = "Pending";
    }
    public String toString() {
        return company + " - " + role + " (Deadline: " + deadline + ", Contact: " + contact + ", Status: " + status + ")";
    }
}