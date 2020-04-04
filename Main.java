import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main{


  public static void main(String[] args){
	Inputsteam in = new URL("https://opendata.ecdc.europa.eu/covid19/casedistribution/csv").openStream();
	Files.copy(in, Paths.get(data.txt), StandardCopyOption.REPLACE_EXISTING);


  }

  public static ArrayList<countryStat> readFile(File file){
    Scanner sc = new Scanner(file);
    ArrayList<countryStat> all = new ArrayList<countryStat>();

    while(sc.hasNext()){

    }
    return all;
  }

}
