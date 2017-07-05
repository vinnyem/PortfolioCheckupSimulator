/**
 * @author vimuruga
 *
 * May 29, 2016
 */
public enum RiskFactors {
    AGGRESSIVE("Aggressive"),
    CONSERVATIVE("Conservative");

    private final String factor;

    /**
     * @param factor
     */
    private RiskFactors(String factor) {
        this.factor = factor;
    }

    public String toString() {
        return factor;
    }
}
