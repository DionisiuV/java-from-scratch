package exercises.advanced_features;

public class Ex5_1 {
    public static void main(String[] args) {
        Ex5_1 ex = new Ex5_1();
        try {
            ex.doPrint();
            ex.doList();
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