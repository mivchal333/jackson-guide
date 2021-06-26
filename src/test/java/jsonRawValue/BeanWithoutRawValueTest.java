package jsonRawValue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class BeanWithoutRawValueTest {

    @Test
    void shouldWrapValueAsString() throws JsonProcessingException {
        BeanWithoutRawValue bean = new BeanWithoutRawValue("{\"ala\":{\"inside\": \"czekolara\"}}");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(bean);

        // json: {"name":"{\"ala\":{\"inside\": \"czekolara\"}}"}
        assertThat(json, equalTo("{\"name\":\"ala\\\"inside\\\"czekolara{}\"}"));
    }
}
