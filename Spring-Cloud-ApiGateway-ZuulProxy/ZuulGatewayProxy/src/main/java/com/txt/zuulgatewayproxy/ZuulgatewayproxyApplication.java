package com.txt.zuulgatewayproxy;

//import com.txt.zuulgatwayproxy.filters.ErrorFilter;
//import com.txt.zuulgatwayproxy.filters.PostFilter;
//import com.txt.zuulgatwayproxy.filters.PreFilter;
//import com.txt.zuulgatwayproxy.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulgatewayproxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulgatewayproxyApplication.class, args);
    }
}
