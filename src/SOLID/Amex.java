package SOLID;

public class Amex extends CreditCard implements RefundCompatibleCC {

    public RefundLogic refundAlgorithm;
    public Amex(SameWalletRefund sameWalletRefund) {
        this.refundAlgorithm = new SameWalletRefund()  ;
    }
    @Override
    public void swipeAndPay() {
        System.out.println("Amex card swipe and pay");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Amex card online payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Amex card tap and pay");
    }
    @Override
    public void refundAmount() {
        refundAlgorithm.doRefund();
    }
}
