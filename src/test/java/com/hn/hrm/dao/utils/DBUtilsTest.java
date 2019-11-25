package com.hn.hrm.dao.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class DBUtilsTest {
    private static ComboPooledDataSource datasSource =new ComboPooledDataSource("test_c3p0");
    @Test
    public void getQueryRunner() {
        System.out.println(datasSource);
    }

    @Test
    public void close() {
    }
}