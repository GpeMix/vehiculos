package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.Environment;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoApplication.
 */
@SpringBootApplication
@EnableFeignClients
//@Configuration
public class DemoApplication {
    
    /** The spring enviroment. */
    @Autowired
    private Environment springEnviroment;

    /**
     * Gets the property.
     *
     * @param key the key
     * @return the property
     */
    public final String getProperty(final String key) {
        return springEnviroment.getProperty(key);
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */

    public static void main(final String... args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
