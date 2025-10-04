

public class HobbitKickStrategy implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        if (attacker instanceof Hobbit) {
            ((Hobbit) attacker).toCry();
        }
    }
}
