package fundamentals.data_types.exercises;

public class Ex3 {
    //var s = 33_000;

    public static void main(String[] args) {
        //short s = 33_000;

        //var i = 1;
        var i = 1_000_000_000;
        //var s = 33_000;
        var l = 1_000_000_000L;
        //var s = (short) 1;

        System.out.println(((Object) l).getClass().getSimpleName());
    }
}