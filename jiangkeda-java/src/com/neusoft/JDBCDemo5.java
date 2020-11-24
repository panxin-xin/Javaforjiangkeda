package com.neusoft;

import com.neusoft.domain.Emp;

import java.sql.*;

public class JDBCDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        1、导入驱动jar包,建立libs文件夹，右键add as library
//        2、注册驱动
        Class.forName("com.mysql.jdbc.Driver");
//        3、获取数据库连接对象
        Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jiangkeda","root","123456");
//        4、定义sql
        String sql = "select * from emp";
//        5、获取数据库连接对象statement
        Statement stmt = conn.createStatement();
//        6、执行sql
        ResultSet rs = stmt.executeQuery(sql);
//        7、处理结果
//        while (rs.next()) {
//
//            int ENPMO = rs.getInt(1);
//            String ENAME = rs.getString(2);
//            String JOB = rs.getString(3);
//            int MGR = rs.getInt(4);
//            Date  HIREDATE=  rs.getDate(5);
//            int SAL = rs.getInt(6);
//            int COMM = rs.getInt(7);
//            int DEPTNO = rs.getInt(8);
//            System.out.println(ENPMO + "---" + ENAME + "---" + JOB + "---" + MGR + "---" + HIREDATE +"---" + SAL+ "---" +COMM + "---" + DEPTNO);
//        }
          rs.next();

              int ENPMO = rs.getInt(1);
              String ENAME = rs.getString(2);
              String JOB = rs.getString(3);
              int MGR = rs.getInt(4);
              Date HIREDATE = rs.getDate(5);
              int SAL = rs.getInt(6);
              int COMM = rs.getInt(7);
              int DEPTNO = rs.getInt(8);
              Emp emp = new Emp(ENPMO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO);
              System.out.println(emp);
//        8、示范资源
              stmt.close();
              conn.close();

    }
}