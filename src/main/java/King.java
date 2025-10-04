

import java.util.Random;

public class King extends Character {
    public King() {
        super(new Random().nextInt(11) + 5, // power 5–15
              new Random().nextInt(11) + 5, // hp 5–15
              new KingKickStrategy());
    }
}
