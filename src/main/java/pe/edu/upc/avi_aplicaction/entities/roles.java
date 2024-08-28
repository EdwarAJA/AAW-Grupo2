package pe.edu.upc.avi_aplicaction.entities;

import jakarta.persistence.*;

@Entity
@Table (name ="roles")
public class roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Rol;

    @Column(name ="Tipo",nullable = false)
    private String Tipo;

    public roles(int id_Rol, String Tipo)
    {
        this.id_Rol=id_Rol;
        this.Tipo=Tipo;
    }

    public roles(){

    }
    public String getType() {return Tipo;}


}
