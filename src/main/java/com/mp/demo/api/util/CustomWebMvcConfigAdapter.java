package com.mp.demo.api.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
/**
 * @author Kshitiz Garg
 */
public class CustomWebMvcConfigAdapter extends WebMvcConfigurerAdapter {
	
	static final String ALL = "/**";
	static final String CLASSPATH_META_INF_RESOURCES_WEBJARS = "classpath:/META-INF/resources/webjars/";
	static final String WEBJARS = "/webjars/**";
	static final String CLASSPATH_META_INF_RESOURCES = "classpath:/META-INF/resources/";
	static final String SWAGGER_UI_HTML = "swagger-ui.html";

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler(SWAGGER_UI_HTML)
	      .addResourceLocations(CLASSPATH_META_INF_RESOURCES);
	 
	    registry.addResourceHandler(WEBJARS)
	      .addResourceLocations(CLASSPATH_META_INF_RESOURCES_WEBJARS);
	}
    

}