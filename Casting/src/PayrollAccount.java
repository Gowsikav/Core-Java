public class PayrollAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Payroll account credentials");
    }

    public void processPayroll() {
        System.out.println("Processing payroll...");
    }
}
