package appStart;

import org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by bishoy on 19.02.17.
 *
 * Contains main module spring configuration
 */
@Configuration
@ComponentScan(basePackages = {"com.module"})
public class MainModuleSpringContext extends AnnotationConfigEmbeddedWebApplicationContext{

}
