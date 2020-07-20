package rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.io.Serializable;

import rest_api.entity.Paciente;
//esto implementa las operaciones CRUD para ser usadas
@Repository("RepositoryPaciente")
public interface PacienteRepository extends JpaRepository<Paciente, Serializable>,
    PagingAndSortingRepository<Paciente, Serializable>
{
    public abstract Paciente findById(long id);

    public abstract List<Paciente> findAll();
    
    public abstract List<Paciente> findByDiagnostico(String diagnostico);
    
    public abstract void deleteById(long id);
}