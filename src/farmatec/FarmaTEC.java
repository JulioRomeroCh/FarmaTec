package farmatec;

import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import java.io.*;

import com.google.api.translate.Language;
import com.google.api.translate.Translate;
import com.google.api.GoogleAPI;

public class FarmaTEC {
//
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MessagingException, Exception {//Inicio Main
        
        //Farmacia 01
        Farmacia farmacia1 = new Farmacia();
        farmacia1.setNombre("FarmaTEC Cartago");
        farmacia1.setCedulaJuridica("4-678-160376");
        farmacia1.setTelefono(25518765);
        farmacia1.setUbicacion("ITCR,Sede central cartago");
        
        //Farmacia 02
        Farmacia farmacia2 = new Farmacia();
        farmacia2.setNombre("FarmaTEC San Carlos");
        farmacia2.setCedulaJuridica("4-678-160567");
        farmacia2.setTelefono(25534573);
        farmacia2.setUbicacion("ITCR,Sede San Carlos");

        //Farmacia 03
        Farmacia farmacia3 = new Farmacia();
        farmacia3.setNombre("FarmaTEC San José");
        farmacia3.setCedulaJuridica("4-678-160567");
        farmacia3.setTelefono(25534573);
        farmacia3.setUbicacion("ITCR,Sede San Carlos");

        //Medicamento 1
        Medicamentos medicamento1 = new Medicamentos();
        medicamento1.setNombre("Diazepam");
        medicamento1.setMarca("Patito");
        medicamento1.setDescripcion("Pa' mimir");
        medicamento1.setTipo_Medicamento("Sedante");
        medicamento1.setDosis("1 pastilla, no más miher, si no se muere");
        medicamento1.setEfectos_Secundarios("Confusión");

        //Medicamento 2
        Medicamentos medicamento2 = new Medicamentos();
        medicamento2.setNombre("Paracetamol");
        medicamento2.setMarca("Patito");
        medicamento2.setDescripcion("Pa' mimir");
        medicamento2.setTipo_Medicamento("Sedante");
        medicamento2.setDosis("1 pastilla, no más miher, si no se muere");
        medicamento2.setEfectos_Secundarios("Confusión");
        medicamento2.setCantidad(3);

        //Creación de la lista de medicamentos
        listaMedicamentos listam = new listaMedicamentos();
        listam.append(medicamento1);
        listam.append(medicamento2);
        System.err.println(medicamento2.getCantidad());
        System.out.println("Lista de medicamentos: " + listam.toString());

        //Creación de la lista de farmacias
        listaFarmacias lista1 = new listaFarmacias();
        lista1.append(farmacia1);
        lista1.append(farmacia2);
        lista1.append(farmacia3);
        
        
        
        
        
        
        
        
             
        
        
        //Muestra la lista de farmacias actuales
        System.out.println("Lista de farmacias: " + lista1.toString());
        lista1.goToPos(2);
        lista1.remove();
        System.out.println("Nueva: " + lista1.toString());

        
        //Remueve un medicamento
        listam.goToPos(1);
        listam.remove();
        System.out.println("Nueva: " + listam.toString());
  
        //Añade uno o más medicamentos a la farmacia
        lista1.goTonom("FarmaTEC Cartago");       
        Farmacia farma1 = (Farmacia)lista1.getElement();
        listaMedicamentos lc = farma1.listameds;
        lc.append(medicamento1);
        lc.append(medicamento2);
        //Salida con los medicamentos añadidos 
        System.err.println("PRUEBA 1: " + farma1.getNombre() + " " + lc.toString());
        
        
        //Añade uno o más medicamentos a la farmacia
        lista1.goTonom("FarmaTEC San Carlos");
        Farmacia farma2 = (Farmacia)lista1.getElement();
        listaMedicamentos lsj = farma2.listameds;
        lsj.append(medicamento1);
        //Salida con los medicamentos añadidos
        System.err.println("PRUEBA 2: " + farma2.getNombre() + " " + lsj.toString());
        
    
        //funcion 3                                
        listaFarmacias VerMedi= new listaFarmacias();
        VerMedi.append(farmacia1);
        VerMedi.append(farmacia2);
        VerMedi.append(farmacia3);
        Language Idio=VerMedi.SeleccionarIdioma();
        if (Idio!=null){
            listaMedicamentos listaDeMedicinas=VerMedi.VerMedicamentos(Idio);
            listaDeMedicinas.VisualizarMedicamentos(Idio);
            }     
        
        //funcion 4
        //Se crea un usuario nuevo y se le asignan el valor a los atributos.
        ListaPedidos ListaTotalPedidos=new ListaPedidos();
        Usuario usuario2 = new Usuario ();
        usuario2.setCedula(23456474);
        usuario2.setCorreo("kevrjs172@gmail.com");
        usuario2.setDireccion("Casa de Ganja Boy");
        InputStreamReader en1 = new InputStreamReader (System.in);
        BufferedReader entrada1 = new BufferedReader (en1);
        System.out.println("Ingrese su medicamento ");
        String MedSolicitado1 = entrada1.readLine();
        
        
        if (VerMedi.BuscarEnFarmacia(MedSolicitado1)!= null){
            usuario2.setMedicamentoSolicitado(VerMedi.BuscarEnFarmacia(MedSolicitado1));
            
            usuario2.setTelefono(88074567);
           usuario2.setNombreUsuario("Kevin Rojas");
        
            System.out.println(usuario2.getCedula());
            System.out.println(usuario2.getCorreo());
            System.out.println(usuario2.getDireccion());
            System.out.println(usuario2.getMedicamentoSolicitado().getNombre());
            System.out.println(usuario2.getNombreUsuario());
            System.out.println(usuario2.getTelefono());
            System.out.println(ListaTotalPedidos.toString());

    } else if  (VerMedi.BuscarEnFarmacia(MedSolicitado1)== null){
                    System.out.println("No se encuentra el medicamento");
                    }
        
        
        Usuario SolicitudUsuario= new Usuario();
        SolicitudUsuario.setCedula(305310180);
        SolicitudUsuario.setCorreo("joulio@gmail.com");
        SolicitudUsuario.setDireccion("Vas para Dota");
        InputStreamReader en = new InputStreamReader(System.in);
         BufferedReader entrada = new BufferedReader (en);
         System.out.println("Ingrese un medicamento");
         String MedSolicitado = entrada.readLine();
         
         
         
        
        
        System.out.println(VerMedi.BuscarEnFarmacia(MedSolicitado));
        //Si encuentra el medicamento en alguna farmacia, termina de asignar atributos.
        if (VerMedi.BuscarEnFarmacia(MedSolicitado)!= null){
            SolicitudUsuario.setMedicamentoSolicitado(VerMedi.BuscarEnFarmacia(MedSolicitado));
            
            SolicitudUsuario.setTelefono(88074567);
           SolicitudUsuario.setNombreUsuario("Julio Romero");
        
            System.out.println(SolicitudUsuario.getCedula());
            System.out.println(SolicitudUsuario.getCorreo());
            System.out.println(SolicitudUsuario.getDireccion());
            System.out.println(SolicitudUsuario.getMedicamentoSolicitado().getNombre());
            System.out.println(SolicitudUsuario.getNombreUsuario());
            System.out.println(SolicitudUsuario.getTelefono());
            //Se llama el metodo para enviar el correo
            //////////////////SolicitudUsuario.enviarMensaje(SolicitudUsuario);
            //Se agrega a lista pedidos.
            ListaTotalPedidos.append(SolicitudUsuario);
            ListaTotalPedidos.append(usuario2);
            //ListaTotalPedidos.append(SolicitudUsuario);
            System.out.println(ListaTotalPedidos.toString());

    } else if  (VerMedi.BuscarEnFarmacia(MedSolicitado)== null){
                    System.out.println("No se encuentra el medicamento");
                    }
     
    
    /**Atencion cola = new Atencion ();
    cola.enqueue(ListaTotalPedidos);
        System.out.println(cola.toString()+ cola.encontrar(SolicitudUsuario));
        cola.reducir(SolicitudUsuario);
        System.out.println("Cantidad actual de: " + SolicitudUsuario.getMedicamentoSolicitado().getNombre() + " es " + SolicitudUsuario.getMedicamentoSolicitado().getCantidad());
    cola.dequeue();
        System.out.println("Lista: " + cola.toString());
    */
    
    
  System.err.println(ListaTotalPedidos.toString());
  Atencion cola = new Atencion ();
  cola.enqueue(ListaTotalPedidos);
  ListaPedidos primero = (ListaPedidos) cola.first();
  Usuario usuario = primero.getUsuario();
  System.out.println("AQUÍ VIENE LA COLA");

     System.out.println("Atendiendo a: " + usuario.getNombreUsuario() + "\n" + "medicamento: " + usuario.getMedicamentoSolicitado().getNombre() + "\n" + "Cantidad: " + usuario.getMedicamentoSolicitado().getCantidad());
     System.out.println("Cantidad actual de: " + usuario.getMedicamentoSolicitado().getNombre() + " es " + cola.reducir(usuario));
     primero.removerListaPedidos(0);  
 Usuario usuario3 = (Usuario) primero.getUsuario();

 
    System.err.println(primero.toString());
     System.out.println("Atendiendo a: " + usuario3.getNombreUsuario() + "\n" + "medicamento: " + usuario3.getMedicamentoSolicitado().getNombre() + "\n" + "Cantidad: " + usuario3.getMedicamentoSolicitado().getCantidad());
     System.out.println("Cantidad actual de: " + usuario3.getMedicamentoSolicitado().getNombre() + " es " + cola.reducir(usuario3));
 
  
}
}
