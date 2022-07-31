package homework3;

public class Financial_record {
    private int income;
    private int outcome;

    public Financial_record(int income, int outcome) {
        this.income = income;
        this.outcome = outcome;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getOutcome() {
        return outcome;
    }

    public void setOutcome(int outcome) {
        this.outcome = outcome;
    }
}
