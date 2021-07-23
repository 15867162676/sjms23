package ChainOfResponsipility.Demo2;

/**
 * @author TF014268
 * @description url过滤器
 * @since 2021/7/14 0014 17:16
 */
public class URLFilter implements MyFilter{
    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace("baidu.com","http://www.baidu.com");
        msg.setMsg(r);
        System.out.println("URLFilter执行了**");
        return true;
    }
}
