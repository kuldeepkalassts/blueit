package config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

@ConfigurationProperties("blueit")
public class BlueitProperties {

    /**
     * This is our welcome message
     */
    private String welcomeMessage = "Hello World";

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
}
