package jsonValue;

public class BeanWithoutJsonValue {
    private final String id;
    private final String name;

    public BeanWithoutJsonValue(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
