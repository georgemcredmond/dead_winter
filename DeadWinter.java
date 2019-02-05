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
			PlayerChar myChar = new PlayerChar();

			System.out.println();
			System.out.println("Character Stats:");
			System.out.println();
			System.out.println("Name:" + myChar.getName());
			System.out.println("Occupation:" + myChar.getOcc());
			System.out.println("Influence:" + myChar.getInfluence());
			System.out.println("Attack:" + myChar.getAttack());
			System.out.println("Search:" + myChar.getSearch());
			System.out.println("Ability:" + myChar.getAbility());
			System.out.println();

			System.out.print("Press 1 to create another character, or any other number to quit");
			response = input.nextInt();
		}

		System.out.println("Thank you for playing....");

	}
}