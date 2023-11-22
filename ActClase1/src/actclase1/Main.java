/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actclase1;


public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Juan", 123);
        Materia algoritmos = new Materia("Algoritmos");
        Materia paradigmas = new Materia("Paradigmas");
        Materia diseñoSistemas = new Materia("Diseño de Sistemas");

        algoritmos.agregarCorrelativa(paradigmas);
        paradigmas.agregarCorrelativa(diseñoSistemas);

        alumno.inscribir(algoritmos);
        alumno.inscribir(paradigmas);

        // Verificar si el alumno puede inscribirse a Diseño de Sistemas
        Inscripcion inscripcionDiseño = new Inscripcion(alumno, diseñoSistemas);
        if (inscripcionDiseño.aprobada()) {
            System.out.println("El alumno puede inscribirse a Diseño de Sistemas.");
        } else {
            System.out.println("El alumno no cumple con las correlativas para Diseño de Sistemas.");
        }
    }
}
