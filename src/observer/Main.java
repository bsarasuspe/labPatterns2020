package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import factory.PacientSymptomGUI;

public class Main {

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		Observable pacient=new Covid19Pacient("aitor", 35);
		PacientObserverGUI pacientGUI= new PacientObserverGUI (pacient);
		PacientSymptomGUI frame = new PacientSymptomGUI ((Covid19Pacient) pacient);
		PacientThermometerGUI termometroa = new PacientThermometerGUI(pacient);
		
		Observable zapato=new Covid19Pacient("zapato", 20);
		PacientObserverGUI pacientGUI2= new PacientObserverGUI (zapato);
		PacientSymptomGUI frame2 = new PacientSymptomGUI ((Covid19Pacient) zapato);
		PacientThermometerGUI termometroa2 = new PacientThermometerGUI(zapato);
		
		Observable alfredo=new Covid19Pacient("alfredo", 20);
		PacientObserverGUI pacientGUI3= new PacientObserverGUI (alfredo);
		PacientSymptomGUI frame3 = new PacientSymptomGUI ((Covid19Pacient) alfredo);
		PacientThermometerGUI termometroa3 = new PacientThermometerGUI(alfredo);
	}


}
