import java.util.Scanner;
public class GroceryDiscount {

	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  Scanner in=new Scanner(System.in);
		  System.out.print("Please enter the cost of your groceries or 0 to quit: ");
		  double cost=in.nextDouble();
		  
		  double coup1=0.08;
		  double coup2=0.10;
		  double coup3=0.12;
		  double coup4=0.14;
		  
		  double price1=cost*coup1;
		  double price2=cost*coup2;
		  double price3=cost*coup3;
		  double price4=cost*coup4;
		  
		  
		  
		  
		  if (cost<10&&cost>0)
		  {
		   System.out.println("Unfortunately, you are not elligible for a coupon");
		  }
		  else if (cost>=10&&cost<=60)
		  {
		   System.out.println("You win a coupon of "+price1+"(8% of your purchase)");
		  }
		  else if (cost>60&&cost<=150)
		  {
		   System.out.println("You win a coupon of "+price2+" (10% of your purchase)");
		  }
		  else if (cost>150&&cost<=210)
		  {
		   System.out.println("You win a coupon of "+price3+" (12% of your purchase)");
		  }
		  else if (cost>210)
		  {
		   System.out.println("You win a coupon of "+price4+" 14% of your purchase");
		  }
		  else
		  {
		   exit(0);
		  }
		  
		  
		 }
		 private static void exit(int i) {
		  // TODO Auto-generated method stub
		  
		 }
		}


