package org.example.springlearn;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import org.springframework.beans.factory.annotation.Autowired;




import org.springframework.boot.test.context.SpringBootTest;


import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;



@SpringBootTest
@AutoConfigureMockMvc
class SpringLearnApplicationTests {



    @Autowired
    private MockMvc mockMvc;
    @Disabled
    @Test
    void testGetCountryException() throws Exception{
        mockMvc.perform(get("/countries/zz"))
                .andExpect(status().isNotFound());
    }
    @Disabled
    @Test
    void testGetCountry()
            throws Exception {


        mockMvc.perform(
                        get("/countries")
                )


                .andExpect(
                        status().isOk()
                )


                .andExpect(
                        jsonPath("$.code")
                                .value("IN")
                )


                .andExpect(
                        jsonPath("$.name")
                                .value("India")
                );


    }


}

