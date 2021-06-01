package cn.fourtwoone.mt;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.fourtwoone.mt.dao")
public class MtApplication {

    public static void main(String[] args) {
        SpringApplication.run(MtApplication.class, args);
    }

}
