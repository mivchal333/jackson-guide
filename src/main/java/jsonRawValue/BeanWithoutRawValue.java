package jsonRawValue;

public class BeanWithoutRawValue {

    // jackson wrap string value, doesn't matter what is inside
    private final String name;

    public BeanWithoutRawValue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
