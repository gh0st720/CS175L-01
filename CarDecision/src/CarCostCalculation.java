import java.util.Scanner;
public class CarCostCalculation {
 
 public static void main(String[] args) {
 Scanner car = new Scanner(System.in);
  // TODO Auto-generated method stub
 
 System.out.println("Please enter the cost of the regular car: ");
 double carCost = car.nextDouble();
 System.out.println("Please enter the miles per gallon of the regualr car: ");
 double carMiles = car.nextDouble();
 System.out.println("Please enter the cost of the hybrid car: ");
 double hybridCost = car.nextDouble();
 System.out.println("Please enter the miles per gallon of the hybrid car: ");
 double hybridMiles = car.nextDouble();
 System.out.println("Please enter the miles travled in a year: ");
 double totalMiles = car.nextDouble();
 System.out.println("Please enter the cost per gallon: ");
 double gallonCost = car.nextDouble();
 
 //Calculate cost of regular car after 1 year
 double regCar1=carCost+((totalMiles/carMiles)*gallonCost);
 
 //Calculate cost of hybrid car after 1 year
 double regHybrid1=hybridCost+((totalMiles/hybridMiles)*gallonCost);
 
 //Calculate cost of a regular car after 2 years
 double regCar2=carCost+(2*((totalMiles/carMiles)*gallonCost));
 //Calculate cost of hybrid after 2 years
 double regHybrid2=hybridCost+(2*((totalMiles/hybridMiles)*gallonCost));
 
 //Calculate cost of regular car after 3 years
 double regCar3=carCost+(3*((totalMiles/carMiles)*gallonCost));
 
 //Calculate cost of hybrid after 3 years
 double regHybrid3=hybridCost+(3*((totalMiles/hybridMiles)*gallonCost));
 //Calculate cost of regular car after 4 years
 double regCar4=carCost+(4*((totalMiles/carMiles)*gallonCost));
 
 //Calculate cost of hybrid after 4 years
 double regHybrid4=hybridCost+(4*((totalMiles/hybridMiles)*gallonCost));
 
 //Calculate cost of regular car after 5 years
 double regCar5=carCost+(5*((totalMiles/carMiles)*gallonCost));
 
 //Calculate cost of hybrid after 5 years
 double regHybrid5=hybridCost+(5*((totalMiles/hybridMiles)*gallonCost));
 
 //Print calculations
 System.out.print("Cost to own after year 1 for regular car: " + regCar1);
 System.out.println("For hybrid car: " + regHybrid1);
 System.out.print("Cost to own after year 2 for regular car: " + regCar2);
 System.out.println("For hybrid car: " + regHybrid2);
 System.out.print("Cost to own after year 3 for regular car: " + regCar3);
 System.out.println("For hybrid car: " + regHybrid3);
 System.out.print("Cost to own after year 4 for regular car: " + regCar4);
 System.out.println("For hybrid car: " + regHybrid4);
 System.out.print("Cost to own after year 5 for regular car: " + regCar5);
 System.out.println("For hybrid car: " + regHybrid5);
 
 //If statement
 if (regHybrid5<regCar5);
 System.out.println("The hybrid car pays back after 5 years");
 
 
 
 
 
 
 
 
 
 
 }
}

