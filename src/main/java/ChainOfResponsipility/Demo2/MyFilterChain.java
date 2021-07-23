package ChainOfResponsipility.Demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TF014268
 * @description 责任链
 * @since 2021/7/14 0014 17:20
 */
//这里实现MyFilter是为了方便串联起多个MyFilter类型的责任链
public class MyFilterChain implements MyFilter{
    List<MyFilter> filterList = new ArrayList<>();

    /**
     * 添加filter的方法
     * @param myFilter
     * @return
     *
     * 这里返回MyFilterChain
     * 是为了方便添加的时候直接  .addFilter()
     */
    public MyFilterChain addFilter(MyFilter myFilter){
        filterList.add(myFilter);
        return this;
    }

    /**
     * 执行责任链中的过滤器
     * @param msg
     * @return
     */
    @Override
    public boolean doFilter(Msg msg) {
        for(MyFilter myFilter : filterList){
            if(!myFilter.doFilter(msg)){
                return false;
            }
        }
        return true;
    }
}
