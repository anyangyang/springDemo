package life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    /**
     * 在 AbstractApplicationContext 的 refresh() 调用 invokeBeanFactoryPostProcessors() 时被调用
     * 1、invokeBeanFactoryPostProcessors() 会先根据优先级向 BeanFactory 中注册 BeanFactoryPostProcessor
     * 2、从 beanFactory 中获取数据
     */
    public MyBeanFactoryPostProcessor() {
        super();
        System.out.println(" [ MyBeanFactoryPostProcessor 构造器 ] ");
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println(" [ MyBeanFactoryPostProcessor.postProcessBeanFactory() ] ");
        BeanDefinition bd = configurableListableBeanFactory.getBeanDefinition("lifeTest");
        bd.getPropertyValues().addPropertyValue("phone", "110");
    }
}
