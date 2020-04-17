

public class CounterVenue {

	public static void main(String[] args) {
		Counter venue = new Counter();
		
		for(int count=0;count<=10;count++)
		{
			venue.click();
		}
		for(int count=5;count>=0;count--)
		{
			venue.unclick();
		}
		int rValue=venue.getValue();
		System.out.println("Expected venue:5");
		System.out.println("Actual venue: "+rValue);
		
		venue.reset();
		
		for(int count=0;count<=3;count++)
		{
			venue.click();
		}
		for(int count=4;count>=0;count--)
		{
			venue.unclick();
		}
		rValue=venue.getValue();
		System.out.println("Expected venue:-1");
		System.out.println("Actual venue: "+rValue);
		
		
	
		
		
		
	//	rValue=concertCounter.getValue();
	//	concertCounter.click();
	//	rValue=concertCounter.getValue();
		
	//	concertCounter.unclick();
	//	concertCounter.unclick();
	//	rValue=concertCounter.getValue();
	//	System.out.println("concertcounter =" + rValue);
	}

}
