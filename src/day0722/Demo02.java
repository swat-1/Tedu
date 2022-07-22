package day0722;

import javax.swing.*;
import java.awt.*;

public class Demo02 {
    public static void main(String[] args) {
        //初始化各类组建
        JFrame win = new JFrame("计算你的年龄");
        JFrame win2 = new JFrame("关于");
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel("年龄:");
        JLabel label2 = new JLabel("本软件享有版权,盗版必究");
        JLabel result = new JLabel("你已经活了:");
        JTextField textField = new JTextField();
        JButton button1 = new JButton("开始计算");
        JButton button2 = new JButton("重置");
        JButton button3 = new JButton("关于");
        JButton button4 = new JButton("知道了");

        //对组件进行配置
        win.setSize(1000, 600);
        win2.setSize(400, 300);
        textField.setPreferredSize(new Dimension(200, 80));
        button1.setPreferredSize(new Dimension(280, 80));
        button2.setPreferredSize(new Dimension(280, 80));
        button3.setPreferredSize(new Dimension(800, 80));
        button4.setPreferredSize(new Dimension(280, 80));
        Font font = new Font("呵呵", Font.PLAIN, 80);
        Font font2 = new Font("呵呵", Font.PLAIN, 40);
        Font font3 = new Font("呵呵", Font.BOLD, 20);
        win.setLocationRelativeTo(null);

        //设置相应的字体
        label.setFont(font);
        result.setFont(font);
        label2.setFont(font3);
        button1.setFont(font2);
        button2.setFont(font2);
        button3.setFont(font2);
        button4.setFont(font2);
        textField.setFont(font2);

        //设置每一个按钮作用

        button1.addActionListener(e -> {
            String s = textField.getText();
            int i = Integer.parseInt(s);
            if (i >= 0 && i <= 100) {
                result.setText("您已经生活了：" + textField.getText() + "年");
            } else {
                result.setText("输入有误");
            }

        });

        button2.addActionListener(e -> {
            result.setText("请重新输入年龄");
        });

        button3.addActionListener(e -> {
            win2.setVisible(true);
        });

        button4.addActionListener(e -> {
            win2.setVisible(false);
        });

        //按上下顺序生成窗口

        panel2.add(button4);
        panel2.add(label2);

        panel.add(label);
        panel.add(textField);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        win2.add(panel2);
        win.add(panel);
        panel.add(result);
        win.setVisible(true);


        win2.setLocationRelativeTo(win);
    }
}
