package com.google.demoreport;
import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper extends AppCompatActivity{

    String server_ip,db_name,db_username,db_password;

    @SuppressLint("NewApi")
    public Connection connectionClass(){

        server_ip = "192.168.2.45";
        db_name = "LSDEMODATA";
        db_username = "sa";
        db_password = "mssql123";

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        java.sql.Connection connection = null;
        String ConnectionURL;

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnectionURL = "jdbc:jtds:sqlserver://" + server_ip +";databaseName="+ db_name + ";user=" + db_username+ ";password=" + db_password + ";";
            connection = DriverManager.getConnection(ConnectionURL);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
