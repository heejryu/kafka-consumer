package co.kr.kafkaconsumer1.common.configuration;

import co.kr.kafkaconsumer1.common.utils.DateUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public DateUtils dateUtils() {
        return new DateUtils();
    }
}
