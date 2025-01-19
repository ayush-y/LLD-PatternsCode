package SOLID;

public class Visa extends CreditCard implements RefundCompatibleCC {
    public RefundLogic refundAlgorithm;
    public Visa(SameInstrumentRefund sameInstrumentRefund) {
        this.refundAlgorithm = new SameInstrumentRefund();
    }
    @Override
    public void swipeAndPay() {
        System.out.println("Visa card swipe and pay");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Visa card online payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Visa card tap and pay");
    }
    @Override
    public void refundAmount() {
        refundAlgorithm.doRefund();
    }
}
