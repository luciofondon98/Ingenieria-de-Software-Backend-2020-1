package rest_api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date; //quizas sirve


//basicamente una tabla de la BD 

@Entity
@Table(name = "paciente")
public class Paciente implements Serializable {
    
    public Paciente()
    {

    }
    public Paciente(String nombre, String programa_de_salud, String diagnostico, Date entrada, Date salida, String antecedente, int prioridad, String comentario){
        this.nombre = nombre;
        this.programa_de_salud = programa_de_salud;
        this.diagnostico = diagnostico;
        this.entrada = entrada;
        this.salida = salida;
        this.antecedente = antecedente;
        this.prioridad = prioridad;
        this.comentario = comentario;
    }

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "programa_de_salud")
    private String programa_de_salud;
    @Column(name = "diagnostico")
    private String diagnostico;
    @Column(name = "entrada")
    private Date entrada;
    @Column(name = "salida")
    private Date salida;
    @Column(name = "antecedente")
    private String antecedente;
    @Column(name = "prioridad")
    private int prioridad;
    @Column(name = "comentario")
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