package info.cloversoulmate.service.serviceImpl;

import info.cloversoulmate.dao.AccountDao;
import info.cloversoulmate.service.AccountService;
import org.springframework.stereotype.Service;

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

