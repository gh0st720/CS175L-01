import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) { ;
	Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
	
	//A few of the variables are defined differently then on the pseudo code due to a last minute decision to change

	//Input all variables necessary for calculation
	System.out.println("Please enter the length of the house: ");
	int houseLength = in.nextInt();
	System.out.println("Please enter the width of the house: ");
	int houseWidth = in.nextInt();
	System.out.println("Please enter the height of the house: ");
	int houseHeight =in.nextInt();
	System.out.println("Please enter the length of the doors: ");
	int doorLength = in.nextInt();
	System.out.println("Please enter the width of the doors: ");
	int doorWidth = in.nextInt();
	System.out.println("Please enter number of doors: ");
	int numDoor = in.nextInt();
	System.out.println("Please enter the length of the windows: ");
	int winLength = in.nextInt();
	System.out.println("Please enter the width of the windows: ");
	int winWidth = in.nextInt();
	System.out.println("Please enter the number of windows: ");
	int numWindow = in.nextInt();
	System.out.println("Please enter the cost the painter charges per SqFT: ");
	double painterCost = in.nextDouble();
	
	
	//Calculate wall SqFT
	int normalHouse = (houseLength*houseWidth);
	System.out.println("Normal House: "+normalHouse);
	double peakHouse = (houseWidth*houseLength) +((0.5)*(houseLength*(houseHeight-houseWidth)));
	System.out.println("Peak side: "+peakHouse);
	
	
	//Calculate SqFT of all doors and windows
	int totalDoor = (doorLength*doorWidth)*numDoor;
	System.out.println("Total door SqFt: "+totalDoor);
	int totalWindow = (winLength*winWidth)*numWindow;
	System.out.println("Total window SqFT: "+totalWindow);
	
	
	//Calculate SqFT of walls
	double totalWall =  (2*(normalHouse))+(2*(peakHouse));
	System.out.println("Total wall SqFT: "+totalWall);
	
	//Subtract door/window SqFT from wall
	double totalHouse =  totalWall-(totalWindow+totalDoor);
	System.out.println("Total SqFt: "+totalHouse);
	
	
	//Print the SqFT cost
	double totalCost = totalHouse*painterCost;
	System.out.println(totalCost);
	
	
	}
	
}
