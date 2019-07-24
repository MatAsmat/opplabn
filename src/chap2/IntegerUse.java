
package chap2;


public class IntegerUse {
    public static void main(String[] args) {//static int
        System.out.println("MIN :"+Integer.MIN_VALUE);
        System.out.println("MAX :"+Integer.MAX_VALUE);
        System.out.println("SIZE :"+Integer.SIZE);
        
        Integer xx = new Integer(555);//put string
        System.out.println("convert string to int : "+Integer.parseInt("452"));
        System.out.println("convert string to double : "+xx.doubleValue());//double>> non-static variable
    
    }
    
}