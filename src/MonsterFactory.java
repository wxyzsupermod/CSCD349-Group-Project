
public class MonsterFactory{
	
	public Monster createOgre(String name) {
		return new Ogre(name);
	}
	public Monster createCyclops(String name) {
		return new Cyclops(name);
	}
	public Monster createSkeleton(String name) {
		return new Skeleton(name);
	}
	public Monster createCerberus(String name) {
		return new Cerberus(name);
	}
	public Monster createGremlin(String name) {
		return new Gremlin(name);
	}
}

