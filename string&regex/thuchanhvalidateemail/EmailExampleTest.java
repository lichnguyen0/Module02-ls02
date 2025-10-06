package thuchanhvalidateemail;

public class EmailExampleTest {
    private static EmailExample emailExample;
    private static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo", "abc@hotmail.com"};
    public static final String[] invaliEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String args[]) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Emai is" + email + "is valid: " + isvalid);
        }
        for (String email : invaliEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + "is valid: " + isvalid);
        }
    }
}
