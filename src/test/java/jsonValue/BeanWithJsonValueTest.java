package jsonValue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class BeanWithJsonValueTest {

    @Test
    void shouldSerializeEntireObjectAsString() throws JsonProcessingException {
        BeanWithJsonValue bean = new BeanWithJsonValue("id1", "name1");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(bean);

        assertThat(json, equalTo("\"name1\""));
    }

}
