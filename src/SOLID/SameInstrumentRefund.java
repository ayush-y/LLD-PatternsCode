package SOLID;

public class SameInstrumentRefund implements RefundLogic {
    @Override
    public void doRefund() {
        System.out.println("Same instrument refund");
    }


}
