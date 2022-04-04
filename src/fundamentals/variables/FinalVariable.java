package fundamentals.variables;

public class FinalVariable {
}

class Numbers {
    //final int i = 1;
    final int i;
    int j;
    int k;

//    {
//        i = 1;
//    }

    public Numbers(int j) {
        this.j = j;
        i = 3;
    }

    public Numbers(int j, int k) {
        this.j = j;
        this.k = k;
        i = 3;
    }
}