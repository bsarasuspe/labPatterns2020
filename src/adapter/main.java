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

		
		Iterator i=p1.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		
	}

}
