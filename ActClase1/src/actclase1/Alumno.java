/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actclase1;


import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private final String nombre;
    private final int legajo;
    private final List<Inscripcion> inscripciones;

    public Alumno(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.inscripciones = new ArrayList<>();
    }

    public void inscribir(Materia materia) {
        Inscripcion inscripcion = new Inscripcion(this, materia);
        inscripciones.add(inscripcion);
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }
}
