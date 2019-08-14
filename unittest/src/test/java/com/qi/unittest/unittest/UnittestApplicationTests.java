package com.qi.unittest.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UnittestApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(UnittestApplicationTests.class);

    @Autowired
    private MockMvc mvc;

    @Test
    public void contextLoads() {
        System.out.println("unittest");
    }

    @Before
    public void before() throws Exception {
        logger.info("【before】");
    }

    @After
    public void after() throws Exception {
        logger.info("【after】");
    }

    @Test
    public void testUnitTest() throws Exception {
        logger.info("【testUnitTest】");
        mvc.perform(get("/unit")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_PLAIN))
                .andExpect(content().encoding("UTF-8"))
                .andExpect(content().string("unit Test"));
    }

}
