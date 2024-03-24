package yangtao.love.service.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Classname TestApplication
 * @Description TODO
 * @Date 2024/3/13 22:22
 * @Author ywh
 */
@SpringBootApplication
@MapperScan("yangtao.love.service.study.mapper")
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);

    }

}
