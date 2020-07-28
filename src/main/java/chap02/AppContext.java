package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//스프링 설정 클래스로 지정한다.
@Configuration
public class AppContext {
    @Bean
    public Greeter greeter(){
        Greeter g = new Greeter();
        g.setFormat("%s, 안녕하세요");
        return g;
    }
}
