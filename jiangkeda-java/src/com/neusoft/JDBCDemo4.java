package com.neusoft;

import java.sql.*;

/*查询操作*/
public class JDBCDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        1、导入驱动jar包,建立libs文件夹，右键add as library
//        2、注册驱动
        Class.forName("com.mysql.jdbc.Driver");
//        3、获取数据库连接对象
        Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jiangkeda","root","123456");
//        4、定义sql
        String sql = "select * from account";
//        5、获取数据库连接对象statement
        Statement stmt = conn.createStatement();
//        6、执行sql
         ResultSet rs = stmt.executeQuery(sql);
//        7、处理结果
       while (rs.next()) {

           int id = rs.getInt(1);
           String name = rs.getString(2);
           double balance = rs.getDouble(3);
           System.out.println(id + "---" + name + "---" + balance);
       }
//        8、示范资源
        stmt.close();
        conn.close();
    }
}