package holasocios;

/**
 *
 * @author Luis
 */

//clase principal
//Public quiere decir que es vista desde cualquier metodo, desde cualquier clase
//la clase debe llamarse igual que el archivo
public class Holasocios {

    /**
     * @param args the command line arguments
     */
    
    //siempre esta presente
    //Static, que se puede ejcutar sin necesidad de una instancia
    //void no devuelve ningun resultado
    //main el nombre del metodo, como es principal es main
    //pero luego crearemos otros nombres
    //(String[]args)le vamos a pasar una cadena de argumentos
    public static void main(String[] args) {
        //El comando print no crea una nueva linea
        //Println hace saltos de linea
        System.out.println("Yo soy una nueva linea! Jam, chusma"); 
        System.out.print("Yo soy otra cadena muy linda");
        System.out.println(" Puedes escribir numeros en String como el 45 o el "
            + "" + 80);
        System.out.print("esto del print y println es superplay");
        //no crea nueva linea despues del string
    }
    
}
