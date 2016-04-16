/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;

/**
 *
 * @author user
 */
public class Database {
    private Statement statement;
    private ResultSet rs;
    private Connection connect;
    
    public void connect() throws SQLException{
//        Class.forName("org.gjt.mm.mysql.Driver");
        connect = DriverManager.getConnection("jdbc:mysql://localhost/db_sisfota","root","");
        statement = connect.createStatement();
    }
    public ResultSet getData(String sql) throws SQLException{
        rs= statement.executeQuery(sql);
        return rs;
    }
    public void query(String sql) throws SQLException{
        statement.executeUpdate(sql);
    }
}
