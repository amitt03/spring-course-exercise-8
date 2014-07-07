package springcourse.solutions.exercise8.controller.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Amit Tal
 * @since 4/6/14
 */
@Configuration
@EnableWebMvc
@ComponentScan("springcourse.solutions.exercise8.controller")
public class ControllerConfig {
}
