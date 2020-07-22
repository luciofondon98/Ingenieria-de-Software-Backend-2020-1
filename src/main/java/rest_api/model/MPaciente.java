package rest_api.model;
import rest_api.entity.Paciente;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

//basicamente una tabla de la BD 

public class MPaciente implements Serializable{
    
    public MPaciente()
    {

    }
    public MPaciente(Paciente Paciente){
        this.id = Paciente.getId();
        this.nombre = Paciente.getNombre();
        this.fecha_de_nacimiento = getFecha_de_nacimiento();
        this.fecha_de_defuncion = getFecha_de_defuncion();
        this.rut = getRut();
        this.programa_de_salud = Paciente.getPrograma_de_salud();
        this.diagnostico = Paciente.getDiagnostico();
        this.entrada = Paciente.getEntrada();
        this.salida = Paciente.getSalida();
        this.antecedente = Paciente.getAntecedente();
        this.prioridad = Paciente.getPrioridad();
        this.comentario = Paciente.getComentario();
    }
    public MPaciente(Long id,String nombre, Date fecha_de_nacimiento, Timestamp fecha_de_defuncion, String rut, String programa_de_salud, String diagnostico, Timestamp entrada, Timestamp salida, String antecedente, int prioridad, String comentario){
        this.id = id;
        this.nombre = nombre;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.fecha_de_defuncion = fecha_de_defuncion;
        this.rut = rut;
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
    private Date fecha_de_nacimiento;
    private Timestamp fecha_de_defuncion;
    private String rut;
    private String programa_de_salud;
    private String diagnostico;
    private Timestamp entrada;
    private Timestamp salida;
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

    public Date getFecha_de_nacimiento()
    {
        return fecha_de_nacimiento;
    }

    public Timestamp getFecha_de_defuncion()
    {
        return fecha_de_defuncion;
    }

    public String getRut()
    {
        return rut;
    }

    public String getPrograma_de_salud()
    {
        return programa_de_salud;
    }

    public String getDiagnostico()
    {
        return diagnostico;
    }

    public Timestamp getEntrada()
    {
        return entrada;
    }

    public Timestamp getSalida()
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

    public void setFecha_de_nacimiento(Date fecha_de_nacimiento)
    {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public void setFecha_de_defuncion(Timestamp fecha_de_defuncion)
    {
        this.fecha_de_defuncion = fecha_de_defuncion;
    }

    public void setRut(String rut)
    {
        this.rut = rut;
    }

    public void setPrograma_de_salud(String programa_de_salud)
    {
        this.programa_de_salud = programa_de_salud;
    }

    public void setDiagnostico(String diagnostico)
    {
        this.diagnostico = diagnostico;
    }    

    public void setEntrada(Timestamp entrada)
    {
        this.entrada = entrada;
    }

    public void setSalida(Timestamp salida)
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