
package com.bjike.goddess.proearlymarketcost;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * 扫描com.bjike.goddess.common.consumer 加入过滤器引入userToken
 */

/**
 * 扫描com.bjike.goddess.common.consumer 加入过滤器引入userToken
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.bjike.goddess.proearlymarketcost.action","com.bjike.goddess.common.consumer"},
        excludeFilters = {@ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                value = {Configuration.class})})
@ImportResource({"classpath:app.xml"})
public class Application {

    public static void main(String[] args) throws IOException {
//        japi();

        SpringApplication.run(Application.class,args);
        System.in.read();
    }

}
