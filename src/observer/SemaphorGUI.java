package observer;

import java.awt.Color;
import java.awt.Frame;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import domain.Covid19Pacient;


public class SemaphorGUI extends JFrame implements Observer {
	/** stores the associated ConcreteSubject */
	public SemaphorGUI (Observable obs) {
		setSize(100, 100);
		setLocation(350,10);
		Color c=Color.green;
		getContentPane().setBackground(c);
		repaint();
		setVisible(true);
		
		obs.addObserver(this);
	}
	
	public void update(Observable	o,	Object	obj)	{
		Covid19Pacient	p=(Covid19Pacient)o;
		//			Obtain	the		current covidImpact	to	paint
		int farenheit =	(int)	p.covidImpact();	
		//			temperature	gauge	update
		koloreaAldatu(farenheit);
		
	}
	
	public void koloreaAldatu(int farenheit) {
		if(farenheit<5) 
		{
			Color c=Color.green;
			getContentPane().setBackground(c);
			repaint();
		}
		else if(farenheit>=5 && farenheit<10 ) {
			Color c=Color.yellow;
			getContentPane().setBackground(c);
			repaint();
		}
		else {
			Color c=Color.red;
			getContentPane().setBackground(c);
			repaint();
		}
		
	}
}     


