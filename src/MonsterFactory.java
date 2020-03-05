
public class MonsterFactory{
	
	public static Monster createOgre(String name) {
		return new Ogre(name);
	}
	public static Monster createCyclops(String name) {
		return new Cyclops(name);
	}
	public static Monster createSkeleton(String name) {
		return new Skeleton(name);
	}
	public static Monster createCerberus(String name) {
		return new Cerberus(name);
	}
	public static Monster createGremlin(String name) {
		return new Gremlin(name);
	}
}

