package adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.Symptom;

public class IzenakInvertedIterator implements InvertedIterator{
	
	ArrayList<String> izenak;
	int position=0;
	
	public IzenakInvertedIterator(ArrayList<String> izenak) {
		this.izenak=izenak;
		position=izenak.size();
	}
	
	@Override
	public Object previous() {
		position--;
		return izenak.get(position);
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
		position=izenak.size();
	}

}
