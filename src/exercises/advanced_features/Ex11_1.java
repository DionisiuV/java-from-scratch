package exercises.advanced_features;

public class Ex11_1 {
    public static void main(String[] args) {
        Prime p1 = new Prime(13);
        Prime p2 = new Prime(13);

        //1.
        if (p1 == p2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        //2.
        if (p1.equals(p2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

class Prime {
    int num;

    Prime(int num) {
        this.num = num;
    }
}