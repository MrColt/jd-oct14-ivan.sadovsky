package day4.InfoTank.GetterSetter;

public class Launcher {

	public static void main(String[] args) {

		Tank[] t = new Tank[3];
		t[0] = new Tank();
		t[1] = new Tank("white", 4, 150);
		t[2] = new Tank("green", 3, 100);

		printTankInfo(t);

	}

	public static void printTankInfo(Tank tank[]) {

		for (Tank t : tank) {

			System.out.println("Tank [" + "Color : " + t.getColor() + ", Crew : "
					+ t.getCrew() + ", MaxSpeed : " + t.getMaxSpeed() + "]");

		}

	}

}
