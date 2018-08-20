package life;

import helloWorld.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {


        System.setProperty("classPath", "classpath:applicationContext.xml");

        System.out.println("开始初始化容器");
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("${classPath}");
        System.out.println("初始化容器成功");

        LifeTest test = (LifeTest) context.getBean("lifeTest");
        System.out.println("LifeTest：" +test.getName() );
        LifeTest test1 = (LifeTest) context.getBean("a");
        System.out.println("LifeTest person name: " +test.getPerson().getName());
        System.out.println("LifeTest1：" +test.getName() );
        test.show();
        test.show("anyang", 24);

        System.out.println("开始关闭容器");
        context.registerShutdownHook();

    }

}
