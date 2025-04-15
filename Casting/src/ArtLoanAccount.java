public class ArtLoanAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Art loan account credentials");
    }

    public void collateralizeArt() {
        System.out.println("Collateralizing art for loan...");
    }
}
