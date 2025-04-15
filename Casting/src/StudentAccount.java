public class StudentAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Student account credentials");
    }

    public void applyStudentDiscount() {
        System.out.println("Applying student discount...");
    }
}
