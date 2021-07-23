package ChainOfResponsipility.Demo3;


/**
 * @author TF014268
 * @description url过滤器
 * @since 2021/7/14 0014 17:16
 */
public class URLFilter implements MyFilter {

    @Override
    public void doFilter(MyResquest resquest, MyResponse response, MyFilterChain myFilterChain) {
        resquest.setStr(resquest.getStr().replace("baidu.com","http://www.baidu.com"));
        System.out.println("URLFilter--request--执行了");
        myFilterChain.doFilter(resquest,response);
        response.getStr();
        System.out.println("URLFilter--response--执行了");
    }
}
