package jsonPropertyOrder;

public class BeanWithoutPropertyOrder {
    // jackson uses class fields order (no getters order) by default
    private final String id;
    private final String name;

    public BeanWithoutPropertyOrder(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
