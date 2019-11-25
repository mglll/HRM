package com.hn.hrm.dao.impl;

import com.hn.hrm.dao.idao.IEmpDao;
import com.hn.hrm.dao.pojo.Emp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class EmpDaoImplTest {
   @Autowired
 IEmpDao empDao;
    @Test
    public void findByName() throws Exception{
    }

    @Test
    public void findAll() throws Exception{
      List<Emp> empList = empDao.findAll();
       System.out.println(empList);
    }

    @Test
    public void save() throws Exception {
        Emp emp =new Emp("mimgShen","m","2019-03-01",10000,"master",1,2,"2019-03-01","2019-09-01","onjob","casual","school");
        empDao.save(emp);
    }

    @Test
    public void update() throws Exception{
    }

    @Test
    public void delete() throws Exception{
    }

    @Test
    public void findByPage() throws Exception{
    }

    @Test
    public void findById() throws Exception{
    }
}