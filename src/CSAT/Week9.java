package CSAT;

public class Week9 {
    public static void main(String [] args) {
        final int SUB = 12;
        int[] x = new int[SUB];
        int y = 100;
        for(int i = 0; i < SUB; i++)
        {
            x[i] = y;
            y += 10;
        }

        System.out.println(x[8]);
    }

}
