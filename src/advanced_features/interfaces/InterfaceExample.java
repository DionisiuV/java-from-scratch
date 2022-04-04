package advanced_features.interfaces;

public class InterfaceExample implements I1, I2 {
    @Override
    public void hi() {
        System.out.println(I1.i);
        System.out.println(I1.ii);
        System.out.println(I2.i);
    }

    @Override
    public int hi(String message) {
        return 0;
    }


}

interface I1 {
    int i = 1;
    String ii = "";

    void hi();
}

interface I2 {
    String i = "22";

    int hi(String message);
}