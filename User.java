public class User {

    //we are injecting an interface not clas
    private PaymentStratergy ps;

    //Constructor injection
    public User(PaymentStratergy ps) {
        this.ps = ps;
    }

    public void processPayment(double amount){
        ps.pay(amount);
    }
}
