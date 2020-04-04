import java.util.ArrayList;
public class countryStat{
 	public String countryName;
	public ArrayList<Date> date=new ArrayList<Date>();
	public ArrayList<Integer> new_deaths=new ArrayList<Integer>();
	public ArrayList<Integer> new_cases=new ArrayList<Integer>();
	public ArrayList<Integer> sick=new ArrayList<Integer>();
  	public countryStat(String countryN){
    	countryName = countryN;
  	}
  	public void addinfo(String day, String month,String year,String new_case, String deaths ){
  		date.add(new Date(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day)));
  		new_cases.add(Integer.parseInt(new_case));
  		new_deaths.add(Integer.parseInt(deaths));
  	}

    public String toString(){
      String s = this.countryName + "\n";
      for(int i = 0;i< date.length();i++){
        s = s + date.get(i); + "\t" + new_cases.get(i) + "\t" + new_deaths.get(i) + "\n";
      }
      return s;
    }
}
