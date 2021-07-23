import com.springText.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        System.out.println(1);
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");  //会创建bean对象
        System.out.println(2);
        Person p = context.getBean("person",Person.class);//获取bean的实例对象  不需要强制转换

        Person p2 = context.getBean("person",Person.class);
        System.out.println(p==p2);  //如果是true  就是单例模式,如果是false则不是单例模式
    }
}
