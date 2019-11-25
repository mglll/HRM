package com.hn.hrm.dao.idao;

import com.hn.hrm.dao.pojo.User;

public interface IUserDao extends IBaseDao<User,Integer>{
    User login(String username, String password)throws Exception;
    String registry(int empno,String username,String password)throws Exception;
    String userExist(String username)throws Exception;
}
