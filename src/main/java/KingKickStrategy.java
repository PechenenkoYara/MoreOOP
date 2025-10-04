

import java.util.Random;

public class KingKickStrategy implements KickStrategy {
    private Random random = new Random();

    @Override
    public void kick(Character attacker, Character defender) {
        int damage = random.nextInt(attacker.getPower()) + 1;
        defender.setHp(Math.max(0, defender.getHp() - damage));
        System.out.println("King deals " + damage + " damage!");
    }
}
