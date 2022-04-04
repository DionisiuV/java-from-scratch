package exercises.advanced_features;

public class Ex5_2 {
    public static void main(String[] args) {
        Ex5_2 ex = new Ex5_2();
        try {
            ex.doList();
            ex.doPrint();
        } catch (Exception e) {
            System.out.println("Caught " + e);
        }
    }

    public void doList() throws Exception {
        throw new Error("doList() Error Message");
    }

    public void doPrint() throws Exception {
        throw new RuntimeException("doPrint() Exception Message");
    }
}