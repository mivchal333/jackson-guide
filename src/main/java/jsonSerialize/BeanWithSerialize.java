package jsonSerialize;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;

public class BeanWithSerialize {
    // jackson uses custom serializer
    @JsonSerialize(using = CustomLocalDateSerializer.class)
    private final LocalDate date;

    private final String name;

    public BeanWithSerialize(LocalDate date, String name) {
        this.date = date;
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
