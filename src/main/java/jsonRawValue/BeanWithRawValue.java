package jsonRawValue;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class BeanWithRawValue {

    // it can be JSON object in string from
    @JsonRawValue
    private final String name;

    public BeanWithRawValue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
