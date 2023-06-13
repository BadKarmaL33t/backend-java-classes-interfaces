public class EmailContact implements ContactInfo {
    private final String email;

    public EmailContact(String email) {
        this.email = email;
    }

    @Override
    public void sendMessage() {
        System.out.println("Email sent to " + email);
    }
}
