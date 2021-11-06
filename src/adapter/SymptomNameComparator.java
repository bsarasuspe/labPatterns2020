package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SymptomNameComparator<Object> implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Symptom d1=(Symptom) o1;
		Symptom d2=(Symptom) o2;
		
		int comparison = d1.getName().compareTo(d2.getName());
		
		return comparison;
	}

}
