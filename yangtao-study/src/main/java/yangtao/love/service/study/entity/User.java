package yangtao.love.service.study.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Classname User
 * @Description TODO
 * @Date 2024/3/6 22:41
 * @Author ywh
 */
@Data
@AllArgsConstructor
public class User {
    /** 编号 **/
    private String code;
    /** 名称 **/
    private String name;
    /** 年龄 **/
    private Integer age;
}
