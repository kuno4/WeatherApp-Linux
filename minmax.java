import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class minmax {

    public static void main(String[] args) throws FileNotFoundException {

	File file = new File("temp.txt");
	Scanner input = new Scanner(file);

	String data = input.nextLine();

	int min = data.indexOf("temp_min");
    int max = data.indexOf("temp_max");

	String mintemp = data.substring(min + 10, min + 20);
    String maxtemp = data.substring(max + 10, max + 20);
	//System.out.println(temp);
	mintemp = mintemp.substring(0, mintemp.indexOf("."));
    maxtemp = maxtemp.substring(0, maxtemp.indexOf("."));

    double mint = Double.valueOf(mintemp);
    double maxt = Double.valueOf(maxtemp);

    mint = (mint - 273) * 1.8 + 32;
    maxt = (maxt - 273) * 1.8 + 32;

    mintemp = String.valueOf(mint);
    maxtemp = String.valueOf(maxt);

    mintemp = mintemp.substring(0, mintemp.indexOf("."));
    maxtemp = maxtemp.substring(0, maxtemp.indexOf("."));

	System.out.println("\nLow of " + mintemp + " degrees");
    System.out.println("High of " + maxtemp + " degrees");
	
	input.close();	
    }
}
