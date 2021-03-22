package ru.netology.jsprb1.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.jsprb1.DevProfile;
import ru.netology.jsprb1.ProdProfile;

@Configuration
public class WebConfig {

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true")
    public DevProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "false")
    public ProdProfile prodProfile() {
        return new ProdProfile();
    }
}
