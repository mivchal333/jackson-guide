package jsonPropertyOrder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class BeanWithPropertyOrderTest {

    @Test
    void shouldUseJsonPropertyOrder() throws JsonProcessingException {

        BeanWithPropertyOrder bean = new BeanWithPropertyOrder("id1", "name1");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(bean);
        assertThat(json, equalTo("{\"name\":\"name1\",\"id\":\"id1\"}"));
    }
}
