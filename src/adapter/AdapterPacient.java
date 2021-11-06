package adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import domain.Covid19Pacient;
import domain.Symptom;

public class AdapterPacient {

	private ArrayList<Symptom> sintomak = new ArrayList<Symptom>();
	
	
	public AdapterPacient(Covid19Pacient pacient) {
		
		Set<Symptom> sympton=pacient.getSymptoms();
		
		Iterator<Symptom> ite=sympton.iterator();
		while(ite.hasNext()) {
			Symptom aux=ite.next();
			sintomak.add(aux);
		}
	}
	
	public ArrayList<Symptom> getSintomak(){
		return sintomak;
	}
	

	
}
