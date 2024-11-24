import java.sql.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PaymentStratergy ps = new CreditCardPaymentStratergy("SBI", Date.valueOf(LocalDate.now()));
        PaymentStratergy ps1 = new PayPalPaymentStratergy("12345");

        User u = new User(ps);
        User u1 = new User(ps1);

        u.processPayment(1000.10);
        u1.processPayment(100);

    }
}
