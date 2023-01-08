import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // Call a method asking for department & return the department
        this.department = setDepartment();
        // Generate Email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + ".company.com";
        // Call a method that returns random password
        this.password = randomPassword(8);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("Choose your department:-\n1 for sales\n2 for development\n3 for Accounting\n0 for none\nEnter department Code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "development";
        } else if (depChoice == 3) {
            return "accounting";
        } else {
            return "";
        }
    }

    // Generate Password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*()";
        char[] password = new char[length];
        for (int num = 0; num < length; num++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[num] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String showInfo() {
        return "Display name is: " + firstName + " " + lastName + "\nCompany Email: " + email + "\nPassword is: " + password + "\nMailBox Capacity: " + mailboxCapacity + "mb";
    }
}
