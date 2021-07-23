package ChainOfResponsipility.Demo2;

/**
 * @author TF014268
 * @description 敏感词过滤器
 * @since 2021/7/14 0014 17:18
 */
public class SensitiveWordsFilter implements MyFilter{
    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        if(r.indexOf("三国打")!=-1){
            //包含敏感词
            return false;
        }
        r = r.replace("三国杀","三国打");
        msg.setMsg(r);
        System.out.println("SensitiveWordsFilter执行了**");
        return true;
    }
}
