public class Berserker extends BaseChar{
    private double healthBoost = 10;
    private double strengthBoost = 5;
    public void inputName(String name){
        super.inputName(name);
    }
    public String getName(){
        return super.getName();
    }
    public void boost(){
        super.addmaxhealth(this.healthBoost);
        super.addSTR(this.strengthBoost);
    }
    public String getStats(){
        String s = "";
        s = s + "Your health is " + this.getmaxhealth() + "\n";
        s = s + "Your mana is " + this.getmaxmana() + "\n";
        s = s + "Your strength is " + this.getSTR() + "\n";
        s = s + "Your defense is " + this.getDEF() + "\n";
        s = s + "Your intelligence is " + this.getINT() + "\n";
        s = s + "Your dexterity is " + this.getDEX() + "\n";
        s = s + "Your luck is " + this.getLUK();
        return s;
    }
    public double Getmaxhealth(){
	    return super.getmaxhealth();
    }
    public double Getmaxmana(){
        return super.getmaxmana();
    }
    public double Gethealth(){
        return this.gethealth();
    }
    public double Getmana(){
        return super.getmana();
    }
    public double GetSTR(){
        return super.getSTR();
    }
    public double GetDEF(){
        return super.getDEF();
    }
    public double GetINT(){
        return super.getINT();
    }
    public double GetDEX(){
        return super.getDEX();
    }
    public double GetLUK(){
        return super.getLUK();
    }
    public void mutilate(BaseChar other){
        System.out.println(this + " hacks away at  Ogre, grunting with each yank.");
        
    }
    public void sweepingonslaught(BaseChar other){
        System.out.println(this + " swings his axe around, slicing through Ogre");
        
    }
    public void guillotine(BaseChar other){
        System.out.println(this + " brings down his massive axe, aiming for Ogre's throat.");
    }
    public void bloodbath(BaseChar other){
        System.out.println(this + " goes on a rampage, devastating anyone who stands in his way, including Ogre");
        
    }
}
