package com.github.lucasricardo1.access_api.infra;

import com.github.lucasricardo1.access_api.core.ports.*;
import com.github.lucasricardo1.access_api.core.services.ResidentService;
import com.github.lucasricardo1.access_api.core.services.UserService;
import com.github.lucasricardo1.access_api.core.services.VisitorService;
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

    @Bean
    public ResidentServicePort residentServicePort(ResidentRepositoryPort residentRepositoryPort){
        return new ResidentService(residentRepositoryPort);
    }

    @Bean
    public VisitorServicePort visitorServicePort(VisitorRepositoryPort visitorRepositoryPort){
        return new VisitorService(visitorRepositoryPort);
    }
}
