package ChainOfResponsipility.Demo3;

/**
 * @author TF014268
 * @description 我的filter
 * @since 2021/7/15 0015 15:56
 */
public interface MyFilter {

    void doFilter(MyResquest resquest,MyResponse response,MyFilterChain myFilterChain);
}
