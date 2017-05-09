package game;

import heroes.Hero;

public class Board {

	public static void main(String[] args) {
		 int heroesAmount =4;
	  Hero[] herosInTheGame = new Hero[heroesAmount];
	  herosInTheGame[0]= new Hero("John", 180, 100, 10);
	  herosInTheGame[1]= new Hero("dan", 170, 100, 10);
	  herosInTheGame[2]= new Hero("bob", 200, 100, 12);
	  herosInTheGame[3]= new Hero("dina", 175, 100, 15);
	  
	 while(heroesAmount>1)
	 {
		 for (Hero hero : herosInTheGame) {
			 
			 for (Hero hero2 : herosInTheGame) {
				
				 if(!hero.equals(hero2) && hero.isAlive && hero2.isAlive )
				 {
					boolean isDead= hero.fightAgains(hero2);
					if(isDead) heroesAmount--;
					
				 }
			}	
		}
	 }
	 for (Hero hero : herosInTheGame) {
		if(hero.isAlive) hero.win();
	}
	}

}
