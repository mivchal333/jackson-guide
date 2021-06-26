package jsonGetter;

public class BeanWithoutGetter {
    private final String id;
    private final String name;

    public BeanWithoutGetter(String id, String name) {
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
