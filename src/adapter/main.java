package adapter;

import java.util.Iterator;

import domain.Covid19Pacient;
import domain.Symptom;

public class main {

	public static void main(String[] args) {
		
		InvertedIterator symtomName;
		InvertedIterator severityIndex;
		
		
		Covid19Pacient p1 = new Covid19Pacient("Pedro", 30);
		p1.addSymptomByName("fiebre", 5);
		p1.addSymptomByName("tos seca", 5);
		p1.addSymptomByName("disnea", 3);
		p1.addSymptomByName("diarrea", 1);
		p1.addSymptomByName("hemoptisis", 1);

		AdapterPacient adapter = new AdapterPacient(p1);
		
		
		InvertedIterator izenak=new IzenakInvertedIterator(adapter.getIzenak());
		InvertedIterator severity=new SeverityInvertedIterator(adapter.getSeverity());
		SymptomNameComparator<Object> comparatorIzenak=new SymptomNameComparator<Object>();
		SeverityIndexComparator<Object> comparatorSeverity=new SeverityIndexComparator<Object>();
		
		Sorting s1=new Sorting();
		s1.sortedIterator(izenak, comparatorIzenak);
		
		s1.sortedIterator(severity, comparatorSeverity);
		
		/*
		Iterator i=p1.iterator();
		while(i.hasNext())
			System.out.println(i.next());*/
		
		
	}

}
