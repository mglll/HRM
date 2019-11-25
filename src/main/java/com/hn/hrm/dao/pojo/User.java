package com.hn.hrm.dao.pojo;

public class User {
    private int empno;
    private String username;
    private String password;
    private int pri;

    @Override
    public String toString() {
        return "User{" +
                "empno=" + empno +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", pri=" + pri +
                '}';
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPri() {
        return pri;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }

    public User() {
    }

    public User(String username, String password, int pri) {
        this.username = username;
        this.password = password;
        this.pri = pri;
    }

    public User(int empno, String username, String password, int pri) {
        this.empno = empno;
        this.username = username;
        this.password = password;
        this.pri = pri;
    }
}
