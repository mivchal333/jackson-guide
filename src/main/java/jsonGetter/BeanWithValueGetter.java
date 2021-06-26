package jsonGetter;

import com.fasterxml.jackson.annotation.JsonGetter;

public class BeanWithValueGetter {
    private final String id;
    private final String name;

    public BeanWithValueGetter(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    // jackson uses annotation value as property key
    // "annotationValue" : "nameValue"
    @JsonGetter("annotationValue")
    public String getCustomName() {
        return name;
    }
}
