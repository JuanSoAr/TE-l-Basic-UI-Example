package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lector {

    public ArrayList<String> leer(String ruta){
        ArrayList<String> arrayList = new ArrayList<>();
        String filename = "ejemplo.csv";
        File file = new File(ruta);
        Scanner inputStream;

        {
            try {
                inputStream = new Scanner(file);
                while(inputStream.hasNext()){
                    String data = inputStream.next();
                    arrayList.add(data);
                }
                inputStream.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }


}
