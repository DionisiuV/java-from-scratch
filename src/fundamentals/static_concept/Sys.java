package fundamentals.static_concept;

public class Sys {
    private static String data = "data";
    private String cache = "cache";

    public static void main(String[] args) {
        //1.
        System.out.println(data); //Called directly.
        clean(); //Called directly.
        Sys.clean(); //Called using the name of the class.

        //2.
        Sys sys = new Sys();
        System.out.println(sys.cache); //Called using an object of the class.
        sys.reboot(); //Called using an object of the class.
    }

    private static void clean() {
        System.out.println("Cleaning...");
    }

    private void reboot() {
        System.out.println("Rebooting...");
    }
}