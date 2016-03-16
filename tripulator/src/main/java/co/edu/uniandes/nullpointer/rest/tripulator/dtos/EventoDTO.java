/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.nullpointer.rest.tripulator.dtos;

/**
 *
 * @author Jose Daniel
 */
public class EventoDTO {

    public static final String tipoE ="Evento";
    public static final String tipoS ="Sitio";
    
    private Long id;//Long para el identificador del evento
    private String title; //String del nombre del evento
    private String image; //String de la ruta de la imagen del evento
    private String type;  //String del tipo del evento (sitio o evento)
    private Long start;  //Long de la fecha de inicio
    private Long end;    //Long de la fecha final
    private String description;   //String de la descripcion
    //comments;  //Arreglo de comentarios

    /**
     * Constructor por defecto
     */
    public EventoDTO() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param id identificador del evento
     * @param title nombre del evento
     * @param image ruta de la imagen del evento
     * @param type tipo del evento
     * @param start long defecha inicio del evento
     * @param end long de fecha fin del evento
     * @param description descripcion del evento
     */
    public EventoDTO(Long id, String title, String image, String type, Long start, Long end, String description) {
        super();
        this.id = id;
        this.title = title;
        this.image = image;
        this.type = type;
        this.start = start;
        this.end = end;
        this.description = description;
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
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the start
     */
    public Long getStart() {
        return start;
    }

    /**
     * @param start the start to set
     */
    public void setStart(Long start) {
        this.start = start;
    }

    /**
     * @return the end
     */
    public Long getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(Long end) {
        this.end = end;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Convierte el objeto a una cadena
     */
    @Override
    public String toString() {
        return "{id:" + id + ",\n title:'" + title + "',\n image:'" + image
                +"', \n type:'" + type + "',\n start:" + start + ",\n  end:"
                + end + ",\n description:'" + description + "', }";
    }

}