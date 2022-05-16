package co.com.sofkau.entrenamiento.curso.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.values.CursoId;
import co.com.sofkau.entrenamiento.curso.values.Fecha;
import co.com.sofkau.entrenamiento.curso.values.Nombre;

public class AgregarMentoria extends Command {
    private final CursoId cursoId;
    private final Nombre nombre;
    private final Fecha fecha;

    public AgregarMentoria(CursoId cursoId, Nombre nombre, Fecha fecha) {
        this.cursoId = cursoId;
        this.nombre = nombre;
        this.fecha = fecha;
    }


    public CursoId getCursoId() {
        return cursoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Fecha getFecha() {
        return fecha;
    }



}
