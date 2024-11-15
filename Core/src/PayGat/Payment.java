package PayGat;
import java.util.Date;
import java.util.UUID;
public class Payment {
    UUID paymentID;
    double amount;
    String currency;
    Date LocalDate;
    public Payment(UUID id, double amounts, String currency, Date LocalDate){
        paymentID = id;
        amount = amounts;
        this.currency =currency;
        this.LocalDate = LocalDate;
    }
    public void setPaymentID(UUID paymentID){
        this.paymentID = paymentID;
    }
    public UUID getPaymentID(){
        return  paymentID;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return currency;
    }
    public double getAmount(){
        return amount;
    }
    public void setLocalDate(Date localDate) {
        LocalDate = localDate;
    }
    public Date getLocalDate() {
        return LocalDate;
    }
    public double conversionRate(double  rate){
        return  rate*amount;
    }
    public void displayPayment(){
        System.out.println("ID "+ paymentID);
        System.out.println("Amount "+ amount);
        System.out.println("Currency "+ currency);
        System.out.println("Payment Date "+ LocalDate);
    }
    public static void main(String[] args) {
      UUID paymentId = UUID.randomUUID();
      double amount = 21.2;
      @SuppressWarnings("deprecation")
    Date paymentDate = new Date(2024-1900, 0,1);
      Payment p = new Payment(paymentId, amount, "USD", paymentDate);

    p.displayPayment();
    double exchange = p.conversionRate(0.91);
    System.out.println("Converted Amount (USD to EUR):  "+ exchange);
    }

}
