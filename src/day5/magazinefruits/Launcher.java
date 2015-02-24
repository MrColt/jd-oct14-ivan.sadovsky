package day5.magazinefruits;

import java.io.IOException;

import day5.magazinefruits.fruits.Denomination;
import day5.magazinefruits.fruits.Fruit;
import day5.magazinefruits.service.AddingFruitToStorage;
import day5.magazinefruits.workwithshop.Shop;

public class Launcher {

    public static void main(String[] args) throws IOException {
    	
        Shop shop = new Shop();
        
        AddingFruitToStorage adding = new AddingFruitToStorage(shop);
        
        UserInterface shopUI = new UserInterface(shop);
        
    }

}
