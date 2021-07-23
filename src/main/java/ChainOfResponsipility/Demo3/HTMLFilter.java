package ChainOfResponsipility.Demo3;

/**
 * @author TF014268
 * @description html过滤器
 * @since 2021/7/14 0014 17:07
 */
public class HTMLFilter implements MyFilter {

    @Override
    public void doFilter(MyResquest resquest, MyResponse response, MyFilterChain myFilterChain) {
        resquest.setStr(resquest.getStr().replace("<","[").replace(">","]"));
        System.out.println("HTMLFilter--resquest--执行了");
        myFilterChain.doFilter(resquest,response);
        response.getStr();
        System.out.println("HTMLFilter--response--执行了");
    }
}
