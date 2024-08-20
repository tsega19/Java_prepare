package Advance;

import java.util.UUID;

public abstract class Payments {
    UUID paymentID;
     double amount;
     String status;

    public Payments(UUID paymentID, double amount, String status) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.status = status;
    }

    public UUID getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(UUID paymentID) {
        this.paymentID = paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract void processPayment();
    public abstract  void displayPaymentDetails();

}
class  CreditCarPayment extends Payments{
    int cardNumber;
    String cardHolderName;

    public CreditCarPayment(int cardNumbers, String cardHolderNames, UUID paymentID, double amount, String status) {
        super(paymentID, amount, status);
        cardNumber = cardNumbers;
        cardHolderName =cardHolderNames;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void processPayment() {
    }
    @Override
    public void displayPaymentDetails() {
    }
}
class PayPalPayment extends CreditCarPayment{
    String email;
    public PayPalPayment(String email, int cardNumbers, String cardHolderNames, UUID paymentID, double amount, String status) {
        super(cardNumbers, cardHolderNames, paymentID, amount, status);
        this.email = String.valueOf(email);
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public void displayPaymentDetails() {
        System.out.println("UUID: " + paymentID);
        System.out.println("Amount: "+ amount);
        System.out.println("Status: "+ status);
        System.out.println("Email: "+ email);
        System.out.println("Card Number: "+ cardNumber);
        System.out.println("Card Holder Name: "+ cardHolderName);
    }

    public static void main(String[] args) {
        UUID paymentID = UUID.randomUUID();
        double amonut = 12.4;
        String status = "Pending";
        String email = "admin@gmail.com";
        int cardNumber = 1223;
        String chName = "Amen";
        Payments p =new PayPalPayment(email,cardNumber,chName,paymentID, amonut, status);
        p.displayPaymentDetails();
    }
}