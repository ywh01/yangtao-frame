package yangtao.love.service.study.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName spacex_table
 */
@TableName(value ="spacex_table")
@Data
public class SpacexTable implements Serializable {

    @TableId
    private String id;

    private String name;

    @TableLogic
    private Integer isDel;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}