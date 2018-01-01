package Controladores;

import Configuracion.Config;
import Modelo.Contador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BuscarPrecio {


    public Float Menor200(){
        Float precio = null;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            connection = Config.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from precio where idPrecio = 1");

            while (resultSet.next()){

                precio = resultSet.getFloat("Costo");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet !=null){
                try{
                    resultSet.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (statement !=null){
                try{
                    statement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

        return precio;
    }

    public Float Mayor200Menor300(){
        Float precio = null;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            connection = Config.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from precio where idPrecio = 2 ");

            while (resultSet.next()){

                precio = resultSet.getFloat("Costo");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet !=null){
                try{
                    resultSet.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (statement !=null){
                try{
                    statement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

        return precio;
    }

    public Float Mayor300Menor700(){
        Float precio = null;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            connection = Config.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from precio where idPrecio = 3 ");

            while (resultSet.next()){

                precio = resultSet.getFloat("Costo");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet !=null){
                try{
                    resultSet.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (statement !=null){
                try{
                    statement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

        return precio;
    }


    public Float Mayor700(){
        Float precio = null;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            connection = Config.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from precio where idPrecio = 4 ");

            while (resultSet.next()){

                precio = resultSet.getFloat("Costo");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet !=null){
                try{
                    resultSet.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (statement !=null){
                try{
                    statement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

        return precio;
    }

    /*****Obtener estado de variable de control*****/

    public boolean Value(){
        boolean precio = false;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            connection = Config.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from envio");

            while (resultSet.next()){

                precio = resultSet.getBoolean("enviar200");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet !=null){
                try{
                    resultSet.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (statement !=null){
                try{
                    statement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

        return precio;
    }

/**Actualizar estado de variable de control**/

public boolean ValorDiario(){
    boolean precio = false;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    try{
        connection = Config.getConnection();
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from envio");

        while (resultSet.next()){

            precio = resultSet.getBoolean("enviar300");
        }
    }catch (Exception e){
        e.printStackTrace();
    }finally {
        if (resultSet !=null){
            try{
                resultSet.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

        if (connection != null){
            try{
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        if (statement !=null){
            try{
                statement.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    return precio;
}



    public void UpdateValue(boolean estado){
        Connection connection = null;
        PreparedStatement preparedStatement = null;


        try{
            connection = Config.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE envio set enviar200 = ? where idEnvio = 1");
            preparedStatement.setBoolean(1, estado);
            preparedStatement.executeUpdate();


        }catch (Exception e){
            e.printStackTrace();
        }finally {


            if (connection != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (preparedStatement !=null){
                try{
                    preparedStatement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }

/***Para los msj que se envian diario**/





    public void UpdateDiario(boolean estado){
        Connection connection = null;
        PreparedStatement preparedStatement = null;


        try{
            connection = Config.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE envio set enviar300 = ? where idEnvio = 1");
            preparedStatement.setBoolean(1, estado);
            preparedStatement.executeUpdate();


        }catch (Exception e){
            e.printStackTrace();
        }finally {


            if (connection != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (preparedStatement !=null){
                try{
                    preparedStatement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }


}
