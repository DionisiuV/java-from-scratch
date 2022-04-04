package advanced_features.abstract_concept;

public class AnonymousClass {
    public static void main(String[] args) {
        Readable readable = new Student();
        //readable.read();

        new MyClass();
        Readable r = new Readable() {
            @Override
            public void read() {
                System.out.println("Reading...");
            }

            @Override
            public void merge() {
                System.out.println("Merging...");
            }

            private void print() {
                //
            }
        };
        useExample(r);

        //r.read();
        //System.out.println(r);

        //Writable writable = new Student();
        //writable.write();

        Writable w = new Writable() {
            @Override
            public void write() {
                System.out.println("Writing...");
            }

            @Override
            public void merge() {
                System.out.println("Merging...");
            }
        };
        w.write();
    }

    static void useExample(Readable r) {
        r.read();
    }
}

abstract class Writable {
    public abstract void write();
    public abstract void merge();
}

//@FunctionalInterface
interface Readable {
    void read();
    void merge();
    //int hashCode();
    //String toString();
}

class Student implements Readable {
    @Override
    public void read() {
        System.out.println("Reading...");
    }

    @Override
    public void merge() {
        System.out.println("Merging...");
    }
}

//class Student extends Writable {
//    @Override
//    public void write() {
//        System.out.println("Writing...");
//    }
//
//    @Override
//    public void merge() {
//        System.out.println("Merging...");
//    }
//}

class MyClass {}