package ManejoWeb;

import Controladores.ContadorControlador;
import Modelo.*;
import com.twitter.chill.java.ArraysAsListSerializer;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class FuncionesEPA {


   static ContadorControlador controlador = new ContadorControlador();

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
   public Float potRango(List<Contador> potencia){

       float potenciaAcu = 0;
       Factura valores = new Factura();

       for (Contador r:potencia) {
           potenciaAcu += r.getPotencia();

       }
       valores.setPotencia(potenciaAcu);

       return potenciaAcu;

   }



   /***Funcion para generar graficas en base a una semana y enviar mail***/
   public List<Grafica> Semana(){
       List<Grafica>valores = new ArrayList<>();
       Grafica pot = new Grafica();
       float Lunes = 0, Martes = 0, Miercoles = 0, Jueves = 0;
       float Viernes = 0, Sabado = 0, Domingo = 0;
       int j = 0;



       for (Contador r: controlador.SevenDaysAgo()) {
           j = r.getFecha().getDay();
           System.out.println(j+"\n");

           switch (j){

               case 0:
                   Domingo+=r.getPotencia();
                   break;

               case 1:
                   Lunes +=r.getPotencia();
                   break;

               case 2:
                   Martes +=r.getPotencia();
                   break;

               case 3:
                   Miercoles +=r.getPotencia();
                   break;

               case 4:
                   Jueves += r.getPotencia();
                   break;

               case 5:
                   Viernes+= r.getPotencia();
                   break;

               case 6:
                   Sabado+= r.getPotencia();
                   break;


               default:
                   break;

           }


       }
//
//       SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//
//
//       cal.setTime(new java.util.Date());
//       cal.add(Calendar.DATE, -7);
//      java.util.Date fecha1 = sdf1.parse(cal);

//
       Calendar cal = Calendar.getInstance();
       Date date = new Date(cal.getTimeInMillis());
//       Date dateControl = new Date(cal.getTimeInMillis());
//       float pepe = 0;
//       int y = 0;
//
//
//
//       int k = date.getDay();
//
//
//
//       for (Contador c: controlador.SevenDaysAgo()) {
//
//           System.out.println(c.getFecha());
//
//           for (int i=6;i>=0;i--) {
//
//               if (c.getFecha().getDay() == i){
//                   pepe += c.getPotencia();
//                   System.out.println(pepe+"Esta es la linea que se esta perdiendo"+ c.getPotencia());
//               }
//
//
//           }
//
//           if (c.getFecha().getDay() != date.getDay()-y){
//               System.out.println("Esta entrando"+c.getPotencia());
//
//               pot.setPot(pepe);
//               pot.setDia(String.valueOf(c.getFecha().getDate()));
//               if (y==1 && date.getDay() ==5){
//                   y=0;
//               }
//
//               if (y==2 && date.getDay() ==4){
//                   y=0;
//               }
//
//               if (y==3 && date.getDay() ==3){
//                   y=0;
//               }
//               if (y==4 && date.getDay() ==2){
//                   y=0;
//               }
//               if (y==5 && date.getDay() ==1){
//                   y=0;
//               }
//               valores.add(pot);
//               pot = new Grafica();
//               pepe=0;
//               y++;
//           }
//
//
//
//       }
//
//       System.out.println(cal.getTime().toString()+"Aqui esta lo que busco");

       if(date.getDay() == 0){


           pot = new Grafica();
           pot.setDia("Lunes");
           pot.setPot(Lunes);
           valores.add(pot);

           pot = new Grafica();
           pot.setPot(Martes);
           pot.setDia("Martes");
           valores.add(pot);

           pot = new Grafica();

           pot.setDia("Miercoles");
           pot.setPot(Miercoles);

           valores.add(pot);
           pot = new Grafica();

           pot.setDia("Jueves");
           pot.setPot(Jueves);

           valores.add(pot);
           pot = new Grafica();

           pot.setDia("Viernes");
           pot.setPot(Viernes);

           valores.add(pot);
           pot = new Grafica();


           pot.setDia("Sabado");
           pot.setPot(Sabado);
           valores.add(pot);
           pot = new Grafica();

           pot.setDia("Domingo");
           pot.setPot(Domingo);
           valores.add(pot);


       }

       if (date.getDay() == 1){


           pot = new Grafica();
           pot.setPot(Martes);
           pot.setDia("Martes");
           valores.add(pot);

           pot = new Grafica();

           pot.setDia("Miercoles");
           pot.setPot(Miercoles);

           valores.add(pot);
           pot = new Grafica();

           pot.setDia("Jueves");
           pot.setPot(Jueves);

           valores.add(pot);
           pot = new Grafica();

           pot.setDia("Viernes");
           pot.setPot(Viernes);

           valores.add(pot);
           pot = new Grafica();


           pot.setDia("Sabado");
           pot.setPot(Sabado);
           valores.add(pot);
           pot = new Grafica();

           pot.setDia("Domingo");
           pot.setPot(Domingo);
           valores.add(pot);

           pot = new Grafica();
           pot.setDia("Lunes");
           pot.setPot(Lunes);
           valores.add(pot);

       }

       if (date.getDay()==2){



           pot = new Grafica();

           pot.setDia("Miercoles");
           pot.setPot(Miercoles);

           valores.add(pot);
           pot = new Grafica();

           pot.setDia("Jueves");
           pot.setPot(Jueves);

           valores.add(pot);
           pot = new Grafica();

           pot.setDia("Viernes");
           pot.setPot(Viernes);

           valores.add(pot);
           pot = new Grafica();


           pot.setDia("Sabado");
           pot.setPot(Sabado);
           valores.add(pot);
           pot = new Grafica();

           pot.setDia("Domingo");
           pot.setPot(Domingo);
           valores.add(pot);

           pot = new Grafica();
           pot.setDia("Lunes");
           pot.setPot(Lunes);
           valores.add(pot);

           pot = new Grafica();
           pot.setPot(Martes);
           pot.setDia("Martes");
           valores.add(pot);
       }

       if (date.getDay()==3){


           pot = new Grafica();

           pot.setDia("Jueves");
           pot.setPot(Jueves);

           valores.add(pot);
           pot = new Grafica();

           pot.setDia("Viernes");
           pot.setPot(Viernes);

           valores.add(pot);
           pot = new Grafica();


           pot.setDia("Sabado");
           pot.setPot(Sabado);
           valores.add(pot);
           pot = new Grafica();

           pot.setDia("Domingo");
           pot.setPot(Domingo);
           valores.add(pot);

           pot = new Grafica();
           pot.setDia("Lunes");
           pot.setPot(Lunes);
           valores.add(pot);

           pot = new Grafica();
           pot.setPot(Martes);
           pot.setDia("Martes");
           valores.add(pot);

           pot = new Grafica();

           pot.setDia("Miercoles");
           pot.setPot(Miercoles);

           valores.add(pot);
       }

       if (date.getDay()==4){

           pot = new Grafica();

           pot.setDia("Viernes");
           pot.setPot(Viernes);

           valores.add(pot);
           pot = new Grafica();


           pot.setDia("Sabado");
           pot.setPot(Sabado);
           valores.add(pot);
           pot = new Grafica();

           pot.setDia("Domingo");
           pot.setPot(Domingo);
           valores.add(pot);

           pot = new Grafica();
           pot.setDia("Lunes");
           pot.setPot(Lunes);
           valores.add(pot);

           pot = new Grafica();
           pot.setPot(Martes);
           pot.setDia("Martes");
           valores.add(pot);

           pot = new Grafica();

           pot.setDia("Miercoles");
           pot.setPot(Miercoles);

           valores.add(pot);

           pot = new Grafica();

           pot.setDia("Jueves");
           pot.setPot(Jueves);

           valores.add(pot);
       }

       if (date.getDay()==5){


           pot = new Grafica();


           pot.setDia("Sabado");
           pot.setPot(Sabado);
           valores.add(pot);
           pot = new Grafica();

           pot.setDia("Domingo");
           pot.setPot(Domingo);
           valores.add(pot);

           pot = new Grafica();
           pot.setDia("Lunes");
           pot.setPot(Lunes);
           valores.add(pot);

           pot = new Grafica();
           pot.setPot(Martes);
           pot.setDia("Martes");
           valores.add(pot);

           pot = new Grafica();

           pot.setDia("Miercoles");
           pot.setPot(Miercoles);

           valores.add(pot);

           pot = new Grafica();

           pot.setDia("Jueves");
           pot.setPot(Jueves);

           valores.add(pot);

           pot = new Grafica();

           pot.setDia("Viernes");
           pot.setPot(Viernes);

           valores.add(pot);
       }


       if (date.getDay()==6){

           pot = new Grafica();

           pot.setDia("Domingo");
           pot.setPot(Domingo);
           valores.add(pot);

           pot = new Grafica();
           pot.setDia("Lunes");
           pot.setPot(Lunes);
           valores.add(pot);

           pot = new Grafica();
           pot.setPot(Martes);
           pot.setDia("Martes");
           valores.add(pot);

           pot = new Grafica();

           pot.setDia("Miercoles");
           pot.setPot(Miercoles);

           valores.add(pot);

           pot = new Grafica();

           pot.setDia("Jueves");
           pot.setPot(Jueves);

           valores.add(pot);

           pot = new Grafica();

           pot.setDia("Viernes");
           pot.setPot(Viernes);

           valores.add(pot);

           pot = new Grafica();


           pot.setDia("Sabado");
           pot.setPot(Sabado);
           valores.add(pot);
       }





       return valores;


   }


}
