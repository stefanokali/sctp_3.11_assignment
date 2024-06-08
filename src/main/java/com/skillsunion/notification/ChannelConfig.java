package com.skillsunion.notification;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChannelConfig {
    @Bean
    public Channel channel() {
        // Configure our email service bean
        Channel channel = new Channel();
        channel.setType("SMS");
        return channel;
    }
}