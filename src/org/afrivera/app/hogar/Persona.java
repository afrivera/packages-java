package org.afrivera.app.hogar;

public class Persona {
    private String name;
    private String lastName;
    private ColorPelo colorPelo;

    public static final String GENERO_MASCULINO = "Masculino";
    public static final String GENERO_FEMENINO = "Femenino";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String lanzarPelota(){
        return "Lanzar la pelota al perro";
    }

    public static String saludar(){
        return "Hola que tal";
    }
}
