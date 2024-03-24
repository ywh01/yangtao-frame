package yangtao.love.service.study.service.design.adapter.impl;

import org.springframework.stereotype.Service;
import yangtao.love.service.study.service.design.adapter.DbService;

/**
 * @Classname MysqlDbService
 * @Description
 * @Date 2024/3/13 22:13
 * @Author ywh
 */
@Service(value = "mysqlDbService")
public class MysqlDbService implements DbService {

    @Override
    public String getDbType() {
        return "mysql";
    }

    @Override
    public String getDbSql() {
        return "获取mysql的SQL";
    }
}
