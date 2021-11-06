package adapter;

import java.util.Comparator;

import domain.Symptom;

import java.lang.*;

public class SeverityIndexComparator<Object> implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		
		Symptom d1=(Symptom) o1;
		Symptom d2=(Symptom) o2;
		
		if(d1.getSeverityIndex()<d2.getSeverityIndex()) 
			return -1;
		else if(d1.getSeverityIndex()>d2.getSeverityIndex())
			return 1;
		else
			return 0;
	}

}
