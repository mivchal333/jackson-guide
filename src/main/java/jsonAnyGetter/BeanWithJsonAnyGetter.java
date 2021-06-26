package jsonAnyGetter;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.Map;

public class BeanWithJsonAnyGetter {
    public String name;
    private Map<String, String> properties;

    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return properties;
    }

    public BeanWithJsonAnyGetter(String name, Map<String, String> properties) {
        this.name = name;
        this.properties = properties;
    }
}
