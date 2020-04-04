import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.net.*;

public class Main{


  public static void main(String[] args){
	Inputsteam in = new URL("https://opendata.ecdc.europa.eu/covid19/casedistribution/csv").openStream();
	Files.copy(in, Paths.get(data.txt), StandardCopyOption.REPLACE_EXISTING);


  }

  public static ArrayList<String> readFile(File file){

    ArrayList<String> all = new ArrayList<String>();
    try{
    Scanner sc = new Scanner(file);
    while(sc.hasNext()){

    }
    }catch (Exception e) {
    System.out.println("fel");
  }
    return all;
  }

}
