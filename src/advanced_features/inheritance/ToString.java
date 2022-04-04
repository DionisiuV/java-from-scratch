package advanced_features.inheritance;

public class ToString {
    public static void main(String[] args) {
        Flower redFlower = new Flower("Red");
        //System.out.println("ToString: " + redFlower.color);
        System.out.println(redFlower.toString());
        //System.out.println(redFlower);
    }
}

class Flower {
    String color;
    String shape;

    public Flower(String color) {
        this.color = color;
        //System.out.println("Flower: " + color);
    }

    @Override
    public String toString() {
        return "color from Flower class: " + color;
    }
}