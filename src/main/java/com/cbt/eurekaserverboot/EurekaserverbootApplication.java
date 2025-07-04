package com.cbt.eurekaserverboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserverbootApplication
{

    public static void main(String[] args)
    {
       SpringApplication.run(EurekaserverbootApplication.class, args);
    }

}
