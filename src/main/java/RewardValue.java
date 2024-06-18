public class RewardValue {

    private double cashValue;

    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public void setMilesValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public int convertFromCashToMiles(double cashValue) {
        milesValue = (int) (cashValue / 0.0035);
        return milesValue;
    }

    public double convertFromMilesToCash(int milesValue) {
        cashValue = (double) milesValue * 0.0035;
        return cashValue;
    }
}
