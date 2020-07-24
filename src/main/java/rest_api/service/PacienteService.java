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

    public boolean crear(Paciente paciente){
        try{
            repositorio.save(paciente);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizarQuimio(Paciente nuevoPaciente, long id){
        try{
            Paciente paciente = repositorio.findById(id);
            paciente.setId_quimio(nuevoPaciente.getId_quimio());
            repositorio.save(paciente);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizarRecuperacion(Paciente nuevoPaciente, long id){
        try{
            Paciente paciente = repositorio.findById(id);
            paciente.setId_recuperacion(nuevoPaciente.getId_recuperacion());
            repositorio.save(paciente);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(long id){
        try{
            Paciente paciente = repositorio.findById(id);
            repositorio.delete(paciente);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Paciente obtenerporId(long id){
        return repositorio.findById(id);
    }

    public List<Paciente> getAll(){
        return repositorio.findAll();
    }
}