import java.util.Date;

public class CreditCardPaymentStratergy implements PaymentStratergy{

    private String creditCardName;
    private Date creditCardDate;

    public CreditCardPaymentStratergy(String creditCardName, Date creditCardDate) {
        this.creditCardName = creditCardName;
        this.creditCardDate = creditCardDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Amount debited via credit card of - " + amount);
    }
}
