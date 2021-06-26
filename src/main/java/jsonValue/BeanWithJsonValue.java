package jsonValue;

import com.fasterxml.jackson.annotation.JsonValue;

public class BeanWithJsonValue {
    private final String id;
    private final String name;

    public BeanWithJsonValue(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }


    // jackson uses this getter to get whole object parse result.
    // whole object will be parsed to one string value
    @JsonValue
    public String getName() {
        return name;
    }
}
