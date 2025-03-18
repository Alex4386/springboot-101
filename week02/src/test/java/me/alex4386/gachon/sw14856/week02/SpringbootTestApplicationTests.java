package me.alex4386.gachon.sw14856.week02;

import me.alex4386.gachon.sw14856.week02.hello.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringbootTestApplicationTests {
    @Test
    void testUserProperties() {
        User user = new User();
        user.setName("Alex");
        user.setAge(25);

        assertThat(user.getName()).isEqualTo("Alex");
        assertThat(user.getAge()).isEqualTo(25);
    }
}
