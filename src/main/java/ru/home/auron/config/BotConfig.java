package ru.home.auron.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("classpath:application.properties")
public class BotConfig {

    @Value("${telegram.botUsername}")
    String botUserName;

    @Value("${telegram.token}")
    String token;

}
