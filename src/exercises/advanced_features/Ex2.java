package exercises.advanced_features;

public class Ex2 {
    public static void main(String[] args) {
        Game game = new Soccer();
        game.play(); //L1
        Soccer soccer = (Soccer) game;
        soccer.play("myBall"); //L2
        soccer.play(); //L3
        ((Soccer) game).play("myBall2"); //L4
    }
}

class Game {
    public void play() {
        System.out.println("Playing...");
    }
}

class Soccer extends Game {
    public void play(String ball) {
        System.out.println("Playing soccer with " + ball);
    }
}