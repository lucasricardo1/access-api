package com.github.lucasricardo1.access_api.infra;

import com.github.lucasricardo1.access_api.core.ports.UserServicePort;
import com.github.lucasricardo1.access_api.core.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public UserServicePort userServiceImpl(){
        return new UserService();
    }

}
