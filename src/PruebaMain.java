
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jcoq2
 */
public class PruebaMain {

    public static void main(String[] args) {
        
    
   ArrayList<Usuario> users = new ArrayList();
    //  ArrayList<Permisos> permisos = new ArrayList();
    
    
   
    Scanner leer = new Scanner(System.in);
    String fileName;
    String opcion = "";
            
    while(!opcion.equalsIgnoreCase("no")){
        System.out.println("Desea Crear Usuario?");
        opcion = leer.next();
        if(opcion.equalsIgnoreCase("si")){
            String usuario;
           String password;
        boolean gestionDeNuevosUsuarios,  create,  select,  insert,  delete,  drop;
        String deseo = "";
            System.out.println("Ingrese Usuario: ");
            usuario = leer.next();
            System.out.println("Ingrese password");
            password = leer.next();
            System.out.println("Desea tener los permisos?");
            deseo = leer.next();
            if(deseo.equalsIgnoreCase("si")){
                gestionDeNuevosUsuarios = true;
                create = true;
                select = true;
                insert = true;
                delete = true;
                drop = true;
            }else{
                gestionDeNuevosUsuarios = false;
                create = false;
                select = false;
                insert = false;
                delete = false;
                drop = false;
            }
            
            users.add(new Usuario(usuario,password,gestionDeNuevosUsuarios,create,select,insert,delete,drop));
        }
    }
        System.out.println("Ingrese nombre de archivo: ");
        fileName = leer.next();
       /* try {
			FileOutputStream f = new FileOutputStream(new File(fileName+".txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			for(Usuario user: users){
                            o.writeObject(user);
                        }

			o.close();
                        o.flush();
			f.close();

			FileInputStream fi = new FileInputStream(new File(fileName+".txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			// Read objects
			for(Usuario user: users){
                           user = (Usuario) oi.readObject();
                            System.out.println(user);
                        }

			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}

    /*
      File archivo = null;
      FileReader canalLectura = null;
      BufferedReader ramLectura = null;
    
      
      try{
          archivo = new File("./usuarios.txt");
          canalLectura = new FileReader(archivo);
          ramLectura = new BufferedReader(canalLectura);
          
          String linea ;
          while((linea = ramLectura.readLine()) != null){
              System.out.println(linea);
          }
            ramLectura.close();
      canalLectura.close();
      }catch(IOException e){
          System.out.println(e);
      }
    */
    
    File file = null;
    FileWriter writer = null;
   BufferedWriter ramEscritura = null;
    
   try{
       file = new File("./"+fileName+".txt");
       writer = new FileWriter(file,false);
       ramEscritura = new BufferedWriter(writer);
       
       ramEscritura.write("#USUARIOS#\n");
       for(Usuario user: users){
           ramEscritura.write(user.getUsuario());
           ramEscritura.newLine();
       }
       ramEscritura.write("#PASSWORDS#\n");
       for(Usuario user: users){
           ramEscritura.write(user.getPassword());
           ramEscritura.newLine();
       }
       ramEscritura.flush();
       ramEscritura.close();
       writer.close();
   }catch(IOException e){
       System.out.println(e);
   }
    }

}
