import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.net.*;

public class Main{



  public static void main(String[] args){
<<<<<<< HEAD
  Display d = new Display();

	//Inputsteam in = new URL("https://opendata.ecdc.europa.eu/covid19/casedistribution/csv").openStream();
	//Files.copy(in, Paths.get(data.txt), StandardCopyOption.REPLACE_EXISTING);
=======
    try{InputStream in = new URL("https://opendata.ecdc.europa.eu/covid19/casedistribution/csv").openStream();
  //Files.copy(in, Paths.get("/data.txt"), StandardCopyOption.REPLACE_EXISTING);
  }
	catch(Exception e){System.out.println(e);}

>>>>>>> 4996fa3f04800f62eeec2fc9756fe2455fbd2bbc

  ArrayList<countryStat> data = readFile();

  }


  /* readFile läser allt som finns i data.txt och
     returnerar en arraylist<countryStat>    */
  public static ArrayList<countryStat> readFile(){
    ArrayList<countryStat> all = new ArrayList<countryStat>();
    try{
    File file = new File("data.txt");
    Scanner sc = new Scanner(file);
    sc.nextLine();
    String Name = "";
    countryStat cs = new countryStat("blabla");
    while(sc.hasNext()){

      if(!Name.equals(cs.countryName)){
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
      int[] intarray = new int[5];
      for(int i = 0; i<5; i++){
        intarray[i] = Integer.parseInt(array[i]);
      }
      System.out.println(""+intarray[0]  +intarray[1] +intarray[2]  +intarray[3]  +intarray[4]);

      System.out.println(456);
      cs.addinfo(intarray[0],intarray[1],intarray[2],intarray[3],intarray[4]); // <-- något konstigt
      System.out.println(2);

    }
    }catch (Exception e) {
    System.out.println("fel:   " + e);
  }
    System.out.println(all);
    return all;
  }

}
