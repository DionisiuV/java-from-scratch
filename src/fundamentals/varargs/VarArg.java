package fundamentals.varargs;

public class VarArg {
    public static void main(String... args) {
        //print("Game1");
        //print("Game1", "Game2", "Game3", "Game4");
        //print();

        String[] games = {"Game1", "Game2", "Game3", "Game4"};
        print(games);
    }

    private static void print(String... games) {
        //System.out.println(games.length);
        System.out.println(games[0]);
        for (String game : games) {
            //System.out.println(game);
        }
    }
}