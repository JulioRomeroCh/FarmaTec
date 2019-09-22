/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmatec;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author jului
 */
public class Usuario {
    //Atributos del tipo usuario.
    private int cedula;    
    private String NombreUsuario;
    private String direccion;
    private int telefono;
    private String correo;
    private String medicamentoSolicitado;
    //Atributos para el API de gmail.
    private final String usuarioAdmi = "farmatec123@gmail.com";
    private final String contraseña = "mwebqkmjcuezeuxz";
    
    
    
    public Usuario(){
        
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the NombreUsuario
     */
    public String getNombreUsuario() {
        return NombreUsuario;
    }

    /**
     * @param NombreUsuario the NombreUsuario to set
     */
    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the medicamentoSolicitado
     */
    public String getMedicamentoSolicitado() {
        return medicamentoSolicitado;
    }

    /**
     * @param medicamentoSolicitado the medicamentoSolicitado to set
     */
    public void setMedicamentoSolicitado(String medicamentoSolicitado) {
        this.medicamentoSolicitado = medicamentoSolicitado;
    }
    
    
    /**
     * @param Pedido El usuario al que se le manda el correo de compra.
     * @throws javax.mail.internet.AddressException
     */
    public void enviarMensaje(Usuario Pedido) throws AddressException, MessagingException{
    
        //Instancia para enviar propiedades de conexión
        Properties props = new  Properties();
        
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.user", usuarioAdmi);
        props.setProperty("mail.smtp.clave", contraseña);
        
        //Se crea una sesion, esta utiliza las propiedades de conexión 
        Session sesion = Session.getDefaultInstance(props);
        
        //Construcción del mensaje apartir del envio de la sesion
        MimeMessage mensaje = new MimeMessage(sesion);
        
        mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(Pedido.getCorreo()));
        mensaje.setSubject("Pedido de FarmaTEC");
        mensaje.setText("Usuario: " +Pedido.getNombreUsuario()+ "\nNo.Cedula: " +Pedido.getCedula() +"\nDirección: " + Pedido.getDireccion() + "\nNo.Teléfono: " + Pedido.getTelefono() + "\nMedicamentos: " + Pedido.getMedicamentoSolicitado());
        Transport transport = sesion.getTransport("smtp");
        
        //Se establece la conexión
        transport.connect(usuarioAdmi, contraseña);
        
        //Envío del mensaje
        transport.sendMessage(mensaje, mensaje.getAllRecipients());
        
        //Se cierra la conexión
        transport.close();
        
        System.out.println("Se ha enviado el mensaje");

    }
        
}
