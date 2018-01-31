import info.cloversoulmate.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by RoyLeong @royleo.xyz on 2018/1/30.
 * 声明式事务管理基于aspecJ的XML配置方式
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-transaction-aspectJ.xml")
public class DemoDeclareAspectJTest {


    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void transferDemo(){
        accountService.transfer("aaa","bbb",200d);
    }

}
