package rest_api.repository;

import java.io.Serializable;
import java.util.List;

import rest_api.entity.Paciente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//esto implementa las operaciones CRUD para ser usadas
@Repository("RepositoryPaciente")
public interface PacienteRepository extends JpaRepository<Paciente, Serializable>{
    public abstract Paciente findById(long id);

    public abstract List<Paciente> findAll();

}