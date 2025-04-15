public class ConstructionLoanAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Construction loan account credentials");
    }

    public void fundConstruction() {
        System.out.println("Funding construction...");
    }
}
