package autowireTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {

        public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 根据 Customer 在spring 配置文件的id来获取bean
        Customer customer = (Customer)context.getBean("customer");
        customer.printName();
    }
}
