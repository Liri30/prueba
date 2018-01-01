package Controladores;

import Configuracion.Config;
import Modelo.Contador;
import Modelo.Factura;
import Modelo.Precio;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//import java.util.Date;

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



    public List<Contador> RangoPotenciaFecha(java.util.Date fechaIni, java.util.Date fechaFin){
        /**Query para seleccionar potencia de un rango de fecha*/
        List<Contador> counter = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet=null;

        try {
            connection = Config.getConnection();
            //statement = connection.prepareStatement("SELECT * FROM  potenciahogar WHERE Fecha BETWEEN '"+fechaIni+"'AND '"+fechaFin+"'");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM  potenciahogar WHERE Fecha BETWEEN '"+fechaIni+"'AND '"+fechaFin+"'");
            while (resultSet.next()){
                Contador contador = new Contador();
                contador.setPotencia(resultSet.getFloat("potenciahogar"));
                contador.setFecha(resultSet.getDate("Fecha"));
                contador.setLinea(resultSet.getInt("IdLinea"));

                counter.add(contador);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
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



        return counter;

    }
    public List<Contador> listaPotenciaHogar(){
        /**Query para seleccionar potencia de un rango de fecha*/
        List<Contador> counter = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet=null;

        try {
            connection = Config.getConnection();
            //statement = connection.prepareStatement("SELECT * FROM  potenciahogar WHERE Fecha BETWEEN '"+fechaIni+"'AND '"+fechaFin+"'");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM  potenciahogar");
            while (resultSet.next()){
                Contador contador = new Contador();
                contador.setPotencia(resultSet.getFloat("potenciahogar"));
                contador.setFecha(resultSet.getDate("Fecha"));
                contador.setLinea(resultSet.getInt("IdLinea"));

                counter.add(contador);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


        return counter;

    }


    /**Query para buscar los precios*/
    public List<Precio> listaPrecios(){
//        Precio precio = new Precio();
//        Connection connection = null;
//        Statement statement;
//        ResultSet resultSet;
//
//        try{
//            connection = Config.getConnection();
//            statement = connection.createStatement();
//            resultSet = statement.executeQuery("select * from precio");
//
//            while (resultSet.next()){
//                precio.setMenor200(resultSet.getFloat("Costo"));
//            }
//
//        }
//        catch (Exception e){
//
//        }
//
//        return precio;
        /**Query para seleccionar potencia de un rango de fecha*/
        List<Precio> preciosData = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet=null;

        try {
            connection = Config.getConnection();
            //statement = connection.prepareStatement("SELECT * FROM  potenciahogar WHERE Fecha BETWEEN '"+fechaIni+"'AND '"+fechaFin+"'");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from precio");
            while (resultSet.next()){
                Precio precios = new Precio();
                precios.setCosto(resultSet.getFloat("Costo"));
                precios.setRango(resultSet.getString("Rango"));
                preciosData.add(precios);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


        return preciosData;

    }


/**********************Actualizar los costo de la energia por rango*************************/

public void menor200(Float costo){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = Config.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE precio SET Costo = ? WHERE  idPrecio = 1");
           preparedStatement.setFloat(1, costo);
            preparedStatement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }

        finally {
            if (connection!=null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (preparedStatement!=null){
                try{
                    preparedStatement.close();
                }catch (SQLException e){e.printStackTrace();
                }
            }
        }

}


    public void Mayor200Menor300(Float costo){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = Config.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE precio SET Costo = ? WHERE  idPrecio = 2");
            preparedStatement.setFloat(1, costo);
            preparedStatement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }

        finally {
            if (connection!=null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (preparedStatement!=null){
                try{
                    preparedStatement.close();
                }catch (SQLException e){e.printStackTrace();
                }
            }
        }

    }



    public void Mayor300Menor700(Float costo){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = Config.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE precio SET Costo = ? WHERE  idPrecio = 3");
            preparedStatement.setFloat(1, costo);
            preparedStatement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }

        finally {
            if (connection!=null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (preparedStatement!=null){
                try{
                    preparedStatement.close();
                }catch (SQLException e){e.printStackTrace();
                }
            }
        }

    }



    public void Mayor700(Float costo){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = Config.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE precio SET Costo = ? WHERE  idPrecio = 4");
            preparedStatement.setFloat(1, costo);
            preparedStatement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }

        finally {
            if (connection!=null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (preparedStatement!=null){
                try{
                    preparedStatement.close();
                }catch (SQLException e){e.printStackTrace();
                }
            }
        }

    }

/*********************************************************************************************/
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

    public List<Contador> TwoMonthAgo(){
        List<Contador> contadors = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet  = null;

        try{
            connection = Config.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM potenciahogar WHERE Fecha = CURRENT_DATE");

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

/**funcion para conseguir el intervalo de fecha de la tabla potencia hogar*/
    public List<Contador> intervalDate(Date startDate, Date endDate){
        List<Contador> contadors = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet  = null;

        try{

            connection = Config.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM potenciahogar WHERE fecha >='"+startDate+"' and fecha <='"+endDate+"'");

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

/***Este query se usa para enviar la potencia acumulada en el mes actual cuando se supera un borde*/
    public float MesActual(){
        float potenciaAcu = 0;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet  = null;

        try{
            connection = Config.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from potenciahogar where month(Fecha) = month(now())");

            while (resultSet.next()){

                potenciaAcu+= resultSet.getFloat("potenciahogar");

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
        return potenciaAcu;
    }


    /**Query 7 dias atras de potencia*/

    public List<Contador> SevenDaysAgo(){
        List<Contador> contadors = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet  = null;

        try{
            connection = Config.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from potenciahogar where Fecha between date_sub(date(now()), interval 6 day)\n" +
                    "and now()\n");

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







    public List<Contador> PotenciaDiaActual(){
        List<Contador> contadors = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet  = null;

        try{
            connection = Config.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from potenciahogar where Fecha = curdate()");

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
