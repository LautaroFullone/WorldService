package edu.utn.countries.WorldService.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Conf {


    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
