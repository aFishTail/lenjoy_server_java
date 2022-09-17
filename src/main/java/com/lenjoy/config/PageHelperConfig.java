package com.lenjoy.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class PageHelperConfig {

    @Bean(name = "pageHelper")
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        /**默认false，设置为true时，会将RowBounds第一个参数offset当成pageNum页码使用*/
        properties.setProperty("offsetAsPageNum", "false");
        /**默认false，设置为true时，使用RowBounds分页会进行count查询 */
        properties.setProperty("rowBoundsWithCount", "false");
        /** 禁用合理化时，如果pageNum<1或pageNum>pages会返回空数据 */
        properties.setProperty("reasonable", "false");
        /** always总是返回PageInfo类型,check检查返回类型是否为PageInfo,none返回Page */
        properties.setProperty("returnPageInfo", "none");
        /** 支持通过Mapper接口参数来传递分页参数 */
        properties.setProperty("supportMethodsArguments", "false");
        /**  配置数据库的方言  */
        properties.setProperty("helperDialect", "mysql");
        properties.setProperty("pageSizeZero", "true");
        pageHelper.setProperties(properties);
        return pageHelper;
    }

}