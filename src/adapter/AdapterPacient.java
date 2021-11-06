package adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import domain.Covid19Pacient;
import domain.Symptom;

public class AdapterPacient {

	private ArrayList<String> izenak = new ArrayList<String>();
	private ArrayList<Integer> severity = new ArrayList<Integer>();
	
	public AdapterPacient(Covid19Pacient pacient) {
		
		Set<Symptom> sympton=pacient.getSymptoms();
		izenak = new ArrayList<String>();
		severity = new ArrayList<Integer>();
		
		
		Iterator<Symptom> ite=sympton.iterator();
		while(ite.hasNext()) {
			izenak.add(ite.next().getName());
			severity.add(ite.next().getSeverityIndex());
		}
	}
	
	public ArrayList<String> getIzenak(){
		return izenak;
	}
	
	public ArrayList<Integer> getSeverity(){
		return severity;
	}
	
}
