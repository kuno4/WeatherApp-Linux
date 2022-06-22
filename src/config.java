package src;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class config {

    public static void main(String[] args) throws IOException {

        File file = new File("weather.config");
        Scanner input = new Scanner(file);
        String latitude = "";
        String longitude = "";
        String key = "";

        latitude = input.nextLine();
        latitude = input.next();
	    longitude = input.next();
        key = input.next();

        FileWriter latw = new FileWriter("lat.txt");
        FileWriter lonw = new FileWriter("lon.txt");
        FileWriter apiw = new FileWriter("api.txt");

        latw.write(latitude);
        latw.close();

        lonw.write(longitude);
        lonw.close();

        apiw.write(key);
        apiw.close();

        input.close();
    }
}
