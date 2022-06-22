package src;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class temperature {

    public static void main(String[] args) throws FileNotFoundException {

	File file = new File("temp.txt");
	Scanner input = new Scanner(file);

	String data = input.nextLine();
	//System.out.println(data);

	int lastIndex = data.indexOf("temp");
	//System.out.println(lastIndex);


	String temp = data.substring(lastIndex + 6, lastIndex + 12);
	temp = temp.substring(0, temp.indexOf("."));

	double t = Double.valueOf(temp);
	t = (t - 273) * 1.8 + 32;
	temp = String.valueOf(t);
	temp = temp.substring(0, temp.indexOf("."));
	System.out.println("\n" + temp + " degrees");
	
	input.close();	
    }
}
