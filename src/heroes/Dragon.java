package heroes;

public class Dragon extends Hero {

	private boolean isFlying;
	
	public void flyUp(){
		this.isFlying=true;
		this.power=power/2;
	}
	public void flyDown(){
		this.isFlying=false;
		this.power=power*2;
	}
	public Dragon(String name, int height, int life, int power) {
		super(name, height, life, power);
		this.isFlying=false;
	}
	
	public boolean fightAgains(Hero hero){
		return super.fightAgains(hero);
	}

}
