package jsonRootName;

import com.fasterxml.jackson.annotation.JsonRootName;

// wrap object into property value with key 'beanRootWrapper'
@JsonRootName(value = "beanRootWrapper")
public class BeanWithRootValue {
    private final String id;
    private final String name;

    public BeanWithRootValue(String id, String name) {
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
