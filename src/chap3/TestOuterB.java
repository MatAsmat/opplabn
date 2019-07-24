//***Member Class***//non-static
package chap3;

class OuterB {

    int outerAttribute1 = 5;
    static int outerAttribute2 = 10;

    void outerMethod1() {
        System.out.println("outerB : outerMethod1()");
    }

    static void outerMethod2() {
        System.out.println("outerB : outerMethod2()");

    }

    class MemberInner {

        int memberAttribute = 15;

        void memberInnerMethod() {
            System.out.println(memberAttribute);
            System.out.println(outerAttribute1 + "," + outerAttribute2);
            outerMethod1();
            outerMethod2();
        }
    }

}//end 

public class TestOuterB {

    public static void main(String[] args) {
        OuterB outObj = new OuterB();
        OuterB.MemberInner innerObj = outObj.new MemberInner();
        innerObj.memberInnerMethod();

    }
}//end
