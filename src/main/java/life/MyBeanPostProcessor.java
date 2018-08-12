package life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

    public MyBeanPostProcessor(){
        super();
        System.out.println(" [ MyBeanPostProcessor 构造器 ] 调用构造器进行实例化");
    }

    /**
     * @param o : bean
     * @param s : beanName
     * @return
     * @throws BeansException
     */
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println( s + " 调用 BeanPostProcessor.postProcessBeforeInitialization 对属性进行修改");
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println(s + " 调用 BeanPostProcessor.postProcessAfterInitialization 对属性进行修改");
        return o;
    }
}
