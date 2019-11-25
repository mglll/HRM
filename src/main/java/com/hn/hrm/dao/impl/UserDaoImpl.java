package com.hn.hrm.dao.impl;

import com.hn.hrm.comm.Const;
import com.hn.hrm.dao.idao.IUserDao;
import com.hn.hrm.dao.pojo.User;
import com.hn.hrm.dao.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.util.List;

public class UserDaoImpl implements IUserDao {
    @Override
    public User login(String username, String password) throws Exception {
        QueryRunner qu =DBUtils.getQueryRunner();
        String sql ="select empno,username,pri from t_user where username=? and password=md5(?)";
        User user =qu.query(sql,new BeanHandler<User>(User.class),username,password);
        return user;
    }

    @Override
    public String registry(int empno, String username, String password) throws Exception {
        QueryRunner qu =DBUtils.getQueryRunner();
        String sql ="insert into t_user(empno,username,password) values(?,?,md5(?))";
        int x =qu.update(sql,empno,username,password);
        return x>0? Const.SUCCESS:Const.ERROR;
    }

    @Override
    public String userExist(String username) throws Exception {
        QueryRunner qr = DBUtils.getQueryRunner();
        String sql = "select username from t_user where username=?";
        User user = qr.query(sql, new BeanHandler<User>(User.class),username);
        return user!=null?"success":"error";
    }

    @Override
    public void save(User user) throws Exception {

    }

    @Override
    public void update(User user) throws Exception {

    }

    @Override
    public void delete(User user) throws Exception {

    }

    @Override
    public List<User> findByPage(int page, int size) throws Exception {
        return null;
    }

    @Override
    public User findById(Integer id) throws Exception {
        return null;
    }
}
