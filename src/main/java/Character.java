


import lombok.Data;

@Data
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;


    public Character(int power, int hp, KickStrategy kickStrategy) {
        this.power = power;
        this.hp = hp;
        this.kickStrategy = kickStrategy;
    }


    public void kick(Character character) {
        kickStrategy.kick(this, character);
    }

    public boolean isAlive() {
        return hp > 0;
    }
}






