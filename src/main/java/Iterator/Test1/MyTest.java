package Iterator.Test1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author TF014268
 * @description test
 * @since 2021/6/25 0025 17:05
 */
public class MyTest {

    @Test
    public void test1(){
        //MyList
        MyCollection list = new MyList();
        for(int i=0;i<8;i++){
            list.add("test" + i);
        }
        System.out.println(list.size());
    }

    @Test
    public void test2(){
        //MyLinkedList
        MyCollection list = new MyLinkedList();
        for(int i=0;i<7;i++){
            list.add("test" + i);
        }
        System.out.println(list.size());
    }

    @Test
    public void test3(){
        List<String> list33 = new LinkedList<>();
        list33.add("0");
        list33.add("1");
        list33.add("2");
        list33.add("3");
        list33.add("4");
        list33.add("5");
        list33.add("6");
        list33.add("7");

        Iterator<String> iterator = list33.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test4(){
        List<String> list33 = new ArrayList<>();
        list33.add("0");
        list33.add("1");
        list33.add("2");
        list33.add("3");
        list33.add("4");
        list33.add("5");
        list33.add("6");
        list33.add("7");

        Iterator<String> iterator = list33.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
