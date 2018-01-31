import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.royleo.service.AccountService;

import javax.annotation.Resource;

/**
 * Created by RoyLeong @royleo.xyz on 2018/1/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc.xml")
public class DemoTest {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void Demo1(){
        accountService.transfer("aaa","bbb",200d);
    }
}
