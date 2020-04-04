import java.util.ArrayList;
import java.util.Date;
public class countryStat{
<<<<<<< HEAD
 	String countryName;
	ArrayList<Date> date=new ArrayList<Date>();
	ArrayList<Integer> deaths=new ArrayList<Integer>();
	ArrayList<Integer> new_case=new ArrayList<Integer>();
	ArrayList<Integer> sick=new ArrayList<Integer>();
  	public countryStat(String countryN){
    	countryName = countryN;
  	}
  	public void addinfo(String day, String month,String year,String new_case, String deaths ){
  		date.add(
=======
  String countryName
  ArrayList<int> dates;
  int[] deaths;
  int[] recoverd;
  public countryStat(String countryN){
    countryName = countryN;
  }
  public void addinfo(){
>>>>>>> a76a6d9406ee082d1415dcaac1f33cc1313e17ea

  	}
}
