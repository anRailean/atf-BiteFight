package spring_config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"page_object","scenario_context","step_definition"})
public class SpringConfig {
}
