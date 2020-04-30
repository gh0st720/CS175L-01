
public class RoachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RoachPopulation roach=new RoachPopulation(10);
		roach.breed();
		roach.spray(50);
		roach.getRoaches();
		roach.breed();
		roach.spray(60);
		roach.getRoaches();
		roach.breed();
		roach.spray(70);
		roach.getRoaches();
		roach.breed();
		roach.spray(80);
		roach.getRoaches();

	}

}
