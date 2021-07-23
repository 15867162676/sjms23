package ChainOfResponsipility.Demo2;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/15 0015 8:52
 */
public class MyTest {
    @Test
    public void test2(){
        Msg msg = new Msg();
        msg.setMsg("baidu.com查询<三国杀>,看能不能查到[三国打]:)");
        System.out.println("原有语句：");
        System.out.println(msg.getMsg());
        System.out.println("------------------------");
        //过滤责任链1
        MyFilterChain myFilterChain1 = new MyFilterChain();
        myFilterChain1.addFilter(new HTMLFilter()).addFilter(new URLFilter());
        //过滤责任链2
        MyFilterChain myFilterChain2 = new MyFilterChain();
        myFilterChain2.addFilter(new SensitiveWordsFilter());

        //把责任链2串联到责任链1上
        myFilterChain1.addFilter(myFilterChain2);

        System.out.println(myFilterChain1.doFilter(msg));
        System.out.println("执行过滤责任链1：");
        System.out.println(msg.getMsg());
    }

    @Test
    public void test1(){
        Msg msg = new Msg();
        msg.setMsg("baidu.com查询<三国杀>,看能不能查到[三国打]:)");
        System.out.println("原有语句：");
        System.out.println(msg.getMsg());
        System.out.println("------------------------");
        //过滤责任链1
        MyFilterChain myFilterChain1 = new MyFilterChain();
        myFilterChain1.addFilter(new HTMLFilter()).addFilter(new URLFilter());
        //执行过滤责任链1
        System.out.println(myFilterChain1.doFilter(msg));
        System.out.println("执行过滤责任链1：");
        System.out.println(msg.getMsg());
        System.out.println("------------------------");

        //过滤责任链2
        MyFilterChain myFilterChain2 = new MyFilterChain();
        myFilterChain2.addFilter(new SensitiveWordsFilter());
        System.out.println(myFilterChain2.doFilter(msg));
        System.out.println("执行过滤责任链2：");
        System.out.println(msg.getMsg());
    }
}
