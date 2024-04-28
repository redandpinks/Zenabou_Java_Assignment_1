/*Drivers are concerned with the mileage their automobiles get. 
One driver has kept track of several trips by recording the miles driven and gallons used f
or each tankful. Develop a Java application that will input the miles driven and gallons used 
(both as integers) for each trip. The program should calculate and display the miles per gallon 
obtained for each trip and print the combined miles per gallon obtained for all trips up to this 
point. All averaging calculations should produce floating-point results. 
Use class Scanner and sentinel-controlled iteration to obtain the data from the user. */


import java.util.Scanner;

public class MileageCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int totalMiles = 0;
int totalGallons = 0;
int tripCount = 0;

System.out.println("Welcome to the Mileage Calculator!");

while (true) {
System.out.print("Enter miles driven for trip " + (tripCount + 1) + " (or -1 to stop): ");
int miles = scanner.nextInt();

if (miles == -1) {
 break; 
            }
System.out.print("Enter gallons used: ");
int gallons = scanner.nextInt();

double mpg = calculateMPG(miles, gallons);
System.out.printf("MPG for Trip %d: %.2f%n", tripCount + 1, mpg);

totalMiles += miles;
totalGallons += gallons;

double totalMPG = calculateMPG(totalMiles, totalGallons);
System.out.printf("Combined MPG up to Trip %d: %.2f%n%n", tripCount + 1, totalMPG);

tripCount++;
        }
System.out.println("Thank you for using the Mileage Calculator!");
scanner.close();
    }
public static double calculateMPG(int miles, int gallons) {
return (double) miles / gallons;
    }
}
