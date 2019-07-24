
package chap4;
public class ArrayTest {
    public static void main(String[] args) {
        // 1 มิติ
        String myStr[] = {"asmat1","asmat2","asmat3"};//ค่าelementใน{}
        for (int i = 0; i < myStr.length; i++) {
            String str = myStr[i];
            System.out.println("Str = "+str+"\t");
            
        }
    }
}
        /*2 มิติ
        String myStr1[][] = { {"1001","asmat1"}, {"1002","asmat2"}, {"1003","asmat3"} };
        for (int i = 0; i < myStr1.length; i++) {
           for (int j = 0; j < myStr1[i].length; j++) {//วนลูป2รอบ
                String mystr = myStr1[i][j];
               System.out.println("mystr = "+myStr1 [i][j] "\t");
               System.out.print("\t" + score[i][j]);
            }
            }
            System.out.println 
        }
    }
    
}
String myStr1*/


   