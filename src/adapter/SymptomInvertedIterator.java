package adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.Symptom;

public class SymptomInvertedIterator implements InvertedIterator{
	
	ArrayList<Symptom> sintomak;
	int position=0;
	
	public SymptomInvertedIterator(ArrayList<Symptom> sintomak) {
		this.sintomak=sintomak;
		position=sintomak.size();
	}
	
	@Override
	public Object previous() {
		position--;
		return sintomak.get(position);
	}

	@Override
	public boolean hasPrevious() {
		
		if(position-1>=0) {
			return true;
		}
		return false;
	}

	@Override
	public void goLast() {
		position=sintomak.size();
	}

}
