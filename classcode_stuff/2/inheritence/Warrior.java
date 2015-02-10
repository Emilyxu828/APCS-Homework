/* This is a subclass of Basechar */
public class Warrior extends Basechar {
    // private int health= 50000;
    private int healthboost = 5;

    public Warrior() {
	setName("DEFAULT");
    }
    public Warrior(String n) {
	// If we don't explicitly call the super constructor --> super();
	// as the first line of our subclass' constructor, Java will do
	// it automatically
	//super();
	super(n);
	// setName(n); // we don't need to setName if the constructor does it
    }
    

    public int getHealth() {
	return healthboost + super.getHealth();
    }
    public void attack(Basechar other){
	//System.out.println(this.getName()+" is SUPERattacking "+other.getName());
	// automatically calls toString
	System.out.println(this+" is SUPERattacking "+other);

    }
    
}
