package tallerlenguajes.proyecto2.Modelos.Entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Cliente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nombre, Apellido, Email;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    public Cliente() {
    }

    public Cliente(Long id, String nombre, String apellido, String email, Date createAt) {
        this.id = id;
        Nombre = nombre;
        Apellido = apellido;
        Email = email;
        this.createAt = createAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    private static final long serialVersionUID = 1L;
}
