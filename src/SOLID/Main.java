package SOLID;

public class Main {
    public static void main(String[] args) {
        CreditCard cc1 = new Amex(new SameWalletRefund());
    }
}
