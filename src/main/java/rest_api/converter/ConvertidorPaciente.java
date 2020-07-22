package rest_api.converter;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

import rest_api.entity.Paciente;
import rest_api.model.MPaciente;

@Component("ConPaciente")
public class ConvertidorPaciente {
    public List<MPaciente> convertirLista(List<Paciente> pacientes){
        List<MPaciente> mpaciente = new ArrayList<>();
        for(Paciente paciente : pacientes){
            mpaciente.add(new MPaciente(paciente));
        }
        return mpaciente;
    }

    public MPaciente convertir(Paciente paciente){
        MPaciente mpaciente = new MPaciente(paciente);
        return mpaciente;
    }
    public Paciente convertirmtoe(MPaciente paciente){
        Paciente epaciente = new Paciente(paciente.getNombre(), paciente.getFecha_de_nacimiento(),
                paciente.getFecha_de_defuncion(), paciente.getRut(), paciente.getPrograma_de_salud(),
                paciente.getDiagnostico(), paciente.getEntrada(), paciente.getSalida(), paciente.getAntecedente(),
                paciente.getPrioridad(), paciente.getComentario());
        return epaciente;
    }
}