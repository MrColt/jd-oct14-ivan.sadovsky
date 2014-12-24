package day4.Objects.InfoRoom;

public class InfoRoomPrint {

	public static void main(String[] args) {

		PrintNumberWalls();
		PrintColorofWalls();
		PrintHeight();
		width();
		length();
		square();
		balcony();
		TV();
		inhabitants();
		conditioning();
		lamp();
		lightbulb();
		doors();
		nameRoom();
		furniture();
		sofa();
		animals();
		ceiling();
		cabinet();
		mirror();
		eat();
		beds();
		writingDesk();
		chair();
		flooring();

	}

	static void PrintNumberWalls() {
		Room m = new Room();
		m.numberOfWalls = 4;
		System.out.println("numberOfWalls = " + m.numberOfWalls);
	}

	static void PrintColorofWalls() {
		Room m = new Room();
		m.colorOfWalls = "white";
		System.out.println("colorOfWalls = " + m.colorOfWalls);
	}

	static void PrintHeight() {
		Room m = new Room();
		m.height = 3;
		System.out.println("height = " + m.height);
	}

	static void width() {
		Room m = new Room();
		m.width = 10;
		System.out.println("width = " + m.width);
	}

	static void length() {
		Room m = new Room();
		m.length = 10;
		System.out.println("length = " + m.length);
	}

	static void square() {
		Room m = new Room();
		m.square = 30;
		System.out.println("square = " + m.square);
	}

	static void balcony() {
		Room m = new Room();
		m.havingBalcony = true;
		System.out.println("havingBalcony = " + m.havingBalcony);
	}

	static void TV() {
		Room m = new Room();
		m.havingTv = true;
		System.out.println("havingTv = " + m.havingTv);
	}

	static void inhabitants() {
		Room m = new Room();
		m.numberOfinhabitants = 4;
		System.out.println("numberOfinhabitants = " + m.numberOfinhabitants);
	}

	static void conditioning() {
		Room m = new Room();
		m.havingConditioning = true;
		System.out.println("havingConditioning = " + m.havingConditioning);
	}

	static void lamp() {
		Room m = new Room();
		m.havingLamp = true;
		System.out.println("havingLamp = " + m.havingLamp);
	}

	static void lightbulb() {
		Room m = new Room();
		m.numberOfLightbulb = 10;
		System.out.println("numberOfLightbulb = " + m.numberOfLightbulb);
	}

	static void doors() {
		Room m = new Room();
		m.numberOfDoors = 1;
		System.out.println("numberOfDoors = " + m.numberOfDoors);
	}

	static void writingDesk() {
		Room m = new Room();
		m.havingWritingDesk = true;
		System.out.println("havingWritingDesk = " + m.havingWritingDesk);
	}

	static void nameRoom() {
		Room m = new Room();
		m.nameOfRoom = "Livingroom";
		System.out.println("nameOfRoom = " + m.nameOfRoom);
	}

	static void furniture() {
		Room m = new Room();
		m.numberOfFurniture = 5;
		System.out.println("numberOfFurniture = " + m.numberOfFurniture);
	}

	static void sofa() {
		Room m = new Room();
		m.havingSofa = true;
		System.out.println("havingSofa = " + m.havingSofa);
	}

	static void chair() {
		Room m = new Room();
		m.havingChair = true;
		System.out.println("havingChair = " + m.havingChair);
	}

	static void animals() {
		Room m = new Room();
		m.havingAnimals = false;
		System.out.println("havingAnimals = " + m.havingAnimals);
	}

	static void flooring() {
		Room m = new Room();
		m.flooring = "Suspension";
		System.out.println("flooring = " + m.flooring);
	}

	static void ceiling() {
		Room m = new Room();
		m.typeCeiling = "Parquet";
		System.out.println("typeCeiling = " + m.typeCeiling);
	}

	static void cabinet() {
		Room m = new Room();
		m.havingCabinet = false;
		System.out.println("havingCabinet = " + m.havingCabinet);
	}

	static void mirror() {
		Room m = new Room();
		m.havingMirror = false;
		System.out.println("havingMirror = " + m.havingMirror);

	}

	static void eat() {
		Room m = new Room();
		m.permissionEat = false;
		System.out.println("permissionEat = " + m.permissionEat);
	}

	static void beds() {
		Room m = new Room();
		m.numberOfbeds = 5;
		System.out.println("numberOfbeds = " + m.numberOfbeds);

	}
}