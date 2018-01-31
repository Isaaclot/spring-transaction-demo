import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.qsme.service.AccountService;

import javax.annotation.Resource;

/**
 * Created by RoyLeong @royleo.xyz on 2018/1/30.
 * 声明式事务管理测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-transaction.xml")
public class DemoDeclareProxyFacctoryTest {

    @Resource(name = "accountProxyService")
    private AccountService accountService;

    @Test
    public void transferDemo(){
        accountService.transfer("aaa","bbb",200d);
    }

}
