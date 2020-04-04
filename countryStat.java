import java.util.ArrayList;
import java.util.Date;
public class countryStat{
 	String countryName;
	ArrayList<Date> date=new ArrayList<Date>();
	ArrayList<Integer> new_deaths=new ArrayList<Integer>();
	ArrayList<Integer> new_cases=new ArrayList<Integer>();
	ArrayList<Integer> sick=new ArrayList<Integer>();
  	public countryStat(String countryN){
    	countryName = countryN;
  	}
  	public void addinfo(String day, String month,String year,String new_case, String deaths ){
  		date.add(new Date(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day)));
  		new_cases.add(Integer.parseInt(new_case));
  		new_deaths.add(Integer.parseInt(deaths));
  	}
}
