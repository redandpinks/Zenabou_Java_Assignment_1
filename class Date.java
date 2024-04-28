
/*Create a class called Date that includes three instance variables—a month (type int), a 
day (type int) and a year (type int). 
Provide a constructor that initializes the three instance variables and assumes that the values 
provided are correct. 
Provide a set and a get method for each instance variable. 
Provide a method displayDate that displays the month, day and year separated by forward slashes (/).
 Write a test app named DateTest that demonstrates class Date’s capabilities. */


public classDate {
    
private int month;
 private int day;
private int year;

    
 public Date(int month, int day, int year) {
 this.month = month;
this.day = day;
 this.year = year;
    }
public void displayDate() {
System.out.println(month + "/" + day + "/" + year);
    }

public static void main(String[] args) {
    
Date myDate = new Date(1, 1, 2022);

System.out.print("Date: ");
myDate.displayDate();

myDate.month = 12;
myDate.day = 31;
myDate.year = 2022;

System.out.print("Updated Date: ");
myDate.displayDate();
    }
}
