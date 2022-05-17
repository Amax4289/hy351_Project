/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import static hy351_project.MyConnection.getConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author USER
 */
public class Amax {

    public static Boolean Login(String Username, String Password, String role) throws SQLException {

        Statement stmt = null;
        Connection con = null;

        con = getConnection();
        stmt = con.createStatement();

        String username = "";
        String password = "";

        StringBuilder insQuery = new StringBuilder();

        insQuery.append("SELECT username, password FROM ").append(role)
                .append(" WHERE username = '").append(Username).append("' AND password = '").append(Password).append("'");

        stmt.executeQuery(insQuery.toString());
        ResultSet res = stmt.getResultSet();

        if (res.next() == true) {
            username = res.getString("username");
            password = res.getString("password");
        }

        if (Username.equals(username) && Password.equals(password)) {
            return true;

        } else {
            return false;
        }
    }

}
