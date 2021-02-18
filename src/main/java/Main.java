import com.alibaba.fastjson.JSONObject;
import demo.spring.rmi.HttpRequestPostTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        // 自定义 Bean
//        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory)context.getBeanFactory();
//        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
//        beanDefinition.setBeanClassName("Person");
//        beanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
//        beanDefinition.setLazyInit(false);
//        beanDefinition.setDependsOn();
//
//        PropertyValue nameProp = new PropertyValue("name", "jan");
//        PropertyValue ageProp = new PropertyValue("age", 14);
//        PropertyValue addressProp = new PropertyValue("address", "China");
//        MutablePropertyValues mutablePropertyValues = new MutablePropertyValues(Arrays.asList(nameProp, ageProp, addressProp));
//        beanDefinition.setPropertyValues(mutablePropertyValues);
//        beanFactory.registerBeanDefinition("person", beanDefinition);
//        Person person = (Person)context.getBean("person");
//        System.out.println("person: " + person == null ? null : person.toString());
//
//
//        // 静态工厂方法 z
//        Person anyang = (Person)context.getBean("personService");
//        System.out.println("anyang: " + anyang == null ? null : anyang.toString());
//
//        // 工厂方法
//        Person keke = (Person)context.getBean("keke");
//        System.out.println("keke: " + keke == null ? null : keke.toString());
//
//        Person jun = (Person)context.getBean("jun");
//        System.out.println("jun: " + jun == null ? null : jun.toString());
//
//        // constructor-base DI
//        Person alan = (Person)context.getBean("alan");
//        System.out.println("alan: " + alan == null ? null : alan.toString());
//
//        // setter-base DI
//        Person jaja = (Person)context.getBean("jaja");
//        System.out.println("jaja: " + jaja == null ? null : jaja.toString());

        // autowire


        // autowire model

        // method injection

        HttpRequestPostTest httpRequestPostTest = (HttpRequestPostTest)context.getBean("HttpRequestPostTest");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("mobilephone", "13611111111");
        jsonObject.put("password", "123456");
        httpRequestPostTest.getRemoteObj(jsonObject);
    }
}
