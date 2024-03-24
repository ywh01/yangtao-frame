package yangtao.love.service.study.service.design.adapter.impl;

import org.springframework.stereotype.Service;
import yangtao.love.service.study.service.design.adapter.DbService;

/**
 * @Classname OracleSDbService
 * @Description TODO
 * @Date 2024/3/13 22:14
 * @Author ywh
 */
@Service(value = "oracleDbService")
public class OracleSDbService implements DbService {


    @Override
    public String getDbType() {
        return "oracle";
    }

    @Override
    public String getDbSql() {
        return "获取oracle的SQL";
    }
}
