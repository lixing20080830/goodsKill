package org.seckill.base;

import org.seckill.dao.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

/**
 * Created by heng on 2017/6/24.
 */
@ContextConfiguration(locations = { "classpath:spring-dao.xml" })
@TransactionConfiguration(defaultRollback = false)
public class BaseMapperTestConfig {

//    @Autowired
//    private RedisDao redisDao;

    //RedisDao注入为空，他奶奶腿滴在这找了很久，后面再解决这个问题，算了用ApplicationContext
    @Test
    public void testSelectByPrimaryKey() throws Exception {

        ApplicationContext ac1=new FileSystemXmlApplicationContext("src/test/resources/spring-dao.xml");
        RedisDao redisDao = (RedisDao) ac1.getBean("redisDao");
//        redisDao.put("10", "华为荣耀9");
        redisDao.put("sss","酷派大神");

    }
}
