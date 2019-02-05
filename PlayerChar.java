public class PlayerChar
{

	private String name = "";
	private String occupation = "";
	private int influence;
	private int attack;
	private int search;
	private String ability = "";
	int charNum;

	public PlayerChar()
	{

		charNum = 1 + (int)(Math.random() * 30);

		switch(charNum)
		{
			case(1):
			{
				name = "Sophie Robinson";
				occupation = "Pilot";
				influence = 56;
				attack = 4;
				search = 1;
				ability = "ANYWHERE: Once per round you may look at the top card of a single location's item deck. After you have looked at the card, place it back on top of that item deck.";
				break;
			}

			case (2):
			{
				name = "Gabriel Diaz";
				occupation = "Fireman";
				influence = 60;
				attack = 2;
				search = 3;
				ability = "ANYWHERE: Once per round, when Gabriel is at a location with an item deck, you may reveal the top 4 cards. If any card is an OUTSIDER card, you may place it into your hand. Shuffle the remaining cards back into the item deck.";
				break;
			}

			case (3):
			{
				name = "Edward White";
				occupation = "Chemist";
				influence = 44;
				attack = 4;
				search = 3;
				ability = "COLONY: (1+) Once per round, when performing an attack with Edward, you may play a medicine card to kill 3 zombies instead of 1. Do not roll for exposure. Do not use the ability on the medicine card.";
				break;
			}

			case (4):
			{
				name = "Ashley Ross";
				occupation = "Construction Worker";
				influence = 52;
				attack = 2;
				search = 5;
				ability = "ANYWHERE: Once per round you may perform a barricade action without using an action die.";
				break;
			}

			case (5):
			{
				name = "Maria Lopez";
				occupation = "Teacher";
				influence = 48;
				attack = 4;
				search = 2;
				ability = "SCHOOL: (1+) Once per round, you may kill 1 zombie at the school. Do not roll for exposure.";
				break;
			}

			case (6):
			{
				name = "Loretta Clay";
				occupation = "Cook";
				influence = 20;
				attack = 2;
				search = 4;
				ability = "COLONY: (4+) Once per round, you may add 2 tokens to the food supply.";
				break;
			}

			case (7):
			{
				name = "Forest Plum";
				occupation = "Mall Santa";
				influence = 14;
				attack = 5;
				search = 2;
				ability = "ANYWHERE: A the beginning of your turn, you may remove Forest from the game to raise morale by 1.";
				break;
			}

			case (8):
			{
				name = "Harman Brooks";
				occupation = "Park Ranger";
				influence = 32;
				attack = 3;
				search = 3;
				ability = "ANYWHERE: If Harman would receive a frostbite wound, receives a regular wound instead.";
				break;
			}

			case (9):
			{
				name = "Andrew Evans";
				occupation = "Farmer";
				influence = 12;
				attack = 3;
				search = 3;
				ability = "GROCERY STORE: Once per round, when performing a search at the grocery store, you may look at and keep 1 additional card.";
				break;
			}

			case (10):
			{
				name = "Rod Miller";
				occupation = "Truck Driver";
				influence = 40;
				attack = 3;
				search = 3;
				ability = "ANYWHERE: When moving Rod, you do not roll for exposure.";
				break;
			}

			case (11):
			{
				name = "Sparky";
				occupation = "Stunt Dog";
				influence = 10;
				attack = 2;
				search = 2;
				ability = "ANYWHERE: When rolling for exposure with Sparky, if you roll a bite, treat is as if you rolled a wound. When spreading bite effect, ignore Sparky.";
				break;
			}

			case (12):
			{
				name = "Annaleigh Chan";
				occupation = "Lawyer";
				influence = 38;
				attack = 2;
				search = 2;
				ability = "COLONY: Once per round, you may look at 1 card at random in a player's hand.";
				break;
			}

			case (13):
			{
				name = "Daniel Smith";
				occupation = "Sheriff";
				influence = 66;
				attack = 2;
				search = 5;
				ability = "ANYWHERE: (4+) Once per round you may kill 2 zombies at Daniel's current location. Only roll for exposure once.";
				break;
			}

			case (14):
			{
				name = "Arthur Thurson";
				occupation = "Principal";
				influence = 62;
				attack = 4;
				search = 2;
				ability = "SCHOOL: Once per round, when performing a search at the school, you may look at and keep 1 additional card.";
				break;
			}

			case (15):
			{
				name = "Buddy Davis";
				occupation = "Fitness Trainer";
				influence = 36;
				attack = 2;
				search = 4;
				ability = "ANYWHERE: It takes 4 or more wound tokens to kill Buddy instead of 3";
				break;
			}

			case (16):
			{
				name = "Alexis Grey";
				occupation = "Librarian";
				influence = 46;
				attack = 5;
				search = 4;
				ability = "LIBRARY: Once per round when performing a search at the library, you may look at and keep 1 additional card.";
				break;
			}

			case (17):
			{
				name = "'Gray Beard'";
				occupation = "Pirate";
				influence = 16;
				attack = 1;
				search = 4;
				ability = "COLONY: Once per round, you may take a card at random from another player and place it into your hand.";
				break;
			}

			case (18):
			{
				name = "Brian Lee";
				occupation = "Mayor";
				influence = 68;
				attack = 3;
				search = 4;
				ability = "ANYWHERE: Once per round, you may increase an unused action die you control by 1.";
				break;
			}

			case (19):
			{
				name = "Jenny Clark";
				occupation = "Waitress";
				influence = 24;
				attack = 4;
				search = 3;
				ability = "ANYWHERE: Once per round when performing a search with Jenny, you may look at 3 additional cards.";
				break;
			}

			case (20):
			{
				name = "John Price";
				occupation = "Student";
				influence = 18;
				attack = 3;
				search = 3;
				ability = "NON-COLONY: When John is not at the colony, he is considered to have the ability of every other survivor he shares a location with.";
				break;
			}

			case (21):
			{
				name = "Brandon Kane";
				occupation = "Janitor";
				influence = 26;
				attack = 2;
				search = 4;
				ability = "COLONY: Once per round you may remove 5 cards instead of 3 from the waste pile when taking the clean waste action.";
				break;
			}

			case (22):
			{
				name = "Carla Thompson";
				occupation = "Police Dispatcher";
				influence = 22;
				attack = 4;
				search = 2;
				ability = "POLICE STATION: Once per round, when performing a search at the police stationa, you may look a and keep 1 additional card.";
				break;
			}

			case (23):
			{
				name = "Janet Taylor";
				occupation = "Nurse";
				influence = 42;
				attack = 3;
				search = 4;
				ability = "HOSPITAL: Once per round, when performing a search a the hospital, you may look at and keep 1 additional card.";
				break;
			}

			case (24):
			{
				name = "James Meyers";
				occupation = "Psychiatrist";
				influence = 54;
				attack = 6;
				search = 3;
				ability = "ANYWHERE: Once per round, you may reroll 1 or more of your unused action dice. You mus keep the second result.";
				break;
			}

			case (25):
			{
				name = "David Garcia";
				occupation = "Accountant";
				influence = 50;
				attack = 4;
				search = 3;
				ability = "ANYWHERE: When performing a search with David, you may look a 1 additional card.";
				break;
			}

			case (26):
			{
				name = "Talia Jones";
				occupation = "Fortune Teller";
				influence = 28;
				attack = 3;
				search = 1;
				ability = "ANYWHERE: Once per round, you may look at the top 2 cards of the crisis deck and place them back in any order. Then you may say exactly 2 words to all players about the crisis cards, nothing more.";
				break;
			}

			case (27):
			{
				name = "Olivia Brown";
				occupation = "Doctor";
				influence = 56;
				attack = 4;
				search = 3;
				ability = "ANYWHERE: Once per round, you may remove any type of wound from a survivor that shares your location. Olivia can use this ability on herself as well.";
				break;
			}

			case (28):
			{
				name = "Thomas Heart";
				occupation = "Soldier";
				influence = 64;
				attack = 1;
				search = 3;
				ability = "COLONY: (5+) Once per round, you may kill 2 zombies at the colony. Do not roll for exposure.";
				break;
			}

			case (29):
			{
				name = "Bev Russell";
				occupation = "Mother";
				influence = 34;
				attack = 2;
				search = 4;
				ability = "COLONY: (1+) Once per round, you may kill 2 zombies at the colony as long as there are at least 1 helpless survivors at the colony. Do not roll for exposure.";
				break;
			}

			case (30):
			{
				name = "Mike Cho";
				occupation = "Ninja";
				influence = 30;
				attack = 2;
				search = 4;
				ability = "ANYWHERE: When performing an attack with Mike, do not roll for exposure.";
				break;
			}
		}
	}

	public String getName()
	{
		return name;
	}

	public String getOcc()
	{
		return occupation;
	}

	public int getInfluence()
	{
		return influence;
	}

	public int getAttack()
	{
		return attack;
	}

	public int getSearch()
	{
		return search;
	}

	public String getAbility()
	{
		return ability;
	}

	// For testing onlyy
	public int getCharNum()
	{
		return charNum;
	}
}