package appStart;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by bishoy on 19.02.17.
 */
@SpringBootApplication
@EnableWebMvc
@Import(MainModuleSpringContext.class)
public class ModuleStart extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/resources/");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.viewResolver(new InternalResourceViewResolver("/WEB-INF/jsp/",".jsp"));
    }


    /**
     * Entry point of application start
     *
     * @param args arguments
     */
    public static void main(String[] args) {

        //define and run the application context
        ApplicationContext ctx = new SpringApplicationBuilder(ModuleStart.class)
                .bannerMode(Banner.Mode.OFF)
                .build().run(args);
        //notify app start
        System.out.println("Module started successfully !");
    }
}
