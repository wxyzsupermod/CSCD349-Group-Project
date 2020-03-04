
public class HeroFactory{
	
	//public static ElfWizard createElfWizard(String name) {
		//return new ElfWizard(name);
	//}
	public static Hero createHero(String name, int healthPoints, int attackSpeed, int damageMin, int damageMax,
			double hitChance) {
		return new Hero(name,healthPoints,attackSpeed,damageMin,damageMax,hitChance);
	}
}