public class DigitalAccount extends Account
{
    @Override
    public void credentials() {
        System.out.println("Digital account credentials");
    }

    public void autoLogin() {
        System.out.println("Auto-login for digital account");
    }
}
