package com.github.lucasricardo1.access_api.infra;

import com.github.lucasricardo1.access_api.core.ports.UserRepositoryPort;
import com.github.lucasricardo1.access_api.core.ports.UserServicePort;
import com.github.lucasricardo1.access_api.core.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public UserServicePort userServiceImpl(UserRepositoryPort userRepositoryPort){
        return new UserService(userRepositoryPort);
    }

}
