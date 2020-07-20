package rest_api.model;

import rest_api.entity.Paciente;

import java.io.Serializable;

import java.sql.Date;

//basicamente una tabla de la BD 

public class MPaciente implements Serializable{
    
    public MPaciente()
    {

    }
    public MPaciente(Paciente Paciente){
        this.id = Paciente.getId();
        this.nombre = Paciente.getNombre();
        this.programa_de_salud = Paciente.getPrograma_de_salud();
        this.diagnostico = Paciente.getDiagnostico();
        this.entrada = Paciente.getEntrada();
        this.salida = Paciente.getSalida();
        this.antecedente = Paciente.getAntecedente();
        this.prioridad = Paciente.getPrioridad();
        this.comentario = Paciente.getComentario();
    }
    public MPaciente(Long id,String nombre, String programa_de_salud, String diagnostico, Date entrada, Date salida, String antecedente, int prioridad, String comentario){
        this.id = id;
        this.nombre = nombre;
        this.programa_de_salud = programa_de_salud;
        this.diagnostico = diagnostico;
        this.entrada = entrada;
        this.salida = salida;
        this.antecedente = antecedente;
        this.prioridad = prioridad;
        this.comentario = comentario;
    }
    

    private Long id;
    private String nombre;
    private String programa_de_salud;
    private String diagnostico;
    private Date entrada;
    private Date salida;
    private String antecedente;
    private int prioridad;
    private String comentario;


    //Getters
    public Long getId()
    {
        return id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getPrograma_de_salud()
    {
        return programa_de_salud;
    }

    public String getDiagnostico()
    {
        return diagnostico;
    }

    public Date getEntrada()
    {
        return entrada;
    }

    public Date getSalida()
    {
        return salida;
    }

    public String getAntecedente()
    {
        return antecedente;
    }

    public int getPrioridad()
    {
        return prioridad;
    }

    public String getComentario()
    {
        return comentario;
    }

    //Setters
    public void setId(Long id)
    {
        this.id = id;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setPrograma_de_salud(String programa_de_salud)
    {
        this.programa_de_salud = programa_de_salud;
    }

    public void setDiagnostico(String diagnostico)
    {
        this.diagnostico = diagnostico;
    }    

    public void setEntrada(Date entrada)
    {
        this.entrada = entrada;
    }

    public void setSalida(Date salida)
    {
        this.salida = salida;
    }

    public void setAntecedente(String antecedente)
    {
        this.antecedente = antecedente;
    }

    public void setPrioridad(int prioridad)
    {
        this.prioridad = prioridad;
    }

    public void setComentario(String comentario)
    {
        this.comentario = comentario;
    }
}