package ChainOfResponsipility.Demo3;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/15 0015 17:05
 */
public class MyTest {
    @Test
    public void test1(){
        MyFilterChain myFilterChain = new MyFilterChain();
        myFilterChain.addFilter(new HTMLFilter()).addFilter(new URLFilter()).addFilter(new SensitiveWordsFilter());

        MyResquest resquest = new MyResquest();
        resquest.setStr("baidu.com查询<三国杀>,看能不能查到[三国打]:)");
        MyResponse response = new MyResponse();
        myFilterChain.doFilter(resquest,response);
    }
}
