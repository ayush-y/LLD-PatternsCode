package SOLID;

public class MatserCard extends CreditCard implements RefundCompatibleCC {
    public RefundLogic refundAlgorithm;
    public MatserCard(  RefundLogic refundAlgorithm) {
        this.refundAlgorithm = refundAlgorithm;
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Master card swipe and pay");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Master card online payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Master card tap and pay");
    }
    @Override
    public void refundAmount() {
        refundAlgorithm.doRefund();
    }
}
