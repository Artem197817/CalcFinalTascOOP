package modelCalculator;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"calculator", "modelCalculator", "service", "view"})
public class CalculatorConfig {
}
