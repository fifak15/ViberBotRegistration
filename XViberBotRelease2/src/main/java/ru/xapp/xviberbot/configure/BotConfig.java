package ru.xapp.xviberbot.configure;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Configuration
@ConfigurationProperties(prefix = "bot")
public class BotConfig {
    private String token;
    private String username;
}

