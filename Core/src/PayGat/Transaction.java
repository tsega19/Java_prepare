package PayGat;

import java.util.UUID;

public class Transaction {
    UUID transactionID;
    double amount;
    String PaymentMethod;
    String status;
    public Transaction(UUID transactionID, double amount, String paymentMethod, String status) {
        this.transactionID = transactionID;
        this.amount = amount;
        PaymentMethod = paymentMethod;
        this.status = status;
    }
    public UUID getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(UUID transactionID) {
        this.transactionID = transactionID;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getPaymentMethod() {
        return PaymentMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void processTransaction(){
        if (status.isEmpty()){
            setStatus("Failed");
        } else if (status.equals("Pending")) {
            setStatus("Complete");
        }
    }
    public boolean isHighValueTransaction(double threshold){
        return amount > threshold;
    }
    public void DisplayTransaction(){
        System.out.println("ID: " + transactionID);
        System.out.println("Amount: " + amount);
        System.out.println("Payment Method: " + PaymentMethod);
        System.out.println("Status: " + status);
    }
    public static void main(String[] args) {
        UUID transactionID = UUID.randomUUID();
        double transaction = 213.3;
        String PaymentMethod = "Credit Card";
        String status = " ";
        Transaction t = new Transaction(transactionID, transaction, PaymentMethod, status );
        t.DisplayTransaction();
        t.processTransaction();
        System.out.println("Processed Status: " + t.getStatus());
        System.out.println(t.isHighValueTransaction(21));
    }
}
