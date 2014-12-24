package day3;

public class populationMassiveX2 {

	public static void main(String[] args) {
		
		String [][] data = {
				{"China", "Peking", "1354040000"},
				{"India", "New Delhi", "1210569573"},
				{"USA", "Washington D.C.", "31630500"},
				{"Indonesia", "Jakarta", "237641326"},
				{"Brazil", "Brasilia", "193946886"},
				{"Pakistan", "Islamabad", "183748060"}
		};
		
		System.out.println(getPopulation(data));
	}
	
	static long getPopulation (String [][] data) {
		long population = 0;
		for ( int i = 0; i < data.length; i++) {
			population += Long.parseLong(data[i][2]);
		}
		
		return population;
	}	
}	

