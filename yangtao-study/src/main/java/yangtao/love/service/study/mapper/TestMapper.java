package yangtao.love.service.study.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.mapping.ResultSetType;

/**
 * @Classname TestMapper
 * @Description TODO
 * @Date 2024/3/11 23:01
 * @Author ywh
 */
public interface TestMapper extends BaseMapper {

    @Options(resultSetType = ResultSetType.FORWARD_ONLY, fetchSize = 1000)
    public String a();
}
