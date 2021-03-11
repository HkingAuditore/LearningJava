package Unit;

import org.jetbrains.annotations.NotNull;

public class Hero extends Unit {
	float sp;
	float attack;
	float defence;

	public Hero() {
		super();
	}

	public Hero(String name, float hp, float speed) {
		super(name, hp, speed);
	}

	public float Attack(@NotNull Hero hero) {
		hero.hp -= this.attack;
		return hero.hp;
	}

	public static float Attack(Hero hero0, Hero hero1) {
		return hero0.Attack(hero1);
	}

}
