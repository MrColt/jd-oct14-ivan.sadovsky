package day9.publish_subscribe_barrel_10;

public interface Subject {

	public void addObserver( Observer o);
	public void removeObserver( Observer o);
	public void notifyObservers();
}
