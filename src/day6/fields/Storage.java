package day6.fields;

public class Storage {

	public static final String PRODUCER = "midgardabc";

	public String[] quotes;

	public Storage() {
		quotes = new String[] { "I've blablabla.", "Let us always blablabla." };
	}

	public void printQuotes() {
		for (String quote : quotes) {
			System.out.println(quote);
		}
	}

	public static String getProducer() {
		return PRODUCER;

	}
}
