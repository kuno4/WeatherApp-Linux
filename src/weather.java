package src;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class weather {

    public static void main(String[] args) throws FileNotFoundException {

	File file = new File("temp.txt");
	Scanner input = new Scanner(file);

	String data = input.nextLine();
	//System.out.println(data);

	int lastIndex = data.indexOf("description");
	//System.out.println(lastIndex);


	String temp = data.substring(lastIndex + 14, lastIndex + 40);
	//System.out.println(temp);

	//temp = temp.substring(0, 5);
	temp = temp.substring(0, temp.indexOf("\""));
	temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);

	System.out.println(temp);

	input.close();	
    }
}
