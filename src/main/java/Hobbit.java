

public class Hobbit extends Character {
    public Hobbit() {
        super(0, 3, new HobbitKickStrategy());
    }

    public void toCry() {
        System.out.println("Hobbit cries: 'Oh nooo!'");
    }
}
