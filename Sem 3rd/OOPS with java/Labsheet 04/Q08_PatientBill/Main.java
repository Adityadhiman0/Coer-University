public class Main {
    public static void main(String[] args) {
        PatientBill bill = new PatientBill("Vikram Rathore");
        bill.setConsultationFee(500);
        bill.setMedicineFee(850.50);
        bill.setRoomFee(2000);
        bill.display();
    }
}
