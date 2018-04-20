package hello.greeting

import org.junit.Before
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup

@SpringBootTest
class GreetingControllerTest {
    private var mvc: MockMvc? = null

    @Before
    fun before() {
        mvc = standaloneSetup(GreetingController()).build()
    }

    @Test
    fun getHello() {
//        mvc!!.perform(MockMvcRequestBuilders.get("/greeting").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk)
//                .andExpect(content().string("Greetings from Spring Boot!"))
    }
}