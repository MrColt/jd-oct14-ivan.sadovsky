package day9.adapterpattern;

public class AdapterByObject implements Target {

	private Adaptee adaptee;
	
	public AdapterByObject() {
		adaptee = new Adaptee();
	}

	@Override
	public String newRequest() {
		// TODO Auto-generated method stub
		return adaptee.oldRequest();
	}
}
