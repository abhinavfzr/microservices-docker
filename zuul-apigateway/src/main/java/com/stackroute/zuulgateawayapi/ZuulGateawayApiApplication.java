package com.stackroute.zuulgateawayapi;

import com.stackroute.zuulgateawayapi.filter.ErrorFilter;
import com.stackroute.zuulgateawayapi.filter.PostFilter;
import com.stackroute.zuulgateawayapi.filter.PreFilter;
import com.stackroute.zuulgateawayapi.filter.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulGateawayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGateawayApiApplication.class, args);
	}
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
