package com.urfu.lesson3;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class Processor
{
    private final ProcessorFamily processorFamily;

    public Processor(ProcessorFamily processorFamily)
    {
        this.processorFamily = processorFamily;
    }

    @PostConstruct
    private void postConstruct()
    {
        System.out.println("Create bean " + processorFamily.toString());
    }

    @PreDestroy
    private void preDestroy()
    {
        System.out.println("Destroy bean " + processorFamily.toString());
    }
}
