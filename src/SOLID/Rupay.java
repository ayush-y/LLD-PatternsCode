package SOLID;

public class Rupay extends CreditCard implements RefundCompatibleCC {
    public RefundLogic refundAlgorithm;
    public Rupay(RefundLogic refundAlgorithm) {
        this.refundAlgorithm = refundAlgorithm;
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Rupay card swipe and pay");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Rupay card online payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Rupay card tap and pay");
    }

    @Override
    public void refundAmount() {
        refundAlgorithm.doRefund();
    }
}
