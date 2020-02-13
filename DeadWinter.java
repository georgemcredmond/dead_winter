import java.util.Scanner;

public class DeadWinter
{
	public static void main(String[] args)
	{
		int response;

		Scanner input = new Scanner(System.in);

		System.out.print("Welcome. Press 1 to create a character, any other number to quit");
		response = input.nextInt();

		while(response == 1)
		{
			charSelect();

			System.out.print("Press 1 to re-start the game, or any other number to quit");
			response = input.nextInt();
		}

		System.out.println("Thank you for playing....");

	}

	public static void charSelect() 
	{		

			PlayerChar primaryChar;

			PlayerChar myChar1 = new PlayerChar();

			System.out.println();
			System.out.println("Character Stats:");
			System.out.println();
			System.out.println("Name:" + myChar1.getName());
			System.out.println("Occupation:" + myChar1.getOcc());
			System.out.println("Influence:" + myChar1.getInfluence());
			System.out.println("Attack:" + myChar1.getAttack());
			System.out.println("Search:" + myChar1.getSearch());
			System.out.println("Ability:" + myChar1.getAbility());
			System.out.println();

			PlayerChar myChar2 = new PlayerChar();

			if(myChar1.getName() == myChar2.getName())
			{
				myChar2 = new PlayerChar();
			}

			System.out.println();
			System.out.println("Character Stats:");
			System.out.println();
			System.out.println("Name:" + myChar2.getName());
			System.out.println("Occupation:" + myChar2.getOcc());
			System.out.println("Influence:" + myChar2.getInfluence());
			System.out.println("Attack:" + myChar2.getAttack());
			System.out.println("Search:" + myChar2.getSearch());
			System.out.println("Ability:" + myChar2.getAbility());
			System.out.println();

			if(myChar1.getInfluence() > myChar2.getInfluence())
			{
				primaryChar = myChar1;
			} else {
				primaryChar = myChar2;
			}

			System.out.println();
			System.out.println("Your primary character is: " + primaryChar.getName());
			System.out.println();
	}
}