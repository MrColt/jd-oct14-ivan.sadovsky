package day9.adapterpattern;

public class AdapterByClass extends Adaptee implements Target {

	@Override
	public String newRequest() {
		// TODO Auto-generated method stub
		return oldRequest();
	}

}
