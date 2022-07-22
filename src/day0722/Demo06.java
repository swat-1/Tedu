package day0722;

import java.util.Scanner;

//随机加法运算器
public class Demo06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0; //得分
        for (int i = 1; i <= 10; i++) { //10次     (1)25+10=?
            int a = (int) (Math.random() * 100); //加数a(0到99之间)
            int b = (int) (Math.random() * 100); //加数b(0到99之间)
            int result = a + b; //预存正确答案
            System.out.println("(" + i + ")" + a + "+" + b + "=?"); //1)出题
            System.out.println("算吧!");
            int answer = scan.nextInt(); //2)答题
            if (answer == -1) { //3)判题
                break;
            }
            if (answer == result) {
                System.out.println("答对了");
                score += 10; //答对1题，加10分
            } else {
                System.out.println("答错了");
            }
        }
        System.out.println("总分为:" + score);


    }
}