package com.ey.digicomputax.coi.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
@DisplayName("Process Controller")
class ProcessControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void should_increment_count_after_hitting_a_process() throws Exception {
        String responseBody = this.mockMvc.perform(get("/start-process"))
                .andReturn().getResponse().getContentAsString();
        assertThat(responseBody).isEqualTo("Process started. Number of currently running process instances = 1");
        responseBody = this.mockMvc.perform(get("/start-process"))
                .andReturn().getResponse().getContentAsString();
        assertThat(responseBody).isEqualTo("Process started. Number of currently running process instances = 2");

    }
}