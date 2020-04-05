import java.util.ArrayList;
public class countryStat{
 	public String countryName;
	public ArrayList<Date> date=new ArrayList<Date>();//skulle nog va vanliga arrayer??
	public ArrayList<Integer> new_deaths=new ArrayList<Integer>();
	public ArrayList<Integer> new_cases=new ArrayList<Integer>();
	public ArrayList<Integer> total_death=new ArrayList<Integer>();// will add everything
	public ArrayList<Integer> total_cases=new ArrayList<Integer>();

  /*
      en countryStat innehåller data för ett land plus dagar
  */

  	public countryStat(String countryN){
    	countryName = countryN;
	
  	}
	//kanske ska göra dett på annat sätt??
	//använda setters();??
  	public void addinfo(String day, String month,String year,String new_case, String deaths ){
  		date.add(new Date(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day)));
  		new_cases.add(Integer.parseInt(new_case));
  		new_deaths.add(Integer.parseInt(deaths));
  		total_cases.add(new_cases.get(new_cases.size())+Integer.parseInt(new_case));
  		total_death.add(new_deaths.get(new_deaths.size())+Integer.parseInt(deaths));
  	}

    public String toString(){
      String s = this.countryName + "\n";
      for(int i = 0; i< date.size(); i++){
        s = s + date.get(i) + "\t" + new_cases.get(i) + "\t" + new_deaths.get(i) + "\n";
      }
      return s;
    }
    //gets för alla variabler
    public Date getDate(int a){
    	return date.get(a);
    }
    public int getNew_deaths(int a){
    	return new_deaths.get(a);
    }
    public int getNew_cases(int a){
    	return new_deaths.get(a);
    }
    public int getTotal_deaths(int a){
    	return  total_death.get(a);
    }
    public int getTota_cases(int a){
    	return total_cases.get(a);
    }
}
