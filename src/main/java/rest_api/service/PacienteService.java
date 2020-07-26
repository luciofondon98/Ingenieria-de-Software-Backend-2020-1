package rest_api.service;

import java.util.List;

import rest_api.repository.PacienteRepository;
import rest_api.entity.Paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("ServicioPaciente")
public class PacienteService{
    @Autowired
    @Qualifier("RepositoryPaciente")
    private PacienteRepository repositorio;

    public Paciente crear(Paciente paciente){
        repositorio.save(paciente);
        return paciente;
    }

    public Paciente actualizarPaciente(Paciente nuevoPaciente){
        repositorio.save(nuevoPaciente);
        return nuevoPaciente;
    }

    public Paciente actualizarQuimio(Paciente nuevoPaciente, long id){
        Paciente paciente = repositorio.findById(id);
        paciente.setId_quimio(nuevoPaciente.getId_quimio());
        repositorio.save(paciente);
        return paciente;
    }

    public Paciente actualizarRecuperacion(Paciente nuevoPaciente, long id){
        Paciente paciente = repositorio.findById(id);
        paciente.setId_recuperacion(nuevoPaciente.getId_recuperacion());
        repositorio.save(paciente);
        return paciente;
    }

    public Paciente borrar(long id){
        Paciente paciente = repositorio.findById(id);
        repositorio.delete(paciente);
        return paciente;
    }

    public Paciente obtenerPorId(long id){
        return repositorio.findById(id);
    }

    public List<Paciente> getAll(){
        return repositorio.findAll();
    }
    
    public Paciente obtenerPorRut(String rut){
        return repositorio.findByRut(rut);
    }
    
    public Paciente obtenerPorNombre(String nombre){
        return repositorio.findByNombre(nombre);
    }

    public List<Paciente> obtenerPorDiagnostico(String diagnostico){
        return repositorio.findByDiagnostico(diagnostico);
    }

    public List<Paciente> obtenerPorPrioridad(int prioridad){
        return repositorio.findByPrioridad(prioridad);
    }
}