package heroes;

import java.util.Random;

public class Hero {

	protected int power;
	private int height;
	protected int life;
	private String name;
	protected int shield;
	public boolean isAlive;
	Random r = new Random();
	public Hero(String name,int height,int life,int power){
		this.shield=0;
		this.isAlive=true;
		this.name= name;
		this.height=height;
		this.life= life;
		this.power=power;
	}
	
	public boolean fightAgains(Hero hero){
		boolean isDead=false;
		print(this.name+" hit "+ hero.name);
		hero.life-= doDamage();
		print(hero.name+" life is "+hero.life);
		if(hero.life<=0)
		{
			isDead=true;
			hero.isAlive=false;
			redPrint(hero.name+" is dead ! !");
		}
		return isDead;
	}
	
	private int doDamage(){
		int strike= r.nextInt(this.power);
		print("damage:"+strike);
		return strike;
	}
	
	private void redPrint(String text){
		System.err.println(text);
	}
	
	private void print(String text){
		System.out.println(text);
	}
	
	public void win(){
		System.out.println("  ---------------------");
		System.out.println("  -- "+this.name+" Won ! ! !  --");
		System.out.println("  ---------------------");


	}
}


