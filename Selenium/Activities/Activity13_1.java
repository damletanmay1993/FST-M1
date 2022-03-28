import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Activity13_1 {

    public static void main(String[] args) throws IOException, CsvException {
        CSVReader reader = new CSVReader(new FileReader("C:\\Users\\0025QI744\\IdeaProjects\\Selenium_FST\\src\\test\\java\\test.csv"));
        List<String[]> list = reader.readAll();
        System.out.println("Total number of rows are: " + list.size());

        Iterator<String[]> itr = list.iterator();

        while(itr.hasNext()) {
            String[] str = itr.next();

            System.out.print("Values are: ");
            for(int i=0;i<str.length;i++) {
                System.out.print(" " + str[i]);
            }
            System.out.println(" ");
        }

        reader.close();


    }
}
