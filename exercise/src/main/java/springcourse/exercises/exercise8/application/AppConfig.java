package springcourse.exercises.exercise8.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author Amit Tal
 * @since 3/24/14
 */
@Configuration
@ComponentScan({"springcourse.exercises.exercise8.dao", "springcourse.exercises.exercise8.service", "springcourse.exercises.exercise8.util"})
@PropertySource({"classpath:books-analyzer.properties", "classpath:members.properties"})
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer configurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
