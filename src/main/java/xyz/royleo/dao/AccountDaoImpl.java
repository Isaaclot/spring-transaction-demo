package xyz.royleo.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by RoyLeong @royleo.xyz on 2018/1/30.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    public void outMoney(String out, Double money) {

        String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate()
                .update(sql,money,out);

    }

    public void inMoney(String in, Double money) {

        String sql = "update account set money = money + ? where name = ?";
        this.getJdbcTemplate()
                .update(sql,money,in);

    }
}
