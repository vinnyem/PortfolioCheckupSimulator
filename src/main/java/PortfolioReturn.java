/**
 * @author vimuruga
 *
 * May 29, 2016
 */
public class PortfolioReturn {

    private double medianPortfolioValue;
    private double bestTenPercentValue;
    private double worstTenPercentValue;

    /**
     *
     */
    public PortfolioReturn() {

    }

    /**
     * @return the medianPortfolioValue
     */
    public double getMedianPortfolioValue() {
        return medianPortfolioValue;
    }

    /**
     * @param medianPortfolioValue
     *            the medianPortfolioValue to set
     */
    public void setMedianPortfolioValue(double medianPortfolioValue) {
        this.medianPortfolioValue = medianPortfolioValue;
    }

    /**
     * @return the bestTenPercentValue
     */
    public double getBestTenPercentValue() {
        return bestTenPercentValue;
    }

    /**
     * @param bestTenPercentValue
     *            the bestTenPercentValue to set
     */
    public void setBestTenPercentValue(double bestTenPercentValue) {
        this.bestTenPercentValue = bestTenPercentValue;
    }

    /**
     * @return the worstTenPercentValue
     */
    public double getWorstTenPercentValue() {
        return worstTenPercentValue;
    }

    /**
     * @param worstTenPercentValue
     *            the worstTenPercentValue to set
     */
    public void setWorstTenPercentValue(double worstTenPercentValue) {
        this.worstTenPercentValue = worstTenPercentValue;
    }

    @Override
    public String toString() {
        return "PortfolioReturn [medianPortfolioValue=" + medianPortfolioValue
                + ", bestTenPercentValue=" + bestTenPercentValue
                + ", worstTenPercentValue=" + worstTenPercentValue + "]";
    }

}
