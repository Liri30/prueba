package ManejoWeb;

import Modelo.Contador;
import Modelo.ContadorMes;
import Modelo.Factura;
import Modelo.Precio;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FuncionesEPA {

    /**retorna valores por mes complete*/

    public List<ContadorMes> PotMes(List<Contador> rango) throws ParseException {
        List<ContadorMes> contadorMesList = new ArrayList<>();
        ContadorMes contadorMes = new ContadorMes();
        List<Contador> counter = rango;

        float ene = 0, feb = 0, mar = 0, abr = 0;
        float may = 0, jun = 0, jul = 0, aug = 0;
        float sept = 0, oct = 0, nov = 0, dec = 0;



        for (Contador r: rango ) {

            int lol = r.getFecha().getMonth();

            System.out.println(r.getFecha().getMonth());
            switch (lol){
                case 0:
                     ene +=r.getPotencia();
                     break;

                case 1:
                feb +=r.getPotencia();
                break;

                case 2:
                mar+=r.getPotencia();
                break;

                case 3:
                abr+=r.getPotencia();
                break;

                case 4:
                may+=r.getPotencia();
                break;

                case 5:
                jun+=r.getPotencia();
                break;

                case 6:
                jul+=r.getPotencia();
                break;

                case 7:
                aug+=r.getPotencia();

                case 8:
                sept+=r.getPotencia();
                    break;

                case 9:
                oct+=r.getPotencia();
                break;

                case 10:
                nov+=r.getPotencia();
                break;

                case 11:
                dec+=r.getPotencia();
                break;

                default:
                break;

           }


        }

        if (ene != 0){
            contadorMes = new ContadorMes();
            contadorMes.setMes("Enero");
            contadorMes.setPotenciaMes(ene);
            contadorMesList.add(contadorMes);
        }

        if (feb !=0){
            contadorMes = new ContadorMes();
            contadorMes.setMes("Febrero");
            contadorMes.setPotenciaMes(feb);
            contadorMesList.add(contadorMes);

        }

        if (mar !=0){
            contadorMes = new ContadorMes();
            contadorMes.setMes("Marzo");
            contadorMes.setPotenciaMes(mar);
            contadorMesList.add(contadorMes);
        }
        if (abr!=0){
            contadorMes = new ContadorMes();
            contadorMes.setMes("Abril");
            contadorMes.setPotenciaMes(abr);
            contadorMesList.add(contadorMes);
        }
        if (may != 0){
            contadorMes = new ContadorMes();
            contadorMes.setMes("Mayo");
            contadorMes.setPotenciaMes(may);
            contadorMesList.add(contadorMes);
        }

        if (jun!=0){
            contadorMes = new ContadorMes();
            contadorMes.setMes("Junio");
            contadorMes.setPotenciaMes(jun);
            contadorMesList.add(contadorMes);
        }
        if (jul!=0){
            contadorMes = new ContadorMes();
            contadorMes.setMes("Julio");
            contadorMes.setPotenciaMes(jul);
            contadorMesList.add(contadorMes);
        }
        if (aug!=0){
            contadorMes = new ContadorMes();
            contadorMes.setMes("Agosto");
            contadorMes.setPotenciaMes(aug);
            contadorMesList.add(contadorMes);
        }
        if (sept!=0){
            contadorMes = new ContadorMes();
            contadorMes.setMes("Septiembre");
            contadorMes.setPotenciaMes(sept);
            contadorMesList.add(contadorMes);
        }
        if (oct!=0){
            contadorMes = new ContadorMes();
            contadorMes.setMes("Octubre");
            contadorMes.setPotenciaMes(oct);
            contadorMesList.add(contadorMes);
        }
        if (nov!=0){
            contadorMes = new ContadorMes();
            contadorMes.setMes("Noviembre");
            contadorMes.setPotenciaMes(nov);
            contadorMesList.add(contadorMes);
        }
        if (dec!=0){
            contadorMes = new ContadorMes();
            contadorMes.setMes("Diciembre");
            contadorMes.setPotenciaMes(dec);
            contadorMesList.add(contadorMes);
        }


        return contadorMesList;


    }

    /************************************************************************************/

    /**Para retornar la potencia en un rango de fecha*/
   public Factura potRango(List<Contador> potencia){

       float potenciaAcu = 0;
       Factura valores = new Factura();

       for (Contador r:potencia) {
           potenciaAcu += r.getPotencia();

       }
       valores.setPotencia(potenciaAcu);

       return valores;

   }


}
