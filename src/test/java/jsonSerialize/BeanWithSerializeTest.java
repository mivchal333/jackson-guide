package jsonSerialize;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class BeanWithSerializeTest {
    @Test
    void shouldSerializeLocalDateField() throws JsonProcessingException {
        BeanWithSerialize bean = new BeanWithSerialize(LocalDate.of(2021, 12, 10), "name1");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(bean);

        assertThat(json, equalTo("{\"date\":\"10---12-2021\",\"name\":\"name1\"}"));
    }
}
