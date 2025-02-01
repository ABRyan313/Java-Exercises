public class Account {

    private int accountNumber;
    private double totalBalance;
    private double availableBalance;

    public Account(int accountNumber, double totalBalance, double availableBalance) throws Exception{

        if(!(accountNumberOk(accountNumber)))
            throw new Exception ("Invalid Account Number");

        this.accountNumber = accountNumber;
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
    }

    public Account(){}

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) throws Exception{
        if(!(accountNumberOk(accountNumber)))
            throw new Exception ("Invalid Account Number");

        this.accountNumber = accountNumber;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public static boolean accountNumberOk(int accountNumber){
        return String.valueOf(accountNumber).length() == 8;
    }
}
