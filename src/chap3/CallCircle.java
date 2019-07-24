package chap3;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CallCircle {

    public static void main(String[] args) {
        Circle asmat = new Circle(2);
        System.out.println("Radius:" + asmat.getRadius());
        System.out.println("Area:" + asmat.computeArea());
        System.out.println("Circumference:" + asmat.computeCircumference());
        System.out.println("Diameter:" + asmat.computeDiameter());
        
    }
}  