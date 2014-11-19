package day5.delegation;

import day5.upcasting.Flute;
import day5.upcasting.Instrument;

public class Person {
	
	private Instrument instrument;
	
	public Person() {
		instrument = new Flute();
		
	}
	
	public void makeNoise() {
		instrument.sound();
	}

}
