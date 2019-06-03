package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	public void addPatient(Patient patient) {
		patients.add(patient);
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public List<Doctor> getDoctors() {
		return doctors;
	}
	public void assignPatientsToDoctors() {
		int doctorNumber = 0;
		for (int i = 0; i < patients.size(); i++) {
			try {
				doctors.get(doctorNumber).assignPatient(patients.get(i));
			} catch (DoctorFullException e) {
				doctorNumber++;
				i--;
			}
		}
	}

}
