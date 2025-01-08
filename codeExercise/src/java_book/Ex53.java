package java_book;

public class Ex53 {
	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		Gladiator gladiator = new Gladiator();
		Wizard wizard = new Wizard();
		Warrior enemyWarrior = new Warrior();

		enemyWarrior.name = "암베사";
		
		warrior.name = "다리우스";
		warrior.hp = 500;
		warrior.power = 66;
		warrior.weapon = "삼위일체";

		gladiator.name = "레오나";
		gladiator.hp = 540;
		gladiator.power = 60;
		gladiator.shield = "솔라리의 팬던트";

		wizard.name = "소라카";
		wizard.hp = 470;
		wizard.power = 54;
		wizard.heal = "구원";

		warrior.attack(warrior.name, enemyWarrior.name);
		warrior.powerAttack(warrior.name, enemyWarrior.name);

		gladiator.attack(gladiator.name, enemyWarrior.name);
		gladiator.defence(gladiator.name, warrior.name);

		wizard.attack(wizard.name, enemyWarrior.name);
		wizard.healing(wizard.name, warrior.name);

		System.out.println("==============================");
		System.out.println("Warrior - 무기 : " + warrior.weapon + ", 체력 : " + warrior.hp + ", 기본공격력 : " + warrior.power);
		System.out.println(
				"Gladiator - 무기 : " + gladiator.shield + ", 체력 : " + gladiator.hp + ", 기본공격력 : " + gladiator.power);
		System.out.println("Wizard - 무기 : " + wizard.heal + ", 체력 : " + wizard.hp + ", wizard : " + wizard.power);
	}
}

class GameCharacter {
	String name;
	int hp;
	int power;

	public void attack(String name, Object target) {
		System.out.println(name + " : 적 " + target + "을 향해 공격");
	}

}

class Warrior extends GameCharacter {
	String weapon;

	public void powerAttack(String name, Object target) {
		this.name = name;
		System.out.println(name + " : 적 " + target + "을 향해 파워공격");
	}
}

class Gladiator extends GameCharacter {
	String shield;

	public void defence(String name, Object target) {
		this.name = name;
		System.out.println(name + " : 아군 " + target + " 방어");
	}
}

class Wizard extends GameCharacter {
	String heal;

	public void healing(String name, Object target) {
		this.name = name;
		System.out.println(name + " : 아군 " + target + "에게 구원 사용");
	}
}