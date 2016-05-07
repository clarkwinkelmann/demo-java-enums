
public class Personne {

	public static final int Static_Francais = 0;
	public static final int Static_Anglais = 1;
	
	public void parlerString(String langue) {
		if(langue.equals("fr")) {
			System.out.println("Bonjour");
		} else if(langue.equals("en")) {
			System.out.println("Good morning");
		} else {
			System.out.println("rubfiusbfiueb");
		}
	}
	
	public void parlerConst(int langue) {
		switch(langue) {
		case Static_Francais:
			System.out.println("Bonjour");
			break;
		case Static_Anglais:
			System.out.println("Good morning");
			break;
		default:
			System.out.println("rubfiusbfiueb");
		}
	}
	
	public void parlerEnum(Langue langue) {
		switch(langue) {
		case Francais:
			System.out.println("Bonjour");
			break;
		case Anglais:
			System.out.println("Good morning");
			break;
		}
	}
	
}
