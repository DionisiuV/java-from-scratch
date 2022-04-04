package fundamentals.packages;



public class Package {
    public static void main(String[] args) {
        //System.out.println(Package.class.getPackageName());
        System.out.println(new Package().getClass().getPackageName());
        java.util.Date date;
        java.sql.Date date1;
    }
}