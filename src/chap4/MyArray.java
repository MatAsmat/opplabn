package chap4;

public class MyArray {

    public static void main(String[] args) {
        int x[] = {10, 20, 30, 40, 50, 60};
        for (int i = 0; i < x.length; i++) {//type1--> for loop
            int j = x[i];
            System.out.print("j = " + j + "\t");
        }
        System.out.println("");
        for (int i : x) {//type2--> for-each
            System.out.print("i = " + i + "\t");

        }

        System.out.println("");
        String Str[] = {"10", "20", "30", "40", "50", "60"};
        for (int i = 0; i < Str.length; i++) {
            String str = Str[i];
            System.out.print("Str = " + str + "\t");

        }
        System.out.println("");
        for (String str : Str) {
            System.out.print("Str = " + str + "\t");
        }
        System.out.println("");
        String str[][] = new String[3][5];//ต้องกำหนดจำนวนrow,column type1
    }
}
        /*System.out.println("");
       String str[][] = new String[3][5];
        String str[][] = {{"1", "A", "AA"}, {"2", "B", "BB"}, {"3", "C", "CC"}}; //type2
       for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                String data = str[i][j];
                System.out.println(data + "\t");

            }
            System.out.println("");
        }

    }
}//end class
