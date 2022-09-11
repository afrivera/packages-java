package org.afrivera.app.jardin;

//import org.afrivera.app.hogar.Gato;
//import org.afrivera.app.hogar.Persona; se puede usar el wilcard
import org.afrivera.app.hogar.*;
import static org.afrivera.app.hogar.Persona.*;

// si quiero hacerlo statico
import static org.afrivera.app.hogar.ColorPelo.*;

//import static org.afrivera.app.hogar.Persona.saludar;
//import static org.afrivera.app.hogar.Persona.GENERO_FEMENINO;
//import static org.afrivera.app.hogar.Persona.GENERO_MASCULINO;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona andres = new Persona();
        andres.setName("Andres");
        andres.setColorPelo(CAFE);
        System.out.println(andres.getName());
        Perro p = new Perro(); // solo se importa cuando está en un package diferente
        p.name = "Chloe";

        String jugando = p.jugar(andres);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        System.out.println("generoMujer = " + generoMujer);
        String generoHombre = GENERO_MASCULINO;
        System.out.println("generoHombre = " + generoHombre);
    }
}
