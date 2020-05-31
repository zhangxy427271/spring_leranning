import com.spring.you.dao.UserDaoImpl;
import com.spring.you.dao.UserMySqlDaoImpl;
import com.spring.you.dao.UserOracleDaoImpl;
import com.spring.you.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    public static void main(String[] args) {
        //用户直接调用业务层，不对Dao层进行接触
       // UserServiceImpl userService = new UserServiceImpl();
        //1.0 需求变更引起原有代码变更，
        // 程序主动创建对象，控制权在程序员手上
        //userService.getUser();

        //2.0 需求变更不会引起原有代码的变更
        //  程序不在具有主动性，变为被动接收对象，控制权在用户手上
        //userService.setUserDao(new UserDaoImpl());
        //userService.setUserDao(new UserOracleDaoImpl());
//        userService.setUserDao(new UserMySqlDaoImpl());
//        userService.getUser();

        /**
         * 实现控制反转，需求的变更不会对原有代码造成影响。系统耦合性降低
         * 这是IOC的原型
         */

        /**
         * 3.0 shiyongSpring容器
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //容器在手，想要什么直接get
        UserServiceImpl userService1 = (UserServiceImpl) context.getBean("UserServiceImpl");

        userService1.getUser();


    }
}
