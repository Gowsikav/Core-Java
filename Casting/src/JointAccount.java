public class JointAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Joint account credentials");
    }

    public void verifyCoHolder() {
        System.out.println("Verifying co-holder...");
    }
}
