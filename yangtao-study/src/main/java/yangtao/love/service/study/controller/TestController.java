package yangtao.love.service.study.controller;

import com.alibaba.fastjson.JSON;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yangtao.love.service.study.config.ApplicationContextHelper;
import yangtao.love.service.study.entity.SpacexTable;
import yangtao.love.service.study.service.design.adapter.DbService;
import yangtao.love.service.study.service.logic.delete.SpacexTableService;

import java.util.List;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2024/3/13 22:15
 * @Author ywh
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private List<DbService> dbServiceList;

    @Autowired
    private SpacexTableService spacexTableService;

    @GetMapping("/")
    public String a (){
        return "success";
    }

    @GetMapping("/getDbSql1")
    public String getDbSql(@RequestParam String dbtype){
        DbService dbService = dbServiceList.stream().filter(item -> dbtype.equals(item.getDbType())).findFirst().get();
        return dbService.getDbSql();
    }

    @GetMapping("/getDbSql2")
    public String getDbSql2(@RequestParam String dbtype){
        DbService dbService = ApplicationContextHelper.popBean(dbtype + "DbService", DbService.class);
        return dbService.getDbSql();
    }

    @GetMapping("/getSpacexTable")
    public String getSpacexTable(){
        List<SpacexTable> list = spacexTableService.list();
        return JSON.toJSONString(list);
    }

}
