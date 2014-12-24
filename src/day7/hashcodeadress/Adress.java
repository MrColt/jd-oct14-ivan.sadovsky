package day7.hashcodeadress;

public class Adress {

	private String city;
	private String street;
	private int house;

	public Adress(String city, String street, int house) {
		if (city == null || street == null || house <= 0) {
			throw new IllegalStateException("Empty parameters or (house) < 0");
		}
		this.city = city;
		this.street = street;
		this.house = house;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Adress) {
			Adress adr = (Adress) obj;
			if (city.equals(adr.getCity()) && street.equals(adr.getStreet())
					&& house == adr.getHouse()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		int result = 25;
		result = 37 * result * city.hashCode();
		result = 37 * result * street.hashCode();
		result = 37 * result * house;
		return result;
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	public int getHouse() {
		return house;
	}

}
