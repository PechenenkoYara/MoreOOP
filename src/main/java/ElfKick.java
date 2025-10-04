

public class ElfKick implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        if (attacker.getPower() > defender.getPower()) {
            defender.setHp(0); // вбиває слабшого
            System.out.println("Elf kills the enemy!");
        } else {
            defender.setPower(defender.getPower() - 1);
            System.out.println("Elf decreases enemy's power by 1!");
        }
    }
}