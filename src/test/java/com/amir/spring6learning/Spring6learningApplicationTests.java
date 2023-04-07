package com.amir.spring6learning;

import com.amir.spring6learning.domain.Beer;
import com.amir.spring6learning.services.BeerService;
import com.amir.spring6learning.services.BeerServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.core.Is.is;

//
//import java.sql.SQLOutput;
//
//@SpringBootTest
@WebMvcTest
class Spring6learningApplicationTests {
    @Autowired
    MockMvc mockMvc;
    @MockBean
    BeerService beerService;
    @Autowired
    ObjectMapper objectMapper;
    BeerServiceImpl beerServiceImpl = new BeerServiceImpl();

    @Test
    void createNewBeer() throws JsonProcessingException {
        Beer newBeer = beerServiceImpl.listBeer().get(0);
        newBeer.setVersion(null);
        newBeer.setId(null);

        given(beerService.createNewBeer(any(Beer.class))).willReturn(beerServiceImpl.listBeer().get(0));
        mockMvc.perform(post("/api/v1/beer")
                .)
    }

    @Test
    void getListBeer() throws Exception {
        given(beerService.listBeer()).willReturn(beerServiceImpl.listBeer());
        mockMvc.perform(get("/api/v1/Beer")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()",is(3)));
    }

    @Test
    void getBeerById() throws Exception {
        Beer testBeer = beerServiceImpl.listBeer().get(0);
        given(beerService.getBeerById(any(UUID.class))).willReturn(testBeer);

        mockMvc.perform(get("/api/v1/Beer/" + testBeer.getId())
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id", is(testBeer.getId().toString())))
                .andExpect(jsonPath("$.beerName", is(testBeer.getBeerName())));
    }
//	@Autowired
//	ApplicationContext applicationContext;
//	@Autowired
//	MyController myController;
//
//	@Test
//	void testAutowiredOfController(){
//		System.out.println(myController.sayHello());
//	}
//	@Test
//	void testGetControllerFromCtx(){
//		MyController controller = applicationContext.getBean(MyController.class);
//		System.out.println(controller.sayHello());
//	}
//
//	@Test
//	void contextLoads() {
//	}
//
}
