import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyCharge;
    private int daysAdmitted;
    private List<String> records = new ArrayList<>();

    public InPatient(int patientId, String name, int age, double dailyCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return dailyCharge * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return records;
    }

    @Override
    public void getPatientDetails() {
        super.getPatientDetails();
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Daily Charge: " + dailyCharge);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return records;
    }

    @Override
    public void getPatientDetails() {
        super.getPatientDetails();
        System.out.println("Consultation Fee: " + consultationFee);
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        InPatient inpatient = new InPatient(101, "Ram Sharma", 45, 2000, 5);
        OutPatient outpatient = new OutPatient(102, "Ankur Jain", 30, 500);

        inpatient.addRecord("Admitted for surgery");
        inpatient.addRecord("Underwent knee replacement");
        outpatient.addRecord("Consulted for fever");

        processPatient(inpatient);
        processPatient(outpatient);
    }

    public static void processPatient(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Total Bill: " + patient.calculateBill());

        if (patient instanceof MedicalRecord) {
            MedicalRecord medicalRecord = (MedicalRecord) patient;
            System.out.println("Medical Records: " + medicalRecord.viewRecords());
        }
        System.out.println();
    }

}