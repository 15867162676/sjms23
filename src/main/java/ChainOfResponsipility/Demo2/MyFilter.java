package ChainOfResponsipility.Demo2;

/**
 * @author TF014268
 * @description 我的filter
 * @since 2021/7/14 0014 17:06
 */
public interface MyFilter {

    /**
     * 执行过滤的方法，返回boolean类型，方便当某个过滤器返回false时，可以终止责任链
     * @param msg
     * @return
     */
    boolean doFilter(Msg msg);
}
