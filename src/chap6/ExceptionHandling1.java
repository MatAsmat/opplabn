package chap6;

public class ExceptionHandling1 {

    public static void main(String[] args) {
        //unchecked
        try {
            int zero = 0;
            int result = 1500 / zero;
        } catch (Exception e) {
            System.out.println("Hi");
        }
        

        try {
            int x[] = new int[2];
            x[0] = 5;
            x[1] = 15;
            x[3] = 20;
        } catch (Exception e) {
            System.out.println("Hello");
        }
        
        try {
            String str = null;
        Exceptionnull str.toLowerCase();
        }
            
        } catch (Exception e) {
        }
   String num = "594234054"; //==>ข้อความจะต้องเป็นตัวเลขเท่านั้น เช่น "123" ถึงจะRunได้
        int myNum = Integer.parseInt(num);

        System.out.println(
                "myNum = " + myNum);
        try {
            String num = "aaaaaa";
            int myNum = Integer.parseInt(num);
            System.out.println("myNum = " + myNum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("กรุณาจ่ายเงินเป็นจำนวนเต็มค่ะ");
        }
         ==  > การแก้Exception

    
        try {
            String num = "594234054";
            int myNum = Integer.parseInt(num);
            System.out.println("myNum = " + myNum);
        } catch (NumberFormatException e) {
            System.out.println("กรุณาจ่ายเงินเป็นจำนวนเต็มค่ะ");
        }

        try {
            String num = "1111";
            int myNum = Integer.parseInt(num);
            System.out.println("myNum = " + myNum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("กรุณาจ่ายเงินเป็นจำนวนเต็มค่ะ");
        } catch (NumberFormatException e1) {
            System.out.println("จับได้แล้ว");
        } finally {
            //System.out.println("Bye......");
            System.out.println(0);//จะไม่ทำงานในไบนารี
             * * * 1 try ได้หลาย catch   * * *
                        try {
                            String num = "1111";
                            int myNum = Integer.parseInt(num);
                            System.out.println("myNum = " + myNum);
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("กรุณาจ่ายเงินเป็นจำนวนเต็มค่ะ");
                        } catch (NumberFormatException e1) {
                            System.out.println("จับได้แล้ว");
                        } finally {//ทำทุกครั้ง
                            //System.out.println("Bye......");
                            System.exit(0);//การแก้การไม่ทำงานในไบนารี
                            try {
                                String num = "aaa";
                                int myNum = Integer.parseInt(num);
                                System.out.println("myNum = " + myNum);
                            } catch (Exception e) {
                                System.out.println("กรุณาจ่ายเงินเป็นจำนวนเต็มค่ะ");
                                try {
                                    String num = "aaa";
                                    int myNum = Integer.parseInt(num);
                                    System.out.println("myNum = " + myNum);
                                } catch (Exception e) {//จับแม่
                                    System.out.println("กรุณาจ่ายเงินเป็นจำนวนเต็มค่ะ");

                                } catch (NumberFormatException e1) {//จับลูก
                                    System.out.println("จับได้แล้ว");
                                    // ***ถ้าจับแม่ก่อน จะจับลูกไม่ได้ ต้องจับลูกก่อนแม่
                                    try {
                                        String num = "aaa";
                                        int myNum = Integer.parseInt(num);
                                        System.out.println("myNum = " + myNum);
                                    } catch (NumberFormatException e1) {//จับลูก
                                        System.out.println("จับได้แล้ว");
                                    } catch (Exception e) {//จับแม่
                                        System.out.println("กรุณาจ่ายเงินเป็นจำนวนเต็มค่ะ");
                                        // ***จับลูกก่อน คอมไพล์ผ่าน

                                    }
                                }
                            }
