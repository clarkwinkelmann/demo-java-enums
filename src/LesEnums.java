
public class LesEnums {

	public static void main(String[] args) {
		Personne p = new Personne();

		p.parlerString("fr");
		p.parlerString("en");
		p.parlerString("blabla");
		
		System.out.println("---");
		
		p.parlerConst(Personne.Static_Francais);
		p.parlerConst(Personne.Static_Anglais);
		p.parlerConst(10000);

		System.out.println("---");
		
		p.parlerEnum(Langue.Francais);
		p.parlerEnum(Langue.Anglais);
		//p.parlerEnum(1000);
	}

}
