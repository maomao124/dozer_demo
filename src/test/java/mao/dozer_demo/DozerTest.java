package mao.dozer_demo;

import com.github.dozermapper.core.Mapper;
import mao.dozer_demo.entity.UserDTO;
import mao.dozer_demo.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * Project name(项目名称)：dozer_demo
 * Package(包名): mao.dozer_demo
 * Class(类名): DozerTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/28
 * Time(创建时间)： 19:50
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@SpringBootTest
public class DozerTest
{

    @Autowired
    private Mapper mapper;

    private static final Logger log = LoggerFactory.getLogger(DozerTest.class);

    @Test
    void test1()
    {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId("134");
        userDTO.setUserName("张三");
        userDTO.setUserAge(19);
        userDTO.setAddress("中国");
        userDTO.setBirthday("2012-10-13");

        log.info(userDTO.toString());

        UserEntity userEntity = mapper.map(userDTO, UserEntity.class);

        log.info(userEntity.toString());

    }

    @Test
    void test2()
    {
        UserEntity userEntity = new UserEntity("1234", "李四", 14, "中国", new Date());
        UserDTO userDTO = mapper.map(userEntity, UserDTO.class);

        log.info(userEntity.toString());
        log.info(userDTO.toString());
    }
}
