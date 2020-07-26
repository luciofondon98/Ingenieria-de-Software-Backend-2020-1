package rest_api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rest_api.entity.Paciente;
import rest_api.service.PacienteService;


@RestController
@RequestMapping("/api/pacientes")
public class PacienteController{
    @Autowired
    @Qualifier("ServicioPaciente")
    PacienteService service;


    @PostMapping("/paciente") // localhost:8000/api/pacientes/paciente
    public Paciente agregarCliente(@RequestBody @Valid Paciente paciente){
        return service.crear(paciente);
    }

    @GetMapping("/paciente/{id}") // localhost:8000/api/pacientes/paciente/id
    public Paciente obtenerPaciente(@PathVariable("id") long id){
        return service.obtenerPorId(id);
    }
    
    @GetMapping("/diagnostico/{diagnostico}") // localhost:8000/api/pacientes/diagnostico/diagnostico
    public List<Paciente> obtenerPacientesPorDiagnostico(@PathVariable("diagnostico") String diagnostico){
        return service.obtenerPorDiagnostico(diagnostico);
    }

    @GetMapping("/prioridad/{prioridad}") // localhost:8000/api/pacientes/prioridad/prioridad
    public List<Paciente> obtenerPacientePorPrioridad(@PathVariable("prioridad") int prioridad){
        return service.obtenerPorPrioridad(prioridad);
    }

    @GetMapping("/getAll") // localhost:8000/api/pacientes/getAll
    public List<Paciente> getAllPacientes(){
        return service.getAll();
    }

    @PutMapping("/quimio/{id}")
    public Paciente actualizarQuimio(@PathVariable("id") long id , @RequestBody @Valid Paciente nuevoPaciente){
        return service.actualizarQuimio(nuevoPaciente,id);
    }

    @PutMapping("/recuperacion/{id}")
    public Paciente actualizarRecuperacion(@PathVariable("id") long id , @RequestBody @Valid Paciente nuevoPaciente){
        return service.actualizarRecuperacion(nuevoPaciente,id);
    }

    @DeleteMapping("/paciente/{id}")
    public Paciente borrarPaciente(@PathVariable("id") long id){
        return service.borrar(id);
    }
}