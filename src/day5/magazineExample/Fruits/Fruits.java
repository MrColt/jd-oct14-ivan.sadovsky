package day5.magazineExample.Fruits;

import day5.magazineExample.namesandtypes.Names;
import day5.magazineExample.namesandtypes.brands.AppleBrand;
import day5.magazineExample.namesandtypes.brands.BananaBrand;
import day5.magazineExample.namesandtypes.brands.MandarinBrand;
import day5.magazineExample.namesandtypes.brands.OrangeBrand;
import day5.magazineExample.namesandtypes.brands.PearBrand;

public class Fruits {
	
	private Names name;
	private AppleBrand appleBrand;
	private BananaBrand bananaBrand;
	private MandarinBrand mandarinBrand;
	private OrangeBrand orangeBrand;
	private PearBrand pearBrand;
	
	private double price;
	
	public Fruits(Names name, double price) {
		this.name = name;
		if (name.getId() == 0 || appleBrand.getId() == 0) {
			this.appleBrand = AppleBrand.ANTONOVKA;
		} else if (name.getId() == 0 || appleBrand.getId() == 1) {
			this.appleBrand = AppleBrand.FUJI;
		} else if (name.getId() == 0 || appleBrand.getId() == 2) {
			this.appleBrand = AppleBrand.GALA;
		} else if (name.getId() == 0 || appleBrand.getId() == 3) {
			this.appleBrand = AppleBrand.GOLDEN_DELICIOUS;
		} else if (name.getId() == 0 || appleBrand.getId() == 4) {
			this.appleBrand = AppleBrand.MCINTOSH;
		} else if (name.getId() == 1 || bananaBrand.getId() == 0) {
			this.bananaBrand = BananaBrand.BARRO;
		} else if (name.getId() == 1 || bananaBrand.getId() == 1) {
			this.bananaBrand = BananaBrand.CAVENDISH;
		} else if (name.getId() == 1 || bananaBrand.getId() == 2) {
			this.bananaBrand = BananaBrand.MANSANO;
		} else if (name.getId() == 1 || bananaBrand.getId() == 3) {
			this.bananaBrand = BananaBrand.PLANTAIN;
		} else if (name.getId() == 2 || mandarinBrand.getId() == 0) {
			this.mandarinBrand = MandarinBrand.FAIRCHILD;
		} else if (name.getId() == 2 || mandarinBrand.getId() == 1) {
			this.mandarinBrand = MandarinBrand.CLEMENTINE;
		} else if (name.getId() == 2 || mandarinBrand.getId() == 2) {
			this.mandarinBrand = MandarinBrand.SUNBURST;
		} else if (name.getId() == 2 || mandarinBrand.getId() == 3) {
			this.mandarinBrand = MandarinBrand.ROBINSON;
		} else if (name.getId() == 2 || mandarinBrand.getId() == 4) {
			this.mandarinBrand = MandarinBrand.DANCY;
		} else if (name.getId() == 3 || orangeBrand.getId() == 0) {
			this.orangeBrand = OrangeBrand.WASHINGTON_NAVEL;
		} else if (name.getId() == 3 || orangeBrand.getId() == 1) {
			this.orangeBrand = OrangeBrand.VALENCIA;
		} else if (name.getId() == 3 || orangeBrand.getId() == 2) {
			this.orangeBrand = OrangeBrand.BLONDO_COMMUNE;
		} else if (name.getId() == 3 || orangeBrand.getId() == 3) {
			this.orangeBrand = OrangeBrand.OVALE;
		} else if (name.getId() == 3 || orangeBrand.getId() == 4) {
			this.orangeBrand = OrangeBrand.TALOCCO;
		} else if (name.getId() == 4 ||pearBrand.getId() == 0) {
			this.pearBrand = PearBrand.AVGUSTINKA;
		} else if (name.getId() == 4 || pearBrand.getId() == 1) {
			this.pearBrand = PearBrand.BELOLISTKA;
		} else if (name.getId() == 4 || pearBrand.getId() == 2) {
			this.pearBrand = PearBrand.LADA;
		} else if (name.getId() == 4 || pearBrand.getId() == 3) {
			this.pearBrand = PearBrand.LEVEN;
		} else if (name.getId() == 4 || pearBrand.getId() == 4) {
			this.pearBrand = PearBrand.SEN_GERMEN;
		} else System.err.println("INVALID NAME OF FRUIT");
			
		this.price = price;
	}

	public Names getName() {
		return name;
	}

	public AppleBrand getAppleBrand() {
		return appleBrand;
	}

	public BananaBrand getBananaBrand() {
		return bananaBrand;
	}

	public MandarinBrand getMandarinBrand() {
		return mandarinBrand;
	}

	public OrangeBrand getOrangeBrand() {
		return orangeBrand;
	}

	public PearBrand getPearBrand() {
		return pearBrand;
	}

	public double getPrice() {
		return price;
	}
	
	
}
