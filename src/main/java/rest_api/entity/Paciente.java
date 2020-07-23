package rest_api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.sql.Date;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "paciente")
public class Paciente{

     //Atributos
     @Id
     @GenericGenerator(name="incrementpaciente", strategy="increment")
     @GeneratedValue(generator="incrementpaciente")
     @Column(name="id")
     private Long id;
 
     @Column(name="id_quimio")
     private Long id_quimio;
     @Column(name="id_recuperacion")
     private Long id_recuperacion;

     @Column(name = "nombre")
     private String nombre;
     @Column(name = "fecha_de_nacimiento")
     private Date fecha_de_nacimiento;
     @Column(name = "fecha_de_defuncion")
     private Timestamp fecha_de_defuncion;
     @Column(name = "rut")
     private String rut;
     @Column(name = "programa_de_salud")
     private String programa_de_salud;
     @Column(name = "diagnostico")
     private String diagnostico;
     @Column(name = "entrada") 
     private Timestamp entrada;
     @Column(name = "salida")
     private Timestamp salida;
     @Column(name = "prioridad")
     private int prioridad;
     @Column(name = "comentario")
     private String comentario;
     
    
    public Paciente()
    {

    }
    public Paciente(long id, long id_quimio, long id_recuperacion, String nombre, Date fecha_de_nacimiento, Timestamp fecha_de_defuncion, String rut, String programa_de_salud, String diagnostico, Timestamp entrada, Timestamp salida, int prioridad, String comentario){
        this.id_quimio = id_quimio;
        this.id_recuperacion = id_recuperacion;
        this.nombre = nombre;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.fecha_de_defuncion = fecha_de_defuncion;
        this.rut = rut;
        this.programa_de_salud = programa_de_salud;
        this.diagnostico = diagnostico;
        this.entrada = entrada;
        this.salida = salida;
        this.prioridad = prioridad;
        this.comentario = comentario;
    }

   
    //Getters
    public Long getId()
    {
        return id;
    }

    public Long getId_quimio()
    {
        return id_quimio;
    }

    public Long getId_recuperacion()
    {
        return id_recuperacion;
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

    public void setId_quimio(Long id_quimio)
    {
        this.id_quimio = id_quimio;
    }

    public void setId_recuperacion(Long id_recuperacion)
    {
        this.id_recuperacion = id_recuperacion;
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

    public void setPrioridad(int prioridad)
    {
        this.prioridad = prioridad;
    }

    public void setComentario(String comentario)
    {
        this.comentario = comentario;
    }
}