package netology.boothw_1.internal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty("netology.profile.dev")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty("netology.profile.prod")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}