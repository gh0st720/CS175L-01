import java.util.Scanner;
public class CarCostCalculationVersion2 {
 
 public static void main(String[] args) {
 Scanner car = new Scanner(System.in);
 
  // TODO Auto-generated method stub
 
 System.out.print("Please enter the information(model, cost and miles per gallon) of the regular car: ");
 String firstCar=car.nextLine();
 String firstCarName=firstCar.substring(0,14);
 String carCost=firstCar.substring(15,20);
 String carMiles=firstCar.substring(21,23);
 int firstCarName1=Integer.parseInt(firstCarName);
 int carCost1=Integer.parseInt(carCost);
 int carMiles1=Integer.parseInt(carMiles);
 
 
 System.out.print("Please enter the information(model, cost and miles per gallon) of the hybrid car: ");
 String secondCar=car.nextLine();
 String hybridCarName=secondCar.substring(0,12);
 String hybridCost=secondCar.substring(13,18);
 String hybridMiles=secondCar.substring(19,21);
 int hybridCarName1=Integer.parseInt(hybridCarName);
 int hybridCost1=Integer.parseInt(hybridCost);
 int hybridMiles1=Integer.parseInt(hybridMiles);
 
 
 System.out.print("Please enter the miles travled in a year: ");
 double totalMiles = car.nextDouble();
 System.out.print("Please enter the cost per gallon: ");
 double gallonCost = car.nextDouble();
 
 //Calculate cost of regular car after 1 year
  double regCar1=carCost1+((totalMiles*carMiles1)*gallonCost);
 
  //Calculate cost of hybrid car after 1 year
  double regHybrid1=hybridCost1+((totalMiles/hybridMiles1)*gallonCost);
 
  //Calculate cost of a regular car after 2 years
  double regCar2=carCost1+(2*((totalMiles/carMiles1)*gallonCost));
  //Calculate cost of hybrid after 2 years
  double regHybrid2=hybridCost1+(2*((totalMiles/hybridMiles1)*gallonCost));
 
  //Calculate cost of regular car after 3 years
  double regCar3=carCost1+(3*((totalMiles/carMiles1)*gallonCost));
 
  //Calculate cost of hybrid after 3 years
  double regHybrid3=hybridCost1+(3*((totalMiles/hybridMiles1)*gallonCost));
  //Calculate cost of regular car after 4 years
  double regCar4=carCost1+(4*((totalMiles/carMiles1)*gallonCost));
 
  //Calculate cost of hybrid after 4 years
  double regHybrid4=hybridCost1+(4*((totalMiles/hybridMiles1)*gallonCost));
 
  //Calculate cost of regular car after 5 years
  double regCar5=carCost1+(5*((totalMiles/carMiles1)*gallonCost));
 
  //Calculate cost of hybrid after 5 years
  double regHybrid5=hybridCost1+(5*((totalMiles/hybridMiles1)*gallonCost));
 
  //Print calculations
  System.out.print("Cost to own after year 1 for "+firstCarName+": " + regCar1);
  System.out.println(" For "+hybridCarName+": " + regHybrid1);
  System.out.print("Cost to own after year 2 for "+firstCarName+": " + regCar2);
  System.out.println(" For "+hybridCarName+": " + regHybrid2);
  System.out.print("Cost to own after year 3 for "+firstCarName+": " + regCar3);
  System.out.println(" For "+hybridCarName+": " + regHybrid3);
  System.out.print("Cost to own after year 4 for "+firstCarName+": " + regCar4);
  System.out.println(" For "+hybridCarName+": " + regHybrid4);
  System.out.print("Cost to own after year 5 for "+firstCarName+": " +regCar5);
  System.out.println(" For "+hybridCarName+": " + regHybrid5);
 
  //If statement
  if (regHybrid5<regCar5)
  {
  System.out.println("The "+secondCar+ "pays back after 5 years");
  }
  else
  {
   System.out.println("The "+firstCar+ " pays back after 5 years");
  }
  }}
 

 
 
 
 
