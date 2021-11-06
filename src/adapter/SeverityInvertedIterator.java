package adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.Symptom;

public class SeverityInvertedIterator implements InvertedIterator{
	
	ArrayList<Integer> severity;
	int position=0;
	
	public SeverityInvertedIterator(ArrayList<Integer> severity) {
		this.severity=severity;
		position=severity.size();
	}
	
	@Override
	public Object previous() {
		position--;
		return severity.get(position);
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
		position=severity.size();
	}

}
