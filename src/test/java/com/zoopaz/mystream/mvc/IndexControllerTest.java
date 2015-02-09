package com.zoopaz.mystream.mvc;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 *
 * @author wsams
 */
public class IndexControllerTest {
    
    public IndexControllerTest() {
    }

    @Test
    public void testGetIndex() throws Exception {
        IndexController index = new IndexController();
        MockMvc mvc = standaloneSetup(index).build();

        mvc.perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(view().name("index"));
    }
    
}
