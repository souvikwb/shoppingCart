package com.souvik.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.web.servlet.ViewResolver;
//import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan("com.souvik")
@EnableCouchbaseRepositories("com.souvik.repository")
public class MvcConfiguration extends WebMvcConfigurerAdapter {
	@Bean
	public ViewResolver internalResourceViewResolver() {
	    InternalResourceViewResolver bean = new InternalResourceViewResolver();
	    //bean.setViewClass(JstlView.class);
	    bean.setPrefix("/WEB-INF/view/");
	    bean.setSuffix(".jsp");
	    return bean;
	}
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
          .addResourceHandler("/resources/**")
          .addResourceLocations("WEB-INF/resources/"); 
    }
}
