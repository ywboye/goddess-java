
package com.bjike.goddess.headcount;

import com.dounine.japi.JapiClient;
import com.dounine.japi.JapiClientStorage;
import com.dounine.japi.JapiClientTransfer;
import com.dounine.japi.core.IProject;
import com.dounine.japi.core.impl.ProjectImpl;
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
@ComponentScan(basePackages = {"com.bjike.goddess.headcount.action","com.bjike.goddess.common.consumer"},
        excludeFilters = {@ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                value = {Configuration.class})})
@ImportResource({"classpath:app.xml"})
public class Application{

//    public static void japi(){
//        JapiClient.setPrefixPath("/home/goddess-java/");//路径前缀
//        JapiClient.setpostfixPath("/src/main/java");
//
//        JapiClient.setProjectJavaPath("headcount/headcount-consumer");//主项目位置
//        JapiClient.setActionReletivePath("com/bjike/goddess/headcount/action");//主项目action位置
//        JapiClient.setIncludeProjectJavaPath(new String[]{//关联项目
//                "headcount/headcount-api",
//                "common/common-api"
//        });
//        JapiClient.setIncludePackages(new String[]{"com.bjike.goddess"});//可以准确快速搜索
//
//        IProject project = ProjectImpl.init();
//        JapiClientStorage japiClientStorage = JapiClientStorage.getInstance();
//        japiClientStorage.setProject(project);
//        japiClientStorage.autoSaveToDisk();
//        new JapiClientTransfer().autoTransfer(japiClientStorage);
//    }

    public static void main(String[] args) throws IOException {
//        japi();

        SpringApplication.run(Application.class,args);
        System.in.read();
    }

}
