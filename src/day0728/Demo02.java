package day0728;


import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextInt(String sc);
        char chs = new char [str.length();];
        char min = '\u4E00';
        char max = '\u9FA5';
        for(int i = 1; i <str.length(); i+=2 ){
            char c1 = str.charAt(i-1);
            char c2 = str.charAt(i);
            if ((c1>=min && c1<=max)&& (c2>=min && c2<=max)){
                chs [i-1] =c2;
                chs [i] = c1;

            }else {
                chs [i-1] =c1;
                chs [i] = c2;
            }
        }
        System.out.println();
    }
}
