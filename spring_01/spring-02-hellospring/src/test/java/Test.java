import com.you.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        //获取Spring 的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //对象现在在Spring中管理了，我们要使用就直接去里面取就可以
        Hello hello = (Hello)context.getBean("hello");

        System.out.println(hello.toString());

    }
}
