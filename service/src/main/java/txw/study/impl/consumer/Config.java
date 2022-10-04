package txw.study.impl.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import txw.study.impl.HelloServiceImpl;
import txw.study.service.HelloService;

/**
 * @author tao xing wei
 */
@Configuration
public class Config {

    @Bean
    public HelloService helloService() {
        HelloService helloService = new HelloServiceImpl();
        return helloService;
    }
}
