package tw.waterball.foop.hw2.provided;

public class OnePunch {

	public void perform(Target target) {
		target.takeOnePunchDamage(FixedRandom.nextInt(300));
	}

	public int getMpCost() {
		return 180;
	}

}
