package Configuracion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Config {

    public static Connection getConnection() {
        Connection connection = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            //SSL desactivado y autoReconectar activado
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/epa?autoReconnect=true&useSSL=false", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;


    }

}