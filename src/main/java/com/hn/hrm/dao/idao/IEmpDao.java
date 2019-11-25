package com.hn.hrm.dao.idao;

import com.hn.hrm.dao.pojo.Emp;

import java.util.List;

public interface IEmpDao extends IBaseDao<Emp,Integer> {
    List<Emp> findByName(String ename)throws Exception;
    List<Emp> findAll()throws Exception;
}
