package xyz.royleo.service.serviceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import xyz.royleo.dao.AccountDao;
import xyz.royleo.service.AccountService;

import javax.annotation.Resource;

/**
 * Created by RoyLeong @royleo.xyz on 2018/1/30.
 */
@Service
public class AccountServiceImpl implements AccountService {


    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    //    注入事务管理模板
    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void transfer(final String out,final String in,final Double money) {

       transactionTemplate.execute(new TransactionCallbackWithoutResult() {
           @Override
           protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
               accountDao.outMoney(out,money);
               int i = 1 / 0;
               accountDao.inMoney(in,money);
           }
       });

    }
}

