package org.afrivera.app.jardin;

import org.afrivera.app.hogar.Persona;

public class Perro {

    protected String name;
    protected String breed;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
