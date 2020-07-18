package rest_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import javax.validation.Valid;


import rest_api.entity.Paciente;
import rest_api.model.MPaciente;
import rest_api.service.PacienteService;

import java.util.List;

@CrossOrigin(origins = "*")
//esto mapea la app en requests URL->HTTP
@RestController
//localhost:puerto/api/medicos
@RequestMapping("/api/pacientes") //quizás cambiar "/api/pacientes" por "ISW/pacientes"
public class PacienteController
{
    @Autowired
    @Qualifier("ServicioPaciente")
    PacienteService service;

    // post 1 medico, requiere un body json equivalente a la clase Medico
    // Post localhost:puerto/api/medicos
    @PostMapping("")
    public ResponseEntity<Paciente> addPaciente (@RequestBody Paciente paciente)
    {

        System.out.println(paciente.getNombre());
        Paciente med = service.saveOrUpdatePaciente(paciente);
        return new ResponseEntity<Paciente>(med, HttpStatus.CREATED);
    }
    // get all medicos
    //Get localhost:puerto/api/medicos
    @GetMapping("/test")
    public List<MPaciente> getPacientes()
    {
        return service.listAll();
    }
    // get 1 medico by id, el parametro esta en la URL
    //GET localhost:puerto/api/medicos/id
    @GetMapping("/{id}")
    public MPaciente getPacienteById(@PathVariable("id") Long id)
    {
        return service.listOne(id);
    }
    // get medicos que tengan el estado definido, este es un parametro de la request
    @GetMapping("/filter")
    public List<MPaciente> getPacientesByEstado(@RequestParam(value="estado") String estado)
    {
        return service.listByEstado(estado);
    }
    // update 1 medico, sobre su id
    @PutMapping("/{id}")
    public Paciente updatePaciente(@PathVariable Long id, @RequestBody MPaciente paciente) 
    {
        MPaciente med = service.listOne(id); 
        Paciente newmed = service.convert(med);
        newmed.setId(id);
        return service.saveOrUpdatePaciente(newmed);
    }
    // delete 1 medico, sobre su id
    @DeleteMapping("/{id}") 
    public ResponseEntity<String> deletePaciente(@PathVariable Long id)
    {
        try{
            service.deletePaciente(id);
            return new ResponseEntity<>(
            "Se borro con exito", 
            HttpStatus.BAD_REQUEST);
        }catch(Exception e) {
            return new ResponseEntity<>(
            "Ocurrio un error", 
            HttpStatus.BAD_REQUEST);
        }
    }
}