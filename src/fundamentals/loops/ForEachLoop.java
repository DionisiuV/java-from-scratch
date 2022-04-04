package fundamentals.loops;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] companies = {"Google", "Facebook", "Amazon", "Microsoft"};
        for (String company : companies) {
            //System.out.println(company);
        }

        int[] years = {1996, 2011, 2014, 2018, 2021};
        int index = 0;
        for (int year : years) {
            if (year == 2014) {
                System.out.println(year);
            }
            index++;
        }
        System.out.println(index);
    }
}