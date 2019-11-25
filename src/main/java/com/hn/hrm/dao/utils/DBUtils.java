package com.hn.hrm.dao.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.stereotype.Component;

import com.mchange.v2.c3p0.ComboPooledDataSource;
@Component("dbutils")
public class DBUtils {
    private static ComboPooledDataSource datasSource =new ComboPooledDataSource("test_c3p0");
    public static QueryRunner getQueryRunner()throws Exception{
        return new QueryRunner(datasSource);

    }
    public static void close(ResultSet rs,PreparedStatement ps,Connection con)throws Exception{
        if(rs != null) rs.close();
        if(ps != null) ps.close();
        if(con != null) con.close();
    }
}
