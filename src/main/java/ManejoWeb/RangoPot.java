package ManejoWeb;

import Controladores.ContadorControlador;
import Modelo.Contador;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class RangoPot {
    public List<Contador> potenciaCorte(String diaCorte){

        ContadorControlador datos = new ContadorControlador();

//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//        java.util.Date fecha1 = sdf1.parse("2017-10-01");
//        java.util.Date fecha2= sdf1.parse("2017-11-01");
//
//        Date dateIni = new Date(fecha1.getTime());
//        Date dateFin = new Date(fecha2.getTime());
        List<Contador> listPotenciaHogar = datos.listaPotenciaHogar();
//        List<Contador> listPotenciaHogar = datos.RangoPotenciaFecha(dateIni,dateFin);
        List<Contador> listClientPotenciaHogar = new ArrayList<>();

        for (Contador PotenciaHogar : listPotenciaHogar) {

            String dateString = new String();

            dateString = PotenciaHogar.getFecha().toString().substring(0, 8) + diaCorte;


            if (new String(PotenciaHogar.getFecha().toString()).equals(dateString)) {
                Contador contador = new Contador();
                contador.setPotencia(PotenciaHogar.getPotencia());
                contador.setFecha(PotenciaHogar.getFecha());
                contador.setLinea(PotenciaHogar.getLinea());

                listClientPotenciaHogar.add(contador);
            }



        }
        return listClientPotenciaHogar;

    }
}
