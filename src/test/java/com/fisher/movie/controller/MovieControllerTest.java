package com.fisher.movie.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
class MovieControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test

    @Sql("sql/add-movies-for-brad.sql")
    void getMovies() throws Exception {
        String expectedJson = """
                            ["Troy", "Inglourious Basterds", "Mr and Ms Smith"]
                            """;
        this.mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/moviesWithActor")
                        .param("actorName", "Brad Pitt"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJson));
    }
}