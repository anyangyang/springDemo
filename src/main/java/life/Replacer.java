package life;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class Replacer implements MethodReplacer {

    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        String name = (String) objects[0];
        Integer age = (Integer) objects[1];
        System.out.println("reimplement:" + "name:" + name + " age:" + age);
        return null;
    }
}
