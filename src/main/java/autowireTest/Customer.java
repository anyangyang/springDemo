package autowireTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
//
//    @Autowired
//    @Qualifier(value = "personB")
    private Person person;


//    // 如果使用默认方式 no 来装配 bean 需要有一个默认构造器
    public Customer() {
    }

    // 创建一个 构   造器

    public Customer(Person person) {
        this.person = person;
    }

    // 创建一个 set 方法

    public void setPerson(Person person) {
        this.person = person;
    }

    public void printName(){
        person.printName();
    }
}
