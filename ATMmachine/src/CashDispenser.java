public class CashDispenser {

    private int totalFiveDollarBills;
    private int totalTwentyDollarBills;

    public CashDispenser(int totalFiveDollarBills, int totalTwentyDollarBills) {
        this.totalFiveDollarBills = totalFiveDollarBills;
        this.totalTwentyDollarBills = totalTwentyDollarBills;
    }

    public int getTotalFiveDollarBills() {
        return totalFiveDollarBills;
    }

    public void setTotalFiveDollarBills(int totalFiveDollarBills) {
        this.totalFiveDollarBills = totalFiveDollarBills;
    }

    public int getTotalTwentyDollarBills() {
        return totalTwentyDollarBills;
    }

    public void setTotalTwentyDollarBills(int totalTwentyDollarBills) {
        this.totalTwentyDollarBills = totalTwentyDollarBills;
    }


//    public boolean dispenseCash(){
//
//    }
//
//    public boolean canDispenseCash(){
//
//    }
}
