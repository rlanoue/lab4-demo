/**
 * Lab 4 Demo (Solution) 
 * Class representing a Hero as a special type of Person with a
 * different task list
 * 
 * @author MoSho
 * @version 02-07-2019
 */
public class Hero extends Person		//extends inheritence 
{
	private String name;				//hidden in the person class, so we need a copy of anything private 
	private int age;

	public Hero()
	{
		super();
	}

	public Hero(String n, int a)
	{
		super(n, a);
		
		// Observe inheritance dynamics
		//System.out.println("SUPER: " + super.getName() + " " + super.getAge());
		//System.out.println("THIS1: " + this.getName() + " " + this.getAge());
		//System.out.println("THIS2: " + this.name + " " + this.age);
	}

	// TODO: run code first, then override toString()
	public boolean equals(Object other)
	{
		if (!(other instanceof Hero))
		{
			return false; 
		}
		
		Hero otherHero = (Hero)other; 
		
		boolean sameName = this.getName().contentEquals(otherHero.getName());  
		boolean sameAge = this.getAge() == otherHero.getAge(); 
		
		return sameName && sameAge; 
	}

	@Override
	public String getTaskList()		//since it's a specific kind of person, you must override the normal person tasklist and have one for themselves 
	{								//Hero class will override the default 
		return " 1. Eat breakfast\n 2. Make lunch\n 3. Go to work\n" +
				" 4. Go on patrol\n 5. Kick some ass\n 6. Wash up";
	}
}