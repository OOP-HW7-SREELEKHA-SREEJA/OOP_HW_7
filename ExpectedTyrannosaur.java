package hw7;

public class ExpectedTyrannosaur extends AnimalClassTester
{
	@Override
	public boolean testAnimalObject(Object animal) 
	{
	if (animal instanceof Tyrannosaur) 
	{
		Tyrannosaur t = (Tyrannosaur) animal;
		if (t.aboutMe().contentEquals("Tyranosaurus Rex")) 
		{
			if (t.roar().equals("Roarrr!")) 
			{
				if (t.food().equals("other dinosaurs")) 
				{
					return true;
				}
			}
		}
	}
	return false;
	}
}
