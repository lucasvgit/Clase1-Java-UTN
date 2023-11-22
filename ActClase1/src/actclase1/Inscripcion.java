/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actclase1;


public class Inscripcion {
    private final Alumno alumno;
    private final Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public boolean aprobada() {
        if (materia.getCorrelativas().isEmpty()) {
            return true;
        } else {
            for (Materia correlativa : materia.getCorrelativas()) {
                if (!alumnoTieneMateriaAprobada(correlativa)) {
                    return false;
                }
            }
            return true;
        }
    }

    private boolean alumnoTieneMateriaAprobada(Materia materia) {
        for (Inscripcion inscripcion : alumno.getInscripciones()) {
            if (inscripcion.getMateria().equals(materia)) {
                return true;
            }
        }
        return false;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }
}

