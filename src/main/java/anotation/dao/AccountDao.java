package anotation.dao;

/**
 * Created by RoyLeong @royleo.xyz on 2018/1/30.
 */
public interface AccountDao {

    public void outMoney(String out, Double money);

    public void inMoney(String in, Double money);

}
