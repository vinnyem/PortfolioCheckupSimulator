import junit.framework.TestCase;

import org.junit.*;

/**
 * @author vimuruga
 *
 * May 29, 2016
 */
public class InvestmentFutureCheckupTest extends TestCase {

    String riskFactor;
    double initialInvestment;
    int numberofYears;

    @Before
    public void setUp(){
        initialInvestment = 100000;
        numberofYears = 20;
    }

    @Test
    public PortfolioReturn testAggressiveInvestmentPortfolioReturnSuccess(){
        riskFactor = "Aggressive";
        PortfolioReturn portfolioReturn = new PortfolioReturn();
        InvestmentFutureCheckup checkup = new InvestmentFutureCheckup(
                riskFactor, initialInvestment, numberofYears);
        assertNotNull(checkup);
        portfolioReturn = checkup.investmentPortfolioReturn();
        return portfolioReturn;
    }

    @Test
    public PortfolioReturn testConservativeInvestmentPortfolioReturnSuccess(){
        riskFactor = "Conservative";
        PortfolioReturn portfolioReturn = new PortfolioReturn();
        InvestmentFutureCheckup checkup = new InvestmentFutureCheckup(
                riskFactor, initialInvestment, numberofYears);
        assertNotNull(checkup);
        portfolioReturn = checkup.investmentPortfolioReturn();
        return portfolioReturn;
    }

    @Test
    public PortfolioReturn testUndefinedInvestmentPortfolioReturnSuccess(){
        riskFactor = "Average";
        PortfolioReturn portfolioReturn = new PortfolioReturn();
        InvestmentFutureCheckup checkup = new InvestmentFutureCheckup(
                riskFactor, initialInvestment, numberofYears);
        assertNotNull(checkup);
        portfolioReturn = checkup.investmentPortfolioReturn();
        return portfolioReturn;
    }

}