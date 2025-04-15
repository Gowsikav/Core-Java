
    public class RunnerClass {
        public static void main(String[] args) {
            Account[] accounts = new Account[] {
                    new DigitalAccount(),
                    new SavingsAccount(),
                    new CheckingAccount(),
                    new BusinessAccount(),
                    new StudentAccount(),
                    new RetirementAccount(),
                    new JointAccount(),
                    new ForeignCurrencyAccount(),
                    new CreditAccount(),
                    new PremiumAccount(),
                    new StudentLoanAccount(),
                    new CharityFundAccount(),
                    new TaxSavingAccount(),
                    new GoldInvestmentAccount(),
                    new CurrencyExchangeAccount(),
                    new LuxuryGoodsAccount(),
                    new WeddingFundAccount(),
                    new TechnologyInvestmentAccount(),
                    new DebtRepaymentAccount(),
                    new MortgageAccount(),
                    new ImportExportAccount(),
                    new MicroInvestmentAccount(),
                    new ArtLoanAccount(),
                    new TradeFinanceAccount(),
                    new DigitalCurrencyAccount(),
                    new StructuredSettlementAccount(),
                    new EnvironmentalFundAccount(),
                    new ArtGalleryAccount(),
                    new IntellectualPropertyAccount(),
                    new InvestmentBankingAccount(),
                    new WealthManagementAccount(),
                    new HedgeFundAccount(),
                    new CommercialLoanAccount(),
                    new InvestmentFundAccount(),
                    new HighYieldAccount(),
                    new CorporateAccount(),
                    new OffshoreAccount(),
                    new FranchiseAccount(),
                    new PatentInvestmentAccount(),
                    new RetirementFundAccount(),
                    new CryptoSavingsAccount(),
                    new CrowdfundingAccount(),
                    new DisasterReliefAccount(),
                    new SpaceTravelAccount()
            };

            for (Account account : accounts) {
                if (account != null) {
                    account.credentials();

                    if (account instanceof DigitalAccount) ((DigitalAccount) account).autoLogin();
                    else if (account instanceof SavingsAccount) ((SavingsAccount) account).calculateInterest();
                    else if (account instanceof CheckingAccount) ((CheckingAccount) account).processCheckDeposit();
                    else if (account instanceof BusinessAccount) ((BusinessAccount) account).generateInvoice();
                    else if (account instanceof StudentAccount) ((StudentAccount) account).applyStudentDiscount();
                    else if (account instanceof RetirementAccount) ((RetirementAccount) account).calculatePension();
                    else if (account instanceof JointAccount) ((JointAccount) account).verifyCoHolder();
                    else if (account instanceof ForeignCurrencyAccount) ((ForeignCurrencyAccount) account).convertCurrency();
                    else if (account instanceof CreditAccount) ((CreditAccount) account).checkCreditLimit();
                    else if (account instanceof PremiumAccount) ((PremiumAccount) account).offerPremiumBenefits();
                    else if (account instanceof StudentLoanAccount) ((StudentLoanAccount) account).applyStudentLoanInterest();
                    else if (account instanceof CharityFundAccount) ((CharityFundAccount) account).donateToCharity();
                    else if (account instanceof TaxSavingAccount) ((TaxSavingAccount) account).saveOnTax();
                    else if (account instanceof GoldInvestmentAccount) ((GoldInvestmentAccount) account).buyGold();
                    else if (account instanceof CurrencyExchangeAccount) ((CurrencyExchangeAccount) account).exchangeForeignCurrency();
                    else if (account instanceof LuxuryGoodsAccount) ((LuxuryGoodsAccount) account).purchaseLuxuryItems();
                    else if (account instanceof WeddingFundAccount) ((WeddingFundAccount) account).fundWedding();
                    else if (account instanceof TechnologyInvestmentAccount) ((TechnologyInvestmentAccount) account).investInTech();
                    else if (account instanceof DebtRepaymentAccount) ((DebtRepaymentAccount) account).repayDebt();
                    else if (account instanceof MortgageAccount) ((MortgageAccount) account).calculateMortgageInterest();
                    else if (account instanceof ImportExportAccount) ((ImportExportAccount) account).facilitateTrade();
                    else if (account instanceof MicroInvestmentAccount) ((MicroInvestmentAccount) account).investSmallAmount();
                    else if (account instanceof ArtLoanAccount) ((ArtLoanAccount) account).collateralizeArt();
                    else if (account instanceof TradeFinanceAccount) ((TradeFinanceAccount) account).provideTradeFinance();
                    else if (account instanceof DigitalCurrencyAccount) ((DigitalCurrencyAccount) account).tradeDigitalCurrency();
                    else if (account instanceof StructuredSettlementAccount) ((StructuredSettlementAccount) account).manageSettlement();
                    else if (account instanceof EnvironmentalFundAccount) ((EnvironmentalFundAccount) account).supportGreenProjects();
                    else if (account instanceof ArtGalleryAccount) ((ArtGalleryAccount) account).fundArtGallery();
                    else if (account instanceof IntellectualPropertyAccount) ((IntellectualPropertyAccount) account).licenseIntellectualProperty();
                    else if (account instanceof InvestmentBankingAccount) ((InvestmentBankingAccount) account).adviseOnInvestments();
                    else if (account instanceof WealthManagementAccount) ((WealthManagementAccount) account).manageWealth();
                    else if (account instanceof HedgeFundAccount) ((HedgeFundAccount) account).hedgeRisk();
                    else if (account instanceof CommercialLoanAccount) ((CommercialLoanAccount) account).approveCommercialLoan();
                    else if (account instanceof InvestmentFundAccount) ((InvestmentFundAccount) account).trackInvestment();
                    else if (account instanceof HighYieldAccount) ((HighYieldAccount) account).earnHighInterest();
                    else if (account instanceof CorporateAccount) ((CorporateAccount) account).processCorporateTransaction();
                    else if (account instanceof SpaceTravelAccount) ((SpaceTravelAccount) account).bookSpaceFlight();

                    for (int i = 45; i <= 100; i++) {
                        try {
                            Class<?> cls = Class.forName("AccountType" + i);
                            if (cls.isInstance(account)) {
                                cls.getMethod("methodAccountType" + i).invoke(account);
                                break;
                            }
                        } catch (Exception ignored) {}
                    }

                    System.out.println("-----------------------------");
                }
            }
        }
    }


