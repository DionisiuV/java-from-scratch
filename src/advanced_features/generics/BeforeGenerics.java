package advanced_features.generics;

public class BeforeGenerics {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Designer designer = new Designer();

        ItEmployee itEmployee = new ItEmployee();
        //Someone may set an ItEmployee to be a Programmer.
        itEmployee.setObj(programmer);
        //Someone else may mistakenly set an ItEmployee to be a Designer.
        itEmployee.setObj(designer);
        //When trying to get an ItEmployee as a Designer, everything works fine. As it's last set.
        Designer d = (Designer) itEmployee.getObj();
        //When trying to get an ItEmployee as a Programmer, a ClassCastException is thrown.
        //Programmer p = (Programmer) itEmployee.getObj();

        Object obj = itEmployee.getObj();
        if (obj instanceof Programmer) {
            System.out.println("Is-a Programmer.");
        } else if (obj instanceof Designer) {
            System.out.println("Is-a Designer.");
        }
    }
}

class ItEmployee {
    //We want to be any object.
    private Object obj;

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }
}

class Programmer {}

class Designer {}