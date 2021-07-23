package ChainOfResponsipility.Demo3;

/**
 * @author TF014268
 * @description 敏感词过滤器
 * @since 2021/7/14 0014 17:18
 */
public class SensitiveWordsFilter implements MyFilter {

    @Override
    public void doFilter(MyResquest resquest, MyResponse response, MyFilterChain myFilterChain) {
        resquest.setStr(resquest.getStr().replaceAll("三国打","三国杀"));
        System.out.println("SensitiveWordsFilter--resquest--执行了");
        myFilterChain.doFilter(resquest,response);
        System.out.println("SensitiveWordsFilter--response--执行了");
        response.getStr();
    }
}
