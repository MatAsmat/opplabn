//STRING
package labinroom;

import java.util.Scanner;

public class CountString {

    public static String str;
    public static int str2;

    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please Enter Sentence :");
            str = sc.nextLine();
            System.out.println("--------------------------------------------------");
            System.out.println("\tThe Sentence is :" + str);
            System.out.println("\tThe Sentence is(No spaces) : " + str.replace(" ", ""));
            str2 =str.length();
            System.out.println("\talphabets :" + str.length());
            String str1 = str.toUpperCase();
            int count = 0;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == 'A'
                        || str1.charAt(i) == 'E'
                        || str1.charAt(i) == 'I'
                        || str1.charAt(i) == 'O'
                        || str1.charAt(i) == 'U') {
                    count++; // ทำการนับเมื่อเป็น A E I O U 
                }
            }

            System.out.println("\tvowels :" + count);

            System.out.println("\tnot vowels :" + (str2 - count));

            int count1 = 0;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == '0'
                        || str1.charAt(i) == '1'
                        || str1.charAt(i) == '2'
                        || str1.charAt(i) == '3'
                        || str1.charAt(i) == '4'
                        || str1.charAt(i) == '5'
                        || str1.charAt(i) == '6'
                        || str1.charAt(i) == '7'
                        || str1.charAt(i) == '8'
                        || str1.charAt(i) == '9') {
                    count1++; // ทำการนับเมื่อเป็น 0 1 2 3 4 5 6 7 8 9 
                }
            }
            System.out.println("\tNumber :" + count1);

            int count2 = 0;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == '@'
                        || str1.charAt(i) == '#'
                        || str1.charAt(i) == '$'
                        || str1.charAt(i) == '%'
                        || str1.charAt(i) == '^'
                        || str1.charAt(i) == '&') {
                    count2++;
                }
            }

            System.out.println("\tSpecial character :" + count2);
            System.out.print("\nWould you like to Continue{Y/N]? :");
            str = sc.nextLine();
             System.out.println("__________________________________________________");
        } while (!"N".equals(str) && !"n".equals(str));
       System.out.println("_______________________EXIT_______________________");
    }

}//end

/*
โปรแกรมที่1
จงเขียนโปรแกรม
เพื่อนับจำนวนของสระภาษาอังกฤษ และอักขระที่ไม่ใชสระภาษาอังกฤษ ตัวเลข อักขระพิเศษ(!@#$%)
ของข้อความที่เขียนเข้าไปทางแป้นพิมพ์ หาค่าที่รับเข้ามามีspace ให้ตัด space ทิ้ง
-รับค่าทางแป้นพิมพ์
-ตัด space ทิ้ง
-นับ alphabets คือ อักขระ
-นับ vowel คือ สระ 
-นับไม่ใช่สระ not vowel
-นับ ตัวเลข
-นับอักระพิเศษ
-วนลูปรับค่า
*/
