package jsonGetter;

import com.fasterxml.jackson.annotation.JsonGetter;

public class BeanWithSimpleGetter {
    private final String id;
    private final String name;

    public BeanWithSimpleGetter(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    // jackson uses property key from getter.
    // "customName": "nameValue"
    @JsonGetter
    public String getCustomName() {
        return name;
    }
}
