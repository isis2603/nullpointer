/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.nullpointer.rest.tripulator.dtos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import uk.co.jemos.podam.common.PodamExclude;

/**
 *
 * @author Juan Sebastian Cardona
 */
@XmlRootElement
public class ViajeroDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String usuario;
    @PodamExclude
    private List<ItinerarioDTO> itinerarios = new ArrayList<>();

   
    /**
     * Constructor con parámetros.
     *
     * @param id identificador de un Viajero
     * @param nombre nombre de un Viajero
     * @param apellido apellido de un Viajero
     * @param contraseña contraseña de un Viajero
     * @param usuario usuario de un Viajero
     */
    public ViajeroDTO(){
        
    }
    
    public ViajeroDTO(Long id, String nombre, String apellido,String email, String password, String usuario) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.usuario = usuario;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return el apellido
     */
    public String getApellido() {
        return apellido;
    }

   

    /**
     * @return el usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param nombre el nombre a poner
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param apellido el apellido a poner
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    

    /**
     * @param usuario el usuairo a poner
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<ItinerarioDTO> getItinerarios() {
        return itinerarios;
    }

    public void setItinerarios(List<ItinerarioDTO> itinerarios) {
        this.itinerarios = itinerarios;
    }

    /**
     * Convierte el objeto a una cadena
     * @return 
     */
    @Override
    public String toString() {
        return "{ id : " + id + ", nombre : \"" + nombre + "\" "
                + ", apellido : \"" + apellido + "\" "
                + ", contrasena : \"" +  password + "\" "
                + ", usuario : \"" + usuario + "\" " + "}";

    }
}
