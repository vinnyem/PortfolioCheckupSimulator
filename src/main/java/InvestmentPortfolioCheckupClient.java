import java.util.Scanner;

/**
 * @author vimuruga
 *
 * May 29, 2016
 */
public class InvestmentPortfolioCheckupClient {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String riskFactor;
        double initialInvestment;
        int numberofYears;
        PortfolioReturn portfolioReturn;
        try {
            System.out.println("Growth Mode - Aggressive or Conservative");
            riskFactor = in.nextLine();
            if (!riskFactor.equals("Aggressive")
                    && !riskFactor.equals("Conservative")) {
                System.out.println("Try again. Enter the exact string - Aggressive or Conservative");
                in.close();
            }
            System.out.println("Initial investment");
            initialInvestment = in.nextDouble();
            System.out.println("Number of years");
            numberofYears = in.nextInt();

            InvestmentFutureCheckup checkup = new InvestmentFutureCheckup(
                    riskFactor, initialInvestment, numberofYears);

            portfolioReturn = checkup.investmentPortfolioReturn();

            System.out.println(portfolioReturn.toString());
        } catch (UnsupportedOperationException e) {
            System.out.println("This operation is not implemented ");
            e.printStackTrace();
        }
    }
}

