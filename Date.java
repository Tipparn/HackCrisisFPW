//spara kod finns redan ju behöver inte skapa något nytt https://docs.oracle.com/javase/8/docs/api/java/util/Date.html
public class Date{
  int year;
  int month;
  int day;
   public Date(int y, int m, int d){
     year = y;
     month = m;
     day = d;
   }
   public String toString(){

     return ""+ day + "/" + month + "/" + year;
   }
}
