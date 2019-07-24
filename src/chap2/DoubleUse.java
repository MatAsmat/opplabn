package chap2;

public class DoubleUse {

    public static void main(String[] args) {//static int
        System.out.println("MIN :" + Double.MIN_VALUE);
        System.out.println("MAX :" + Double.MAX_VALUE);
        System.out.println("SIZE :" + Double.SIZE);

        Double xx = new Double(555.25);//put string
        System.out.println("convert string to double : " + Double.parseDouble("452.587"));
        System.out.println("convert Double to int : " + xx.intValue());
    }

}
