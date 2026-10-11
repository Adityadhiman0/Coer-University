public class PatientBill {
    private String patientName;
    private double consultationFee;
    private double medicineFee;
    private double roomFee;

    public PatientBill(String patientName) {
        this.patientName = patientName;
        this.consultationFee = 0;
        this.medicineFee = 0;
        this.roomFee = 0;
    }

    // Setters are the only way to set each private fee
    public void setConsultationFee(double consultationFee) {
        this.consultationFee = (consultationFee >= 0) ? consultationFee : 0;
    }

    public void setMedicineFee(double medicineFee) {
        this.medicineFee = (medicineFee >= 0) ? medicineFee : 0;
    }

    public void setRoomFee(double roomFee) {
        this.roomFee = (roomFee >= 0) ? roomFee : 0;
    }

    // Total calculation lives here, not in main
    public double calculateTotal() {
        return consultationFee + medicineFee + roomFee;
    }

    public void display() {
        System.out.println("Bill for: " + patientName);
        System.out.println("  Consultation Fee : " + consultationFee);
        System.out.println("  Medicine Fee     : " + medicineFee);
        System.out.println("  Room Fee         : " + roomFee);
        System.out.println("  Total Bill       : " + calculateTotal());
    }
}
