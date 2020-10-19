package hw7;

public class ExpectedTreeClimbingOctopus extends AnimalClassTester
{
	@Override
	public boolean testAnimalObject(Object animal) 
	{
		if (animal instanceof TreeClimbingOctopus) 
		{
			TreeClimbingOctopus o = (TreeClimbingOctopus) animal;
			if (o.aboutMe().equals("octopus")) 
			{
				if (o.foodIEat().equals("fish")) 
				{
					return true;
				}
			}
		}
		return false;
	}
}
