package Controladores;

import Configuracion.Config;
import Modelo.UsuarioLogin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LoginAsk {

    public List<UsuarioLogin> LogAsk(){
        List<UsuarioLogin> usuarios = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet  = null;

        try{
            connection = Config.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM usuario");

            while (resultSet.next()){
                UsuarioLogin usuario = new UsuarioLogin();
                usuario.setUser(resultSet.getString("User"));
                usuario.setPassword(resultSet.getString("contrasena"));


                usuarios.add(usuario);
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
        return usuarios;
    }



    public static boolean checkLogin(String username, String password){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try{
            connection = Config.getConnection();
            preparedStatement = connection.prepareStatement("SELECT User, contrasena FROM usuario WHERE User=? AND contrasena=?");

            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);

            String name ="", pass="";
            ResultSet resultSet= preparedStatement.executeQuery();
            while(resultSet.next()){
                name = resultSet.getString("User");
                pass = resultSet.getString("contrasena");
//                System.out.println(name+pass);
            }

            if (pass.equals(password) && name.equals(username)){
                resultSet.close();
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if (preparedStatement!=null)
                    preparedStatement.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
            if (connection!=null){
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

        }

        return false;

    }

    /**Actualizar correo para usar desde la pagina*/
    public void insertMail(String email){
        PreparedStatement preparedStatement = null;
        Connection connection = null;

        try{
            connection = Config.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE usuario SET User = ? WHERE idUser = 1");
            preparedStatement.setString(1,email);
            preparedStatement.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if (connection !=null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (preparedStatement !=null){
                try{
                    preparedStatement.close();
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }

    /**Pregunta por contrasena para poder actualizar correo*/
    public static boolean askPass(String password){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try{
            connection = Config.getConnection();
            preparedStatement = connection.prepareStatement("SELECT contrasena FROM usuario WHERE contrasena=?");

            preparedStatement.setString(1, password);
            String name ="", pass="";
            ResultSet resultSet= preparedStatement.executeQuery();
            while(resultSet.next()){
                pass = resultSet.getString("contrasena");
                System.out.println(pass);
            }

            if (pass.equals(password)){
                resultSet.close();
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if (preparedStatement!=null)
                    preparedStatement.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
            if (connection!=null){
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

        }

        return false;

    }


    /************************Actualizar contrasena***********************************************/
    public void UpdatePassword(String password){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try{
            connection = Config.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE usuario SET contrasena = ? WHERE  idUser = 1");
            preparedStatement.setString(1,password);
            preparedStatement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
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

    /**query para buscar el correo de usuario a quien se enviara el correo*/

    public String destino(){
        String correo = new String();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{

            connection = Config.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT user FROM usuario");

            while (resultSet.next()) {
                correo = resultSet.getString("user");

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if (connection != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (statement != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (resultSet != null){
                try{
                    resultSet.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
            return correo;
    }

    /**Actualizar precios para la factura*/
    public void actualizaPrecios(Float pr1, Float pr2, Float pr3, Float pr4){
        PreparedStatement preparedStatement = null;
        Connection connection = null;

        try{
            connection = Config.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE precio SET Costo = ? WHERE ");
            //preparedStatement.setString(1,email);
            //preparedStatement.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if (connection !=null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (preparedStatement !=null){
                try{
                    preparedStatement.close();
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }


}
