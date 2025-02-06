import java.util.ArrayList;
class Hospital {
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
}

class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        System.out.println(name + " is consulting " + patient.getName());
    }

    public String getName() {
        return name;
    }
}

class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void consultWithDoctor(Doctor doctor) {
        doctor.consult(this);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        
        Doctor doctor1 = new Doctor("Dr. Smith");
        Doctor doctor2 = new Doctor("Dr. Brown");
        
        Patient patient1 = new Patient("John Doe");
        Patient patient2 = new Patient("Jane Doe");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        patient1.consultWithDoctor(doctor1);
        patient2.consultWithDoctor(doctor2);
        patient1.consultWithDoctor(doctor2);
    }
}
