public class EmailMain {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Email email = new Email("John", "Doe");
        System.out.println(email.showInfo());
    }
}