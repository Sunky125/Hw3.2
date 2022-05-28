package com.urfu.lesson3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


@SpringBootApplication
public class Lesson3Application {

    public static void main(String[] args)
    {
        SpringApplication.run(Lesson3Application.class, args);
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ProcessorConf.class);
        ProcessorConf processor = context.getBean(ProcessorConf.class);
        System.out.println(processor.processorFamily().getProcessorName());
        context.registerShutdownHook();
    }

}
