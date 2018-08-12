package life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeTest implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

    private String name;
    private String address;
    private String phone;

    private BeanFactory beanFactory;
    private String beanName;


    public LifeTest() {
        System.out.println("[ LifeTest 构造器 ] 调用构造器进行实例化");
    }


    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("[ BeanFactoryAware ] 调用 BeanFactoryAware.setBeanFactory()");
        this.beanFactory = beanFactory;
    }

    public void setBeanName(String s) {
        System.out.println("[ BeanNameAware ] 调用 BeanNameAware.setBeanName()");
        this.beanName = beanName;
    }

    public void destroy() throws Exception {
        System.out.println("[ DisposibleBean ] 调用 destroy()");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("[ InitializingBean ] 调用 afterPropertiesSet()");
    }

    public void myInit(){
        System.out.println("[ 通过 Bean 标签自定义的初始化方法 ]");
    }

    public void myDestroy(){
        System.out.println("[ 通过 Bean 标签自定义的销毁方法 ]");
    }


    @PostConstruct
    public void initIt() throws Exception {
        System.out.println("[ PostConstruct 注解定义的 initIt() ]");
    }

    @PreDestroy
    public void cleanUp() throws Exception {
        System.out.println(" [ PreDestroy 注解定义的 cleanUp() ]");
    }


    public void setName(String name) {
        System.out.println("[ 注入属性 ] 注入属性 name");
        this.name = name;
    }

    public void setAddress(String address) {
        System.out.println("[ 注入属性 ] 注入属性 address");
        this.address = address;
    }

    public void setPhone(String phone) {
        System.out.println("[ 注入属性 ] 注入属性 phone");
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
