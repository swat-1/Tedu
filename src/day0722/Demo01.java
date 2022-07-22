package day0722;

import javax.swing.*;
import java.awt.*;

public class Demo01 {
    public static void main(String[] args) {
        //窗口,面板,按钮初始化
        JFrame win = new JFrame("测试");
        JFrame win2 = new JFrame("弹出");
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel("弹出测试");
        JButton button = new JButton("测试");
        JButton button1 = new JButton("关闭");
        //设置窗口大小和位置
        win.setSize(500,600);
        win2.setSize(400,300);
        //主窗口居中
        win.setLocationRelativeTo(null);
        //设置button大小和label中的字体显示
        button.setPreferredSize(new Dimension(450,80));
        button1.setPreferredSize(new Dimension(200,80));
        Font font = new Font("黑体", Font.PLAIN, 80);
        Font font1 = new Font("黑体", Font.PLAIN, 25);
        button.setFont(font);
        button1.setFont(font1);
        label.setFont(font);
        //


        button.addActionListener(e -> {
            //System.out.println("计算");
            win2.setVisible(true);
        });
        button1.addActionListener(e -> {
            //System.out.println("计算");
            win2.setVisible(false);
        });



        //逐条运行最终显示窗口

        panel.add(button);
        panel2.add(button1);
        panel2.add(label);
        win.add(panel);
        win2.add(panel2);
        win.setVisible(true);
        win2.setLocationRelativeTo(win);
    }
}
