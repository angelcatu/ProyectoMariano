/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarchivosdetexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author cdavila
 */
public class EjemploArchivosDeTexto {

    /**
     * @param args the command line arguments
     */
    
    public static ArrayList<Elemento> lista = new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String ruta = "archivo.csv";
        
        escribir(ruta,"1,a,b,c\n2,d,e,f\n3,g,h,i");
        
        String contenido = leer(ruta);
        
        System.out.println("-----------------ARCHIVO------------------");
        System.out.println(contenido);
        System.out.println("-----------------ARCHIVO------------------");
        
        for(Elemento e: lista){
            System.out.println("------------------ELEMENTO-------------------");
            System.out.println("ID: "+e.id);
            System.out.println("LETRA1: "+e.letra1);
            System.out.println("LETRA2: "+e.letra2);
            System.out.println("LETRA3: "+e.letra3);
            System.out.println("------------------ELEMENTO-------------------");
        }
        
        
    }
    
    public static void escribir(String ruta, String contenido){
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try{
            fichero = new FileWriter(ruta);
            pw = new PrintWriter(fichero);
            pw.write(contenido);
            pw.close();
            fichero.close();
        }catch(Exception e){
            System.out.println("Error al tratar de escribir el archivo: " + e.getMessage());
        }finally{
            try {
                pw.close();
                fichero.close();
            } catch (Exception e) {
                System.out.println("No se pudo cerrar el archivo: "+ e.getMessage());
            }
        }
        
    }
    
    public static String leer(String ruta){
    
        String contenido = "";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null){
                contenido += linea+"\n";
                
                String [] data = linea.split(",");
                Elemento e = new Elemento();
                e.id = Integer.parseInt(data[0]);
                e.letra1 = data[1];
                e.letra2 = data[2];
                e.letra3 = data[3];
                lista.add(e);
                
            }
            
            
            
            br.close();
            fr.close();            
            
        }catch(Exception e){
            System.out.println("Error al tratar de leer el archivo: " + e.getMessage());
        }finally{
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (Exception e) {
                System.out.println("No se pudo cerrar el archivo: "+ e.getMessage());
            }
        }
        
        return contenido;
        
    }

   
    
}
