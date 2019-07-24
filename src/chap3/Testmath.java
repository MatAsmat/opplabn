package chap3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Testmath {

    public static void main(String[] args) {
        double pi = Math.PI;
        BigDecimal bd = new BigDecimal(pi);
        System.out.println("PI : " + pi);
        System.out.println(bd.setScale(2, RoundingMode.UP));//cut settt
    }

}
