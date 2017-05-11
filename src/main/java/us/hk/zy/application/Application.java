package us.hk.zy.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
//@Configuration
@ComponentScan("us.hk.zy.controller")
public class Application extends SpringBootServletInitializer {
	
	public Application() {
	    super();
	    setRegisterErrorPageFilter(false);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
	
    public static void main(String[] args) throws Exception{
    	SpringApplication.run(Application.class, args);
    }
  
}
