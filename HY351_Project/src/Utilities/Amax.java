/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import hy351_project.MyConnection;
import static hy351_project.MyConnection.getConnection;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
        con.close();
        if (Username.equals(username) && Password.equals(password)) {

            return true;

        } else {
            return false;
        }
    }

    public static Boolean Register(String Username, String Password, String FirstName, String LastName, String Sex, String Birthdate, String Email, String Telephone, String AMKA) throws SQLException {

        int Citizen_ID = getID();

        if (Citizen_ID != -1) {

            Citizen_ID++;

            Statement stmt = null;
            Connection con = null;

            con = getConnection();
            stmt = con.createStatement();

            StringBuilder insQuery = new StringBuilder();

            insQuery.append("INSERT INTO citizen (Citizen_ID, Citizen_AMKA, Sex, Birthdate, Phone, Email, Type, Num_Of_Dose, password, username, Firstname, Lastname) VALUES (")
                    .append("'").append(Citizen_ID).append("', ")
                    .append("'").append(AMKA).append("', ")
                    .append("'").append(Sex).append("', ")
                    .append("'").append(Birthdate).append("', ")
                    .append("'").append(Telephone).append("', ")
                    .append("'").append(Email).append("', ")
                    .append("'").append("Citizen").append("', ")
                    .append("'").append("0").append("', ")
                    .append("'").append(Password).append("', ")
                    .append("'").append(Username).append("', ")
                    .append("'").append(FirstName).append("', ")
                    .append("'").append(LastName).append("')");

            stmt.execute(insQuery.toString());
            con.close();
            return true;

        } else {

            return false;
        }

    }

    public static Integer getID() throws SQLException {

        Statement stmt = null;
        Connection con = null;

        con = getConnection();
        System.out.println("Connection is: " + con);

        stmt = con.createStatement();

        StringBuilder insQuery = new StringBuilder();
        insQuery.append("Select Citizen_ID from citizen ORDER BY Citizen_ID DESC LIMIT 1");

        stmt.executeQuery(insQuery.toString());
        ResultSet res = stmt.getResultSet();

        int id = -1;

        if (res.next() == true) {
            id = res.getInt("Citizen_ID");
        }
        stmt.close();
        con.close();
        return id;
    }

    public static List<String> Confirm_Identity(String AMKA, String Password) throws SQLException {

        Statement stmt = null;
        Connection con = null;

        con = getConnection();
        stmt = con.createStatement();

        StringBuilder insQuery = new StringBuilder();

        insQuery.append("SELECT * FROM citizen WHERE Citizen_AMKA = '" + AMKA + "' AND password = '" + Password + "'");
        stmt.executeQuery(insQuery.toString());

        ResultSet res = stmt.getResultSet();

        List<String> citizen_fields = new ArrayList<String>();

        if (res.next() == true) {

            citizen_fields.add(res.getString("Citizen_ID"));
            citizen_fields.add(res.getString("Citizen_AMKA"));
            citizen_fields.add(res.getString("Sex"));
            citizen_fields.add(res.getString("Birthdate"));
            citizen_fields.add(res.getString("Phone"));
            citizen_fields.add(res.getString("Email"));
            citizen_fields.add(res.getString("Num_Of_Dose"));
            citizen_fields.add(res.getString("password"));
            citizen_fields.add(res.getString("username"));
            citizen_fields.add(res.getString("Firstname"));
            citizen_fields.add(res.getString("Lastname"));

        }
        con.close();
        stmt.close();
        return citizen_fields;
    }

    public static Boolean Update_Details(String AMKA, String Password, String Email, String Telephone) throws SQLException {

        Statement stmt = null;
        Connection con = null;

        con = getConnection();
        stmt = con.createStatement();

        StringBuilder insQuery = new StringBuilder();
        insQuery.append("UPDATE citizen SET ")
                .append("password = '").append(Password).append("', ")
                .append("Email = '").append(Email).append("', ")
                .append("Phone = '").append(Telephone).append("' ")
                .append("WHERE Citizen_AMKA = '").append(AMKA).append("'");

        stmt.execute(insQuery.toString());
        stmt.close();
        con.close();
        return true;
    }

    public static String cancel_Appointment(String AMKA, String Dose) throws SQLException {

        Connection con = MyConnection.getConnection();
        Statement stmt = con.createStatement();

        String ID = "";

        StringBuilder insQuery = new StringBuilder();
        insQuery.append("SELECT Appointment_ID FROM appointment WHERE Citizen_AMKA = '")
                .append(AMKA)
                .append("' AND Dose = '")
                .append(Dose)
                .append("' AND Confirmed = 0");

        stmt.executeQuery(insQuery.toString());
        ResultSet res = stmt.getResultSet();

        if (res.next() == true) {

            ID = res.getString("Appointment_ID");

            StringBuilder delQuery = new StringBuilder();
            delQuery.append("DELETE FROM appointment WHERE Appointment_ID = '").append(ID).append("'");
            stmt.execute(delQuery.toString());

        }

        return ID;
    }

}
