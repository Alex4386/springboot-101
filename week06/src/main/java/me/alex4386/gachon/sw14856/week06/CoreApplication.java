package me.alex4386.gachon.sw14856.week06;

import me.alex4386.gachon.sw14856.week06.controllers.UserController;
import me.alex4386.gachon.sw14856.week06.services.EmailService;
import me.alex4386.gachon.sw14856.week06.services.MessageService;
import me.alex4386.gachon.sw14856.week06.services.TwitterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@SpringBootApplication
public class CoreApplication {

    private static ApplicationContext context =
            new AnnotationConfigApplicationContext(CoreApplication.class);
    private static boolean shouldPrintBean = true;

    @Bean
    public MessageService getEmailService() {
        return new EmailService();
    }

    @Bean
    public MessageService getTwitterService() {
        return new TwitterService();
    }

    @Bean
    public UserController userController() {
        return new UserController();
    }

    public static void main(String[] args) {
        if (shouldPrintBean) {
            printBeans();
        } else {
            run(args);
        }
    }

    public static void run(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }

    public static void printBeans() {
        System.out.println("Spring Beans:");
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println("core: "+beanName);
        }
    }

}
