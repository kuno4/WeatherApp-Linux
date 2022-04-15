import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class weather {

    public static void main(String[] args) throws FileNotFoundException {

	File file = new File("temp.txt");
	Scanner input = new Scanner(file);

	String data = input.nextLine();
	//System.out.println(data);

	int lastIndex = data.indexOf("main");
	//System.out.println(lastIndex);


	String temp = data.substring(lastIndex + 7, lastIndex + 20);
	//System.out.println(temp);

	//temp = temp.substring(0, 5);
	System.out.println(temp.substring(0, temp.indexOf("\"")));
	
	input.close();	
    }
}
