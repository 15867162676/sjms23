package ChainOfResponsipility.Demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TF014268
 * @description filter责任链
 * @since 2021/7/15 0015 16:06
 */
public class MyFilterChain {
    List<MyFilter> filterList = new ArrayList<>();

    //标记执行到第几个filter了
    int index = 0;

    //往责任链中添加过滤器
    public MyFilterChain addFilter(MyFilter myFilter){
        filterList.add(myFilter);
        return this;
    }

    //执行过滤器
    public void doFilter(MyResquest resquest,MyResponse response){
        if(index == filterList.size()){
            //已经执行到了最后一个
            return;
        }

        MyFilter myFilter = filterList.get(index);
        index++;

        //执行下一个的resquest
        myFilter.doFilter(resquest,response,this);
    }
}
