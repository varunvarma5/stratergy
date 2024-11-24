public class PayPalPaymentStratergy implements PaymentStratergy{

    private String PaypalId;

    public PayPalPaymentStratergy(String paypalId) {
        PaypalId = paypalId;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paypal transaction done" + amount);
    }
}
