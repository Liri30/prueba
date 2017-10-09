package Controladores;

import Configuracion.Config;
import Modelo.Contador;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContadorControlador {

    public void insert(Contador contador){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try{
            connection = Config.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO potenciahogar(potenciahogar, Idlinea, Fecha)"+
                    "VALUES (?,?,?)");
            preparedStatement.setFloat(1,contador.getPotencia());
            preparedStatement.setInt(2,contador.getLinea());
            preparedStatement.setDate(3,contador.getFecha());
            preparedStatement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(preparedStatement !=null){
                try{
                    preparedStatement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }

            }

            if (connection !=null){
                try{connection.close();
                }catch (SQLException e ){
                    e.printStackTrace();
                }
            }

        }
    }



    public List<Contador> Mostrar(){
        List<Contador> contadors = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet  = null;

        try{
            connection = Config.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM potenciahogar");

            while (resultSet.next()){
                Contador contador = new Contador();
                contador.setLinea(resultSet.getInt("Idlinea"));
                contador.setFecha(resultSet.getDate("Fecha"));
                contador.setPotencia(resultSet.getFloat("potenciahogar"));

                contadors.add(contador);
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
        return contadors;
    }



}
