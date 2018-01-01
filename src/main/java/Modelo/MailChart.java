package Modelo;

import ManejoWeb.FuncionesEPA;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.batik.svggen.SVGGraphics2DIOException;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.ChartFactory; import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.w3c.dom.DOMImplementation;
import org.apache.batik.dom.GenericDOMImplementation;
import org.w3c.dom.Document;
import org.apache.batik.*;


import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class MailChart {

    /**Me falta exportar el archivo y enviarlo*/

    public void GenerarChart(){
        FuncionesEPA valores = new FuncionesEPA();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //DefaultPieDataset dataset = new DefaultPieDataset();

        for (Grafica g: valores.Semana()) {

            dataset.setValue(g.getPot(),"", g.getDia());
            System.out.println("Se han ingresado datos");

        }

        JFreeChart chart = ChartFactory.createBarChart("Potencia de la Semana", "Potencia por día", "KWh",
                dataset, PlotOrientation.VERTICAL, true, true, false);

        //JFreeChart chart = ChartFactory.createPieChart("Potencia semanal", dataset, true, true, false);
       try{
//           DOMImplementation domImpl = GenericDOMImplementation.getDOMImplementation();
//// Create an instance of org.w3c.dom.Document
//
//           Document document = domImpl.createDocument(null, "svg", null);
//// Create an instance of the SVG Generator
//
//           SVGGraphics2D svgGenerator = new SVGGraphics2D(document);
//// set the precision to avoid a null pointer exception in Batik 1.5
//
//           svgGenerator.getGeneratorContext().setPrecision(6);
//// Ask the chart to render into the SVG Graphics2D implementation
//
//           chart.draw(svgGenerator, new Rectangle2D.Double(0, 0, 400, 300), null);
           ChartUtilities.saveChartAsPNG(new File("C:\\Users\\Manuel Liriano\\IdeaProjects\\epa9\\src\\main\\resources\\img\\test.png"), chart, 800, 600);
// Finally, stream out SVG to a file using UTF-8 character to // byte encoding

//           boolean useCSS = true;
//
//          // svgGenerator.stream("test.svg");
//           Writer out = new OutputStreamWriter(
//           new FileOutputStream(new File("C:\\Users\\Manuel Liriano\\IdeaProjects\\epa9\\src\\main\\resources\\img\\test.png")), "UTF-8");
//        svgGenerator.stream(out, useCSS);

       }catch (Exception e){
           e.printStackTrace();
       }


//        Writer out = new OutputStreamWriter(
//                new FileOutputStream(new File("test.svg")), "UTF-8");
//        svgGenerator.stream(out, useCSS);



    }




}
