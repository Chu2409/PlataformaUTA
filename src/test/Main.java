package test;

import datos.*;
import domain.*;
import java.util.List;
import javax.swing.JOptionPane;
import utilities.Utilidad;

public class Main {

    public static void main(String[] args) {
        //PersonaDAO personaDao = new PersonaDAO();

        //Persona persona1 = new Persona("andres", "146", "Andres", "Turizo", "aturizo@gmail.com");
        //personaDao.insertar(persona1);
        //Persona persona2 = new Persona(2, "fernando", "489", "fernando", "zhu", "fzhu584@gmail.com");
        //personaDao.actualizar(persona2);
        //Persona persona3 = new Persona(3);
        //personaDao.eliminar(persona3);
        
        /*
        List<Persona> usuarios = personaDao.seleccionar();
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i));
        }
        */
        
        

        /*
        RolDAO rolDao = new RolDAO();
        List<Rol> roles = rolDao.seleccionar();
        for (int i = 0; i < roles.size(); i++) {
            System.out.println(roles.get(i));
        } 
        */
        
        /*
        PersonaRolDAO personaRolDao = new PersonaRolDAO();
        List<PersonaRol> personasRoles = personaRolDao.seleccionar();
        for (int i = 0; i < personasRoles.size(); i++) {
            System.out.println(personasRoles.get(i));
        } 
        */
        
        /*
        AlumnoMateriaDAO alumnoMateriaDao = new AlumnoMateriaDAO();
        List<AlumnoMateria> alumnosMaterias = alumnoMateriaDao.seleccionar();
        for (int i = 0; i < alumnosMaterias.size(); i++) {
            System.out.println(alumnosMaterias.get(i));
        }
        */
        
        /*
        MateriaDAO materiaDao = new MateriaDAO();
        List<Materia> materias = materiaDao.seleccionar();
        for (int i = 0; i < materias.size(); i++) {
            System.out.println(materias.get(i));
        }
        */
        
        /*
        CursoDAO cursoDao = new CursoDAO();
        List<Curso> cursos = cursoDao.seleccionar();
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println(cursos.get(i));
        }
        */

        String asignatura = JOptionPane.showInputDialog("ingrese");
        if (asignatura.contains("\"") || asignatura.contains("\'")) {
            System.out.println("si");
        }
    }
    
}
