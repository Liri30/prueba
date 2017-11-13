package ManejoWeb;

import Modelo.Contador;
import Modelo.ContadorMes;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class FuncionesEPA {

    public List<ContadorMes> PotMes(List<Contador> rango){
        List<ContadorMes> contadorMesList = new ArrayList<>();
        ContadorMes contadorMes = new ContadorMes();

        float ene = 0, feb = 0, mar = 0, abr = 0;
        float may = 0, jun = 0, jul = 0, aug = 0;
        float sept = 0, oct = 0, nov = 0, dec = 0;

        for (Contador r: rango ) {



            int lol = r.getFecha().getMonth();
            switch (lol){
                case 1: lol= 1;
                     ene +=r.getPotencia();
                     break;

                case 2: lol = 2;
                feb +=r.getPotencia();
                break;

                case 3:lol=3;
                mar+=r.getPotencia();
                break;

                case 4: lol=4;
                abr+=r.getPotencia();
                break;

                case 5: lol=5;
                may+=r.getPotencia();
                break;

                case 6: lol=6;
                jun+=r.getPotencia();
                break;

                case 7: lol=7;
                jul+=r.getPotencia();
                break;

                case 8: lol=8;
                aug+=r.getPotencia();

                case 9: lol=9;
                sept+=r.getPotencia();
                    break;

                case 10: lol=10;
                oct+=r.getPotencia();
                break;

                case 11: lol=11;
                nov+=r.getPotencia();
                break;

                case 12:lol=12;
                dec+=r.getPotencia();
                break;

                default: lol=0;
                break;

           }


        }

        if (ene != 0){
            contadorMes.setMes("Enero");
            contadorMes.setPotenciaMes(ene);
            contadorMesList.add(contadorMes);
        }

        if (feb !=0){
            contadorMes.setMes("Febrero");
            contadorMes.setPotenciaMes(feb);
            contadorMesList.add(contadorMes);

        }

        if (mar !=0){
            contadorMes.setMes("Marzo");
            contadorMes.setPotenciaMes(mar);
            contadorMesList.add(contadorMes);
        }
        if (abr!=0){
            contadorMes.setMes("Abril");
            contadorMes.setPotenciaMes(abr);
            contadorMesList.add(contadorMes);
        }
        if (may != 0){
            contadorMes.setMes("Mayo");
            contadorMes.setPotenciaMes(may);
            contadorMesList.add(contadorMes);
        }

        if (jun!=0){
            contadorMes.setMes("Junio");
            contadorMes.setPotenciaMes(jun);
            contadorMesList.add(contadorMes);
        }
        if (jul!=0){
            contadorMes.setMes("Julio");
            contadorMes.setPotenciaMes(jul);
            contadorMesList.add(contadorMes);
        }
        if (aug!=0){
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
            contadorMes.setMes("Diciembre");
            contadorMes.setPotenciaMes(dec);
            contadorMesList.add(contadorMes);
        }


        return contadorMesList;


    }
}
