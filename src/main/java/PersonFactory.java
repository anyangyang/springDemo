import java.util.HashMap;
import java.util.Map;

public class PersonFactory {

    public static Person anyang = new Person("anyang", 26);
    public static Person keke = new Person("keke", 31);
    public static Person jun = new Person("jun", 30);

    public static Person getPerson() {
        return anyang;
    }

    public Person getKeKe() {
        return keke;
    }

    public Person getJun() {
        return jun;
    }
}
