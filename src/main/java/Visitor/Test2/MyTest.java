package Visitor.Test2;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/5 0005 19:31
 */
public class MyTest {

    @Test
    public void test1(){
        BigHuYouCompany bigHuYou= new BigHuYouCompany();
        //可以很轻松的更换Visitor，但是要求BigHuYouCompany的结构稳定
        System.out.println("-----------------启动社交APP项目--------------------");
        bigHuYou.startProject(new SocialApp());
        System.out.println("-----------------启动短视频APP项目--------------------");
        bigHuYou.startProject(new LiveApp());
    }
}
