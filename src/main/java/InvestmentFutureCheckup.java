import ec.util.MersenneTwisterFast;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * @author vimuruga
 *
 * May 29, 2016
 */
public class InvestmentFutureCheckup {

    int numberOfYears;
    double inflationAdjustedValue;
    double initialInvestment;
    String riskFactor;

    /**
     * @param riskFactor
     * @param initialInvestment
     * @param numberOfYears
     */
    public InvestmentFutureCheckup(String riskFactor,
                                   double initialInvestment, int numberOfYears) {
        this.riskFactor = riskFactor;
        this.initialInvestment = initialInvestment;
        this.numberOfYears = numberOfYears;
    }

    private double inflationAdjustedAmount(int numberOfYears,
                                           double initialInvestment, double inflationRate) {
        inflationAdjustedValue = initialInvestment
                / Math.pow((1 + inflationRate), numberOfYears);
        return inflationAdjustedValue;
    }

    private double investmentPortfolioCalculation(
            MersenneTwisterFast randomGenerator)
            throws UnsupportedOperationException {
        double investmentReturn = 0;
        if (RiskFactors.AGGRESSIVE.toString().equals(riskFactor)) {
            investmentReturn = (randomGenerator.nextGaussian() * PresetConstants.aggressiveRisk)
                    + PresetConstants.aggressiveReturn;
        } else if (RiskFactors.CONSERVATIVE.equals(riskFactor)) {
            investmentReturn = (randomGenerator.nextGaussian() * PresetConstants.conservativeRisk)
                    + PresetConstants.conservativeReturn;
        } else {
            throw new UnsupportedOperationException(
                    "The operation to be performed is not supported");
        }
        return investmentReturn;
    }

    public PortfolioReturn investmentPortfolioReturn()
            throws UnsupportedOperationException {
        PortfolioReturn pr = new PortfolioReturn();
        DescriptiveStatistics stats = runPortfolioSimulation();
        double inflationAdjustedVal = inflationAdjustedAmount(numberOfYears,
                initialInvestment, PresetConstants.inflationRate);
        pr.setMedianPortfolioValue(inflationAdjustedVal * stats.getPercentile(50));
        pr.setBestTenPercentValue(inflationAdjustedVal * stats.getPercentile(90));
        pr.setWorstTenPercentValue(inflationAdjustedVal * stats.getPercentile(10));
        return pr;
    }

    private DescriptiveStatistics runPortfolioSimulation()
            throws UnsupportedOperationException {
        MersenneTwisterFast randomGenerator = new MersenneTwisterFast();
        DescriptiveStatistics stats = new DescriptiveStatistics();

        for (int i = 0; i < PresetConstants.numberOfSimulations; i++) {
            stats.addValue(investmentPortfolioCalculation(randomGenerator));
        }
        return stats;
    }

}


