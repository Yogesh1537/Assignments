package q_four;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;


public class Date {
	
int date;
int month;
int year;
 public Date(int date, int month, int year)
    {
	    this.date = date;
		this.month = month;
		this.year = year;
	}
public int getDate() {
	return date;
}
public void setDate(int date) {
	this.date = date;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public String toString() {
	return "Date [date=" + date + ", month=" + month + ", year=" + year + "]";
}
@Override
public int hashCode() {
	return Objects.hash(date, month);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Date other = (Date) obj;
	return date == other.date && month == other.month;
}



public class Employee{
	public static void main(String[] args) {

	      Date d1 = new Date (10,06,1996);
	      Date d2 = new Date (14,11,1998);
	      Date d3 = new Date (14,11,1999);
	      Date d4 = new Date (25,03,2005);
		
	      Map<Date, String> dob = new HashMap<>();
		   dob.put(d1, "Rahul");
	       dob.put(d2, "Shashank");
	       dob.put(d3, "Nikhil");
	       dob.put(d4, "Varad");

	        for (Entry<Date, String> e: dob.entrySet()) 
	        {
	          System.out.println(e.getKey());
	         
	          System.out.println(e.getValue());
	        }
}
 
}
}
 
 
 

 
 


