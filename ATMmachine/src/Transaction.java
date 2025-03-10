public class Transaction {

    private int transactionId;
    private TransactionStatus status;
    private date creationDate;

    public Transaction(){}


    public Transaction(int transactionId, TransactionStatus status, date creationDate) {
        this.transactionId = transactionId;
        this.status = status;
        this.creationDate = creationDate;

    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(date creationDate) {
        this.creationDate = creationDate;
    }

//public boolean saveTransaction(){
//
//}


    }

