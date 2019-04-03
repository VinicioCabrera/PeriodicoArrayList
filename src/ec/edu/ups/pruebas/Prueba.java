/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.pruebas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
/*import ec.edu.ups.clases.EstructuraPeriodico;
import ec.edu.ups.clases.Multimedia;
import ec.edu.ups.clases.Noticia;
import ec.edu.ups.clases.RedSocial;
import ec.edu.ups.clases.Seccion;

/**
 *
 * @author Estudiante
 */
public class Prueba {

    public static void main(String[] args) {
        
      ArrayList<String>facebook;
      facebook=new ArrayList<String>();
      
      facebook.add("123");
      facebook.add("Facebook");
      facebook.add("www.facebook.com");
      
      for(int i=0;i<facebook.size();i++){
          System.out.println("-->"+facebook.get(i));
      }
        /*RedSocial facebook = new RedSocial();
        facebook.setCodigo(1);
        facebook.setNombre("Facebook");
        facebook.setUrl("www.facebook.com");
        int cod = facebook.getCodigo();
        String nom = facebook.getNombre();
        String url = facebook.getUrl();
        System.out.println("Codigo: " + cod);
        System.out.println("Nombre: " + nom);
        System.out.println("URL: " + url);*/
        ArrayList<String>imagenes;
        imagenes = new ArrayList<String>();
        
        imagenes.add("Png");
        imagenes.add("Imagen");
        imagenes.add("c:Escritorio/imagenes");
        imagenes.add("30.12");
     
        for(int r=0;r<imagenes.size();r++){
            System.out.println("-->"+imagenes.get(r));
        }
       /* Multimedia imagenes = new Multimedia();
        imagenes.setFormato("png");
        imagenes.setNombre("Imagen");
        imagenes.setPath("c:Escritorio/imagenes");
        imagenes.setTamañoBytes(30.12);
        String forma = imagenes.getFormato();
        double tamaby = imagenes.getTamañoBytes();
        String nomb = imagenes.getNombre();
        String pat = imagenes.getPath();
        System.out.println("formato: " + forma);
        System.out.println("tamañobytes:" + tamaby);
        System.out.println("nombre: " + nomb);
        System.out.println("patn: " + pat);*/

       
    
        
        ArrayList<String>deportes;
        deportes = new ArrayList<String>();
        
        deportes.add("Deportes");
        deportes.add("sub 20 gana el mundial");
        
        
        for(int d=0;d<deportes.size();d++){
            System.out.println("-->"+deportes.get(d));
        }
        /*Seccion deportes = new Seccion();
        deportes.setNombre("Deportes");
        deportes.setNoticia("sub 20 gana el mundial");
        String no = deportes.getNombre();
        String not = deportes.getNoticia();
        System.out.println("nombre: " + no);
        System.out.println("noticia: " + not);*/

        Date fecha0=new Date();
        SimpleDateFormat formato1=new SimpleDateFormat("dd/MM/yyyy");
            String fecha0Formateada= formato1.format(fecha0);
        GregorianCalendar fechaESPE=new GregorianCalendar(2019,4,30);
    
        
        ArrayList<String>Portada;
        Portada = new ArrayList<String>();
        
        Portada.add("AV.Benigno malo");
        Portada.add("sub 20 gana el mundial");
        System.out.println("-->Fecha: "+formato1.format(fechaESPE.getTime()));
        Portada.add("el comercio");
        for(int j=0;j<Portada.size();j++){
            System.out.println("-->"+Portada.get(j));
        }
        /*EstructuraPeriodico portada = new EstructuraPeriodico();
        portada.setUbicacion("direccion");
        portada.setFecha(30 +"/"+ 5+ "/"+ 19);
        portada.setNombrePeriodico("comercio");
        String ubi = portada.getUbicacion();
        String noPe = portada.getNombrePeriodico();
        String fe = portada.getFecha();
        System.out.println("ubicacion: " + ubi);
        System.out.println("nombreperiodico: " + noPe);
        System.out.println("fecha: " + fe);*/
        Date fecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
            String fechaFormateada= formato.format(fecha);
        GregorianCalendar fecha1=new GregorianCalendar(2019,3,12);
    
        
        ArrayList<String>autor;
        autor = new ArrayList<String>();
        
        autor.add("NombreAutor");
        autor.add("noticia");
        System.out.println("-->Fecha: "+formato.format(fecha1.getTime()));
         autor.add("Imagenes");
          autor.add("Cronica");
        for(int j=0;j<autor.size();j++){
            System.out.println("-->"+autor.get(j));
        }
        /*Noticia autor=new Noticia();
        autor.setAutor("nombreautor");
        autor.setContenido("comenta");
        autor.setFecha(12+"/"+4+"/"+19);
        autor.setMultimedia("imagenes");
        autor.setTitulo("cronica");
        String aut=autor.getAutor( );
        String cont=autor.getContenido( );
        String fec=autor.getFecha( );
        String mult=autor.getMultimedia( );
        String tit=autor.getTitulo( );
        System.out.println("Autor: " + aut);
        System.out.println("contenido: " + cont);
        System.out.println("fecha: " + fec);
        System.out.println("titulo: " + tit);
        System.out.println("multimedia: " + mult);*/
       
    }

}
