package ua.lviv.iot.manager;


import ua.lviv.iot.models.BreadBins;
import ua.lviv.iot.models.FoodContainers;
import ua.lviv.iot.models.GoodsInfo;
import ua.lviv.iot.models.Thermoses;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.io.FileWriter;;
import java.io.IOException;

import java.util.ArrayList;

public class Writer {
    public static void writeCSV() throws IOException {
        try (FileWriter writer = new FileWriter("src/main/resources/result.csv")) {
            String previousClassName = "";
            ArrayList<GoodsInfo> goods = new ArrayList<>();
            goods.add(new Thermoses("Aurum", 2, "Blue"));
            goods.add(new FoodContainers("Steel", 3, "Aqua"));
            goods.add(new BreadBins("Gold", 1, "Red"));
            for (var good : goods) {
                if (!good.getClass().getSimpleName().equals(previousClassName)) {
                    writer.write(good.getHeader());
                    writer.write("\r\n");
                    previousClassName = good.getClass().getSimpleName();
                }

                writer.write(good.toCSV());
                writer.write("\r\n");


            }
        }
    }
}

