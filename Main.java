import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.net.*;

public class Main{



  public static void main(String[] args){
	//Inputsteam in = new URL("https://opendata.ecdc.europa.eu/covid19/casedistribution/csv").openStream();
	//Files.copy(in, Paths.get(data.txt), StandardCopyOption.REPLACE_EXISTING);

  ArrayList<countryStat> data = readFile();

  }

  public static ArrayList<countryStat> readFile(){
    ArrayList<countryStat> all = new ArrayList<countryStat>();
    try{
    File file = new File("data.txt");
    Scanner sc = new Scanner(file);

    String Name = "";
    countryStat cs = new countryStat("blabla");

    while(sc.hasNext()){
      if(Name != cs.countryName){
        all.add(cs);
        cs = new countryStat("blabla");
      }

      String s = sc.nextLine();
      String t = "";
      for(int i = 11; i<s.length();i++){
        t = t + s.charAt(i);
      }
      String[] array = t.split(",");
      Name= array[5];
      



    }
    }catch (Exception e) {
    System.out.println("fel");
  }
    return all;
  }

}
