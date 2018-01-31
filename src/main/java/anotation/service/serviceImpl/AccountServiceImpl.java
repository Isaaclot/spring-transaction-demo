package anotation.service.serviceImpl;

import anotation.dao.AccountDao;
import anotation.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by RoyLeong @royleo.xyz on 2018/1/30.
 */
/**
 * 注解中的属性根据需求情况配置在注解括号里面，如果不配置注解属性，会按照默认方式进行
 * propagation  :事务传播行为
 * isolation    ：事务隔离级别
 * readOnly     ：只读
 * rollbackFor  ：发生哪些异常回滚
 * noRollbackFor：发生哪些异常不回滚
 * */
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly=false)
public class AccountServiceImpl implements AccountService {


    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    public void transfer(String out, String in, Double money) {

               accountDao.outMoney(out,money);
               int i = 1 / 0;
               accountDao.inMoney(in,money);

    }
}

