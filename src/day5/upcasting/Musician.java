package day5.upcasting;

public class Musician {

	public void play(Instrument i){
		if (i instanceof Flute) {
			Flute f = (Flute) i;
			f.test();
		}
		i.sound();
	}

}
