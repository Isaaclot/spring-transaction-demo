package xyz.qsme.service.serviceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import xyz.qsme.dao.AccountDao;
import xyz.qsme.service.AccountService;

/**
 * Created by RoyLeong @royleo.xyz on 2018/1/30.
 */
@Service
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

