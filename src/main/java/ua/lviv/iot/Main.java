package ua.lviv.iot;
import ua.lviv.iot.manager.Text;
import ua.lviv.iot.manager.Writer;
import ua.lviv.iot.manager.Manager;
import ua.lviv.iot.models.BreadBins;
import ua.lviv.iot.models.FoodContainers;
import ua.lviv.iot.models.Thermoses;


import java.io.IOException;



public class Main {

    public static void main(String[] args) throws IOException {
        BreadBins bob1 = new BreadBins("Gold", 1, "Red");
        Thermoses bob2 = new Thermoses("Aurum", 2, "Blue");
        FoodContainers bob3 = new FoodContainers("Steel", 3, "Aqua");

        Manager manager = new Manager();

        manager.addGoods(bob1);
        manager.addGoods(bob2);
        manager.addGoods(bob3);

        System.out.println(manager.sortByColour(true));
        System.out.println(manager.sortByWeight(true));
        System.out.println(manager.findByMaterial("Aurum"));


        Writer.writeCSV();
        Text text = new Text();
        text.deleteWordsWithDigitsNumberLessThen5("b12345b aa1234c Ab4714EX bas1-2-3-4-5bas Adfda12-47-56basdA");


    }
}

