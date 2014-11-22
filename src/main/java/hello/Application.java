package hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

/**
 * Created by Administrator on 2014/11/15.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {


    @Bean
    MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("128KB");
        factory.setMaxRequestSize("128KB");
        return factory.createMultipartConfig();
    }
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//          SpringApplication.run(ScheduledTasks.class);
//        }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
