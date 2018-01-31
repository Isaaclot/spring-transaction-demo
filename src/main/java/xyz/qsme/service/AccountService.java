package xyz.qsme.service;

/**
 * Created by RoyLeong @royleo.xyz on 2018/1/30.
 */
public interface AccountService {

    //转账
    public void transfer(String out, String in, Double money);
}
