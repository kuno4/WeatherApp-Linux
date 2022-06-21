import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class air {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("air.txt");
	    Scanner input = new Scanner(file);

	    String data = input.nextLine();

    	int o3 = data.indexOf("o3");
        int pm25 = data.indexOf("pm2_5");
        int pm10 = data.indexOf("pm10");
        int no2 = data.indexOf("no2");
        int so2 = data.indexOf("so2");

	    String ozone = data.substring(o3 + 4, o3 + 14);
        String part25 = data.substring(pm25 + 7, pm25 + 16);
        String part10 = data.substring(pm10 + 6, pm10 + 16);
        String nitrodiox = data.substring(no2 + 5, no2 + 15);
        String sulfordiox = data.substring(so2 + 5, so2 + 15);

        ozone = ozone.substring(0, ozone.indexOf(","));
        part25 = part25.substring(0, part25.indexOf(","));
        part10 = part10.substring(0, part10.indexOf(","));
        nitrodiox = nitrodiox.substring(0, nitrodiox.indexOf(","));
        sulfordiox = sulfordiox.substring(0, sulfordiox.indexOf(","));
	    //temp = temp.substring(0, temp.indexOf("."));

        System.out.println("O3: " + ozone + " ppb");
        System.out.println("PM2.5: " + part25 + " µg/m3");
        System.out.println("PM10: " + part10 + " µg/m3");
        System.out.println("NO2: " + nitrodiox + " ppb");
        System.out.println("SO2: " + sulfordiox + " ppb");
        input.close();
    }

}
