package chap6;
//ไม่สมบูรณ์ เพราะเอา method ของElectricAppliance ไม่ครบ
abstract class Fan1 extends ElectricAppliance {

    @Override//Implement Method การเขียนทับของ Method superclass
    public void on() {
        System.out.println("Fan : on()");
    }

    

    @Override
    public void off() {
        System.out.println("Fan : off()");
    }

}
//สมบูรณ์แล้ว เพราะเอา method ของ Fan1 แล้วเพิ่ม method ของElectricAppliance จนครบ
class Fan2 extends Fan1 {

    @Override
    public void work() {
        System.out.println("Fan : work()");
    }

}

public class AbstractClassExample1 {

    public static void main(String[] args) {
        //new ElectricAppliance(); compile error
        //newFan1(); compile error
        Fan2 f2 = new Fan2();
        f2.on();
        f2.off();
        f2.work();
    }

}
