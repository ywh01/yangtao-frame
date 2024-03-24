package yangtao.love.service.study.service.design.adapter;

/**
 * @Classname DbService
 * @Description
 * @Date 2024/3/13 22:12
 * @Author ywh
 */
public interface DbService {

    /**
     * 获取数据库类型
     * @return
     */
    String getDbType();

    /**
     * 查询数据库sql
     * @return
     */
    String getDbSql();
}
