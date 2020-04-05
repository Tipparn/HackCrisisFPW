import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;
import java.io.*;
import java.nio.file.*;
import java.net.*;

public class Main{



  public static void main(String[] args){
    try{InputStream in = new URL("https://opendata.ecdc.europa.eu/covid19/casedistribution/csv").openStream();
  //Files.copy(in, Paths.get("/data.txt"), StandardCopyOption.REPLACE_EXISTING);
  }
	catch(Exception e){System.out.println(e);}

  ArrayList<countryStat> data = readFile();

  }


  /* readFile läser allt som finns i data.txt och
     returnerar en arraylist<countryStat>    */
  public static ArrayList<countryStat> readFile(){
    ArrayList<countryStat> all = new ArrayList<countryStat>();
    try{
    File file = new File("data.txt");
    Scanner sc = new Scanner(file);

    String Name = "";
    countryStat cs = new countryStat("blabla");
    while(sc.hasNext()){

      if(Name.equals(cs.countryName)){
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

      cs.addinfo(array[0],array[1],array[2],array[3],array[4]); // <-- något konstigt
    }
    }catch (Exception e) {
    System.out.println("fel");
  }
    System.out.println(all);
    return all;
  }

}
