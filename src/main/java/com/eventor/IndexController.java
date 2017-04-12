package com.eventor;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * A class for getting the index.html and manage SQL database connection.
 */
@Controller
public class IndexController {

    /**
     * Function for displaying .html content.
     * @return String containing the name of .html file to display.
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     *  Function responsible for connection to SQL Database
     */
    public void connectToDB() {
        String url = "jdbc:sqlserver://eventor.database.windows.net:1433;database=EventorDB;user=pablo;password=Eventor123;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";//String.format("jdbc:sqlserver://%s.database.windows.net:1433;database=%s;user=%s;password=%s;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url);
            String schema = connection.getSchema();
            System.out.println("Successful connection - Schema: " + schema);

            System.out.println("Query data example:");
            System.out.println("=========================================");

            // Create and execute a SELECT SQL statement.
            String selectSql = "SELECT * FROM eventor.users";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectSql)) {

                while (resultSet.next())
                {
                    System.out.println(resultSet.getString(1) + " "
                            + resultSet.getString(2));
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}