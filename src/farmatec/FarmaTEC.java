/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmatec;

/**
 *
 * @author jului
 */
public class FarmaTEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Farmacia 01
      Farmacia farmacia1 = new Farmacia ();
      farmacia1.setNombre("FarmaTEC Cartago");
      farmacia1.setCedulaJuridica("4-678-160376");
      farmacia1.setTelefono(25518765);
      farmacia1.setUbicacion("ITCR,Sede central cartago");
      //Farmacia 02
      Farmacia farmacia2 = new Farmacia ();
      farmacia2.setNombre("FarmaTEC San Carlos");
      farmacia2.setCedulaJuridica("4-678-160567");
      farmacia2.setTelefono(25534573);
      farmacia2.setUbicacion("ITCR,Sede San Carlos");
      //Creación de la lista
      listaFarmacias lista1 = new listaFarmacias();
      lista1.append(farmacia1);
      lista1.append(farmacia2);
      System.out.println("Lista de farmacias: "+ lista1.toString());
      System.out.println("actual:"+lista1);
      lista1.remove();
      System.out.println("Nueva: "+ lista1.toString());
    }
    
}
