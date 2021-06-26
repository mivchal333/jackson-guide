package jsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

// jackson uses property order from this array
// skip incorrect field names
// not included fields goes next to included
@JsonPropertyOrder({"name", "notExistingProperty"})
public class BeanWithPropertyOrder {
    private final String id;
    private final String name;

    public BeanWithPropertyOrder(String id, String name) {
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
