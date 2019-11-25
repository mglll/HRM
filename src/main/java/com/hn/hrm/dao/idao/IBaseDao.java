package com.hn.hrm.dao.idao;

import java.util.List;

public interface IBaseDao<T,K> {
    void save(T t)throws Exception;
    void update(T t)throws Exception;
    void delete(T t)throws Exception;
    List<T> findByPage(int page, int size)throws Exception;
    T findById(K id)throws Exception;
}
