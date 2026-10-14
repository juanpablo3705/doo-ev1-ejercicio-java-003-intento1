public class Main {
    public static void main(String[] args){

        // objetos
        Notebook equipo1 = new Notebook("Lenovo","IdeaPad 3",800000,15.6,true);
        Notebook equipo2 = new Notebook("HP","Pavilion",900000,14.0,false);
        PCEscritorio equipo3 = new PCEscritorio("Asus","Gamer X",1000000,"Gamer",true);
        PCEscritorio equipo4 = new PCEscritorio("Dell","Office",600000,"Normal",false);

        // implementar interfaz
        equipo1.activarGarantia();

        // registrar objetos
        Tienda gestor = new Tienda();
        gestor.agregar(equipo1);
        gestor.agregar(equipo2);
        gestor.agregar(equipo3);
        gestor.agregar(equipo4);

        // listar precios finales
        System.out.println();
        System.out.println("PRECIOS FINALES");
        System.out.println();
        for (Computador nombreObjeto : gestor.getComputadores()) {
            System.out.println(nombreObjeto.getMarca() + " " + nombreObjeto.getModelo() + ": $" + Math.round(nombreObjeto.calcularPrecio()));
        }

        // buscar
        System.out.println();
        System.out.println("BUSQUEDA POR MARCA: Lenovo");
        System.out.println();
        for (Computador nombreObjeto : gestor.buscador("Lenovo")) {
            System.out.println(nombreObjeto.obtenerDetalle());
        }

        // listar lista
        System.out.println();
        System.out.println("TODOS LOS COMPUTADORES");
        System.out.println();
        for (Computador nombreObjeto : gestor.getComputadores()) {
            System.out.println(nombreObjeto);
        }

    }
}
