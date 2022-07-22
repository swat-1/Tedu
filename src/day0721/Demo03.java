package day0721;

import javax.swing.*;
import java.awt.*;

public class Demo03 {
    public static void main(String[] args) {
        //需求:陈怡涵脑残年龄计算器

        JFrame win1 = new JFrame("年龄计算器--焦亚明");
        win1.setSize(400, 200);
        win1.setLocationRelativeTo(null);

        JPanel panel = new JPanel();              //面板初始化
        JLabel label = new JLabel("年龄：");  //标签初始化并添加内容
        Font font1 = new Font("黑体", Font.BOLD, 30);//设置字体
        JLabel result = new JLabel("您已经生活了：");  //标签初始化并添加内容
        Font font2 = new Font("行楷", 0, 25);//设置字体
        JTextField text = new JTextField();      //文本框初始化
        text.setPreferredSize(new Dimension(60, 30));
        //创建按钮
        JButton button1 = new JButton("开始计算");
        button1.setPreferredSize(new Dimension(100, 40));
        JButton button2 = new JButton("重置");
        button2.setPreferredSize(new Dimension(100, 40));
        //按钮事件1,当按钮按下后,自动执行密码
        //Action:动作 , listener :监听器
        button1.addActionListener(e -> {
            //将文本框输入的字符串用string s变量来接收
            String s = text.getText();
            //用i接收s转换的int类型的文本框数据
            int i = Integer.parseInt(s);
            //判断用户输入是否是正常年龄范围
            if (i >= 0 && i <= 100) {
                result.setText("您已经生活了：" + text.getText() + "年");
            } else {
                result.setText("请正确输入年龄");
            }
        });
        //按钮事件2,重置
        button2.addActionListener(e -> {
            result.setText("请输入年龄");
        });

        //结果标签大小设定
        result.setPreferredSize(new Dimension(350, 100));
        //前后字样式体赋值给标签
        label.setFont(font1);
        result.setFont(font2);


        //必须安装顺序进行显示
        panel.add(label);                        //面板上添加标签
        panel.add(text);                         //面板上添加文本框(先添加标签后再添加文本框)
        panel.add(button1);                      //面板添加按钮1
        panel.add(button2);                      //面板添加按钮2
        panel.add(result);                       //面板上添加结果
        win1.add(panel);                         //面板添加到窗口中
        win1.setVisible(true);                   //显示win窗口
    }
}
