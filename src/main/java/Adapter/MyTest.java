package Adapter;

import org.junit.Test;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author TF014268
 * @description 适配器模式
 * @since 2021/7/6 0006 15:38
 */
public class MyTest {

    @Test
    public void test1() throws Exception {
        FileInputStream fis = new FileInputStream("c:/aa.text");
        //将InputStream类型转换为InputStreamReader   InputStreamReader继承了Reader
        //这一步就是在做适配
        InputStreamReader isr = new InputStreamReader(fis);
        //BufferedReader 只能接收Reader类型的
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while(line!=null && !line.equals("")){
            System.out.println(line);
        }
        br.close();
    }

    @Test
    public void test2(){
        Frame frame = new Frame();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
            }
        });
    }
}
