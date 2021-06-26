package jsonRootName;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class BeanWithRootValueTest {
    @Test
    void shouldUnwrapRawValue() throws JsonProcessingException {
        BeanWithRootValue bean = new BeanWithRootValue("id1", "name1");
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        String json = mapper.writeValueAsString(bean);

        assertThat(json, equalTo("{\"beanRootWrapper\":{\"id\":\"id1\",\"name\":\"name1\"}}"));
    }


}
