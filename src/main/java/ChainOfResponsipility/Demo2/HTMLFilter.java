package ChainOfResponsipility.Demo2;

/**
 * @author TF014268
 * @description html过滤器
 * @since 2021/7/14 0014 17:07
 */
public class HTMLFilter implements MyFilter{

    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace("<","[");
        r = r.replace(">","]");
        msg.setMsg(r);
        System.out.println("HTMLFilter执行了**");
        return true;
    }
}
