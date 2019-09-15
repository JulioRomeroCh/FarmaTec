package farmatec;

public class FarmaTEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Inicio Main

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

        //Creación de la lista
        listaMedicamentos listam = new listaMedicamentos();
        listam.append(medicamento1);
        listam.append(medicamento2);
        System.err.println(medicamento2.getCantidad());
        System.out.println("Lista de medicamentos: " + listam.toString());

        //Creación de la lista
        listaFarmacias lista1 = new listaFarmacias();
        lista1.append(farmacia1);
        lista1.append(farmacia2);
        lista1.append(farmacia3);
        
        //Muestra la lista de farmacias actuales
        System.out.println("Lista de farmacias: " + lista1.toString());
        
  
        //Añade uno o más medicamentos a la farmacia
        lista1.goTonom("FarmaTEC Cartago");       
        Farmacia farma1 = (Farmacia)lista1.getElement();
        listaMedicamentos lc = farma1.listameds;
        lc.append(medicamento1);
        lc.append(medicamento2);
        //Salida con los medicamentos añadidos 
        System.err.println("PRUEBA 1: " + farma1.getNombre() + " " + lc.toString());
        
        
        //Añade uno o más medicamentos a la farmacia
        lista1.goTonom("FarmaTEC San José");
        Farmacia farma2 = (Farmacia)lista1.getElement();
        listaMedicamentos lsj = farma2.listameds;
        lsj.append(medicamento1);
        //Salida con los medicamentos añadidos
        System.err.println("PRUEBA 2: " + farma2.getNombre() + " " + lsj.toString());
        
        //Remueve una farmacia
        lista1.goToPos(2);
        lista1.remove();
        System.out.println("Nueva: " + lista1.toString());

        
        //Remueve un medicamento
        listam.goToPos(1);
        listam.remove();
        System.out.println("Nueva: " + listam.toString());

    }//Fin Main

}

