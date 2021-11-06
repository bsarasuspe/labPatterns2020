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
		
		SymptomNameComparator<Object> comparatorIzenak=new SymptomNameComparator<Object>();
		SeverityIndexComparator<Object> comparatorSeverity=new SeverityIndexComparator<Object>();
		SymptomInvertedIterator sintomak=new SymptomInvertedIterator(adapter.getSintomak());
		
		Sorting s1=new Sorting();


		Iterator i1=s1.sortedIterator(sintomak, comparatorIzenak);
		while(i1.hasNext())
			System.out.println(i1.next());
		
		System.out.println();
		
		Iterator i2=s1.sortedIterator(sintomak, comparatorSeverity);
		while(i2.hasNext())
			System.out.println(i2.next());
		
		
	}

}
