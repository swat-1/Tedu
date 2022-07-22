package day0721;

import javax.swing.*;

public class Demo02 {
    public static void main(String[] args) {
        JFrame win1 = new JFrame();
        JFrame win2 = new JFrame();
        win1.setSize(300,300);
        win2.setSize(800,800);
        //win1.setLocation(120,220);
        //win2.setLocation(0,0);
        JFrame win3 = new JFrame();
        win3.setSize(500,600);
        //win3.setLocation(1000,300);


        /*int windowWidth = win1.getWidth(); //获得窗体宽
        int windowHeight = win1.getHeight(); //获得窗体高
        Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包
        Dimension win2 = kit.getScreenSize(); //获取屏幕的尺寸
        int screenWidth = win2.width; //获取屏幕的宽
        int screenHeight = win2.height; //获取屏幕的高
        win1.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);//设置窗体居中显示*/




        win2.setVisible(true);
        win3.setVisible(true);
        win1.setVisible(true);
        win2.setLocationRelativeTo(null);
        win1.setLocationRelativeTo(win2);
        win3.setLocationRelativeTo(win2);

    }
}
