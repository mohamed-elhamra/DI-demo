package com.melhamra;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan
public class Configuration {

    @Bean("asusHardDisk")
    public AsusHardDisk getAsusHardDisk(){
        return new AsusHardDisk();
    }

    @Bean("computer")
    public Computer getComputer(){
        // DI using constructor
        Computer computer = new Computer(getAsusHardDisk());
        return computer;
    }

    /*@Bean("computer")
    public Computer getComputer(){
        Computer computer = new Computer();
        // DI using the setter
        computer.setHardDisk(getAsusHardDisk());
        return computer;
    }*/

}
