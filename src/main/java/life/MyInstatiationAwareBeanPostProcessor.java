package life;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

public class MyInstatiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {


    public MyInstatiationAwareBeanPostProcessor() {
        super();
        System.out.println(" [ MyInstatiationAwareBeanPostProcessor 构造器 ] ");
    }

    /**
     * bean 实例化之前调用
     *
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println(" [ MyInstatiationAwareBeanPostProcessor.postProcessBeforeInstantiation() ] ");
        return super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    /**
     * bean 实例化之后调用
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println(" [ MyInstatiationAwareBeanPostProcessor.postProcessAfterInstantiation() ] ");
        return super.postProcessAfterInstantiation(bean, beanName);
    }

    /**
     * 设置某个属性是调用
     *
     * @param pvs
     * @param pds
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        System.out.println(" [ MyInstatiationAwareBeanPostProcessor.postProcessPropertyValues() ] ");
        return super.postProcessPropertyValues(pvs, pds, bean, beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(" [ MyInstatiationAwareBeanPostProcessor.postProcessBeforeInitialization() ] ");
        return super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(" [ MyInstatiationAwareBeanPostProcessor.postProcessAfterInitialization() ] ");
        return super.postProcessAfterInitialization(bean, beanName);
    }
}
