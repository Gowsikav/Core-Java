public class StudentLoanAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Student loan account credentials");
    }

    public void applyStudentLoanInterest() {
        System.out.println("Applying student loan interest...");
    }
}
