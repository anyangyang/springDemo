package autowireTest;

public class Person {
    private String name;


    // 有一个 set 方法,方便容器将成员变量的数据注入
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  void printName(){
        System.out.println("name:"+name);
    }



}
