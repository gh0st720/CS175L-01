
public class RoachPopulation {
	
double roaches;
double breedRoaches;
double sprayedRoaches;
int cycle;
int percentage;

public RoachPopulation(int numOfRoaches)
{
	roaches=numOfRoaches;
	System.out.println("The initial population is: "+(int)roaches);
	
}
public void getRoaches()
{
	System.out.println("The population after cycle "+cycle+" of breeding is "+(int)breedRoaches);
	System.out.println("The population after cycle "+cycle+" at "+percentage+" percent spraying is "+(int)breedRoaches);
}
public void spray(int death)
{
	percentage=death;
	roaches-=((roaches*(death*0.01)));
	roaches=Math.round(roaches);
	sprayedRoaches=roaches;
}
public void breed()
{
	roaches*=2;
	breedRoaches=roaches;
	cycle++;
}
{

}}
