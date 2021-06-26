package jsonAnyGetter;

import java.util.Map;

public class BeanWithoutJsonAnyGetter {
    public String name;
    // jackson will skip this map field
    private Map<String, String> properties;

    public BeanWithoutJsonAnyGetter(String name, Map<String, String> properties) {
        this.name = name;
        this.properties = properties;
    }
}
