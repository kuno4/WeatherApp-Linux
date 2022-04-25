import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class humidity {
    
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("temp.txt");
	    Scanner input = new Scanner(file);

	    String data = input.nextLine();

    	int lastIndex = data.indexOf("humid");

	    String hum = data.substring(lastIndex + 10, lastIndex + 12);
	    //temp = temp.substring(0, temp.indexOf("."));

        System.out.println("Humidity: " + hum + "%");
        input.close();
    }
}
