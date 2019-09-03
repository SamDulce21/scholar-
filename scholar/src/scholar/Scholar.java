/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholar;

/**
 *
 * @author estudiante
 */
public class Scholar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado Empleado1 = new Empleado ();
        Empleado1.nombre = "samuel ";
        Empleado1.apellido = "dulce ";
        Empleado1.fecha_nacimiento = "21 - 10 - 1999"; 
       
      
        
        
        
       // System.out.println(this.nombre + " " + this.apellido);
        Empleado1.printName();
        Empleado1.fecha_nacimiento = "21 - 10 - 1999" ;
        
        
        
        Estudiante Estudiante1 = new Estudiante ();
        Estudiante1.nombre = "samuel ";
        Estudiante1.apellido = "dulce ";
        System.out.println("nombre del estudiante1 " + Estudiante1.nombre + Estudiante1.apellido);
        Estudiante1.printName();
        
        
                
              
                
    }
    
}
