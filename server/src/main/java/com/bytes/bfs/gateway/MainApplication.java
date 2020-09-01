package com.bytes.bfs.gateway;

import com.bytes.box.commons.base.annocation.EnableBox;
import com.bytes.box.commons.web.flux.resolve.WebFluxExceptionResolve;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@ComponentScan(value = {"com.bytes.bfs"})
@SpringCloudApplication
@EnableBox(imports = {WebFluxExceptionResolve.class})
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
