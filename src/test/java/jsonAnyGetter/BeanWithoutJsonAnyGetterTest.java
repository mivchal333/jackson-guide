package jsonAnyGetter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class BeanWithoutJsonAnyGetterTest {

    @Test
    void shouldSerializePropertiesToFlat() throws JsonProcessingException {
        HashMap<String, String> map = new HashMap<>();
        map.put("property1name", "property1value");
        BeanWithoutJsonAnyGetter data = new BeanWithoutJsonAnyGetter("name1", map);

        String result = new ObjectMapper().writeValueAsString(data);

        assertThat(result, equalTo("{\"name\":\"name1\"}"));
    }
}
