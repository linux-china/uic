package org.mvnsearch.uic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * portal controller test
 *
 * @author linux_china
 */
@RunWith(SpringRunner.class)
@WebMvcTest(PortalController.class)
public class PortalControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testSayHelloWorld() throws Exception {
        this.mvc.perform(get("/").param("user", "jacky")
                .accept(MediaType.ALL))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World!!!"));

    }

}
