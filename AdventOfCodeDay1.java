import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdventOfCodeDay1 {
    public static void main(String[] arg) throws IOException{
            
        // list that holds string of a file
        List<String> listOfNumbers = new ArrayList<String>();

        // load data from file
        BufferedReader dataReader = new BufferedReader(new FileReader("C:\\Users\\Quincy Elliott\\gitRepos\\Code\\TextNumDoc.txt"));
        
        // read entir line as string
        String numberReader = dataReader.readLine();

        // checking for end of file
        while ((numberReader = dataReader.readLine()) != null) {
            listOfNumbers.add(numberReader);
        }
            
        // closing bufferreader object
        dataReader.close();

        // Storing the data in arraylist to array
        String[] array = listOfNumbers.toArray(new String[0]);

        // Printing each line of file which is stored in array
        for (String str : array) {

            System.out.println(str);

            String text = str;
            String letter = text.replaceAll("[A-Za-z]","");
            String num = text.replaceAll("[0-9]","");
            System.out.println(letter);
            System.out.println(num);
        }
    }
}