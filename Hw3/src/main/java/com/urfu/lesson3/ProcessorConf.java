package com.urfu.lesson3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ProcessorConf
{
    @Bean
    public ProcessorFamily processorFamily()
    {
        Random rnd = new Random();
        if (rnd.nextInt(100) > 50)
            return new Intel();
        return new AMD();
    }
}
