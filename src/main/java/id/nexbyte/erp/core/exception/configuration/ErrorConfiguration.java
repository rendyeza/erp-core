package id.nexbyte.erp.core.exception.configuration;

import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ErrorConfiguration {
    @Bean
    public ErrorAttributes errorAttributes() {
        return new id.nexbyte.erp.core.exception.configuration.ErrorAttributes();
    }
}
