import java.util.ArrayList;

public class Tienda {

    // crear lista llamada "computadores"
    private ArrayList<Computador> computadores;

    // constructor
    public Tienda() {
        computadores = new ArrayList<>();
    }

    // agregar objeto
    public void agregar(Computador nombreObjeto) {
        computadores.add(nombreObjeto);
        System.out.println(nombreObjeto.getClass().getSimpleName() + " " + nombreObjeto.getModelo() + " registrado correctamente.");
    }

    // getter
    public ArrayList<Computador> getComputadores() {
        return computadores;
    }

    // buscador
    public ArrayList<Computador> buscador(String marca) {
        ArrayList<Computador> encontrados = new ArrayList<>();
        for (Computador nombreObjeto : computadores) {
            if (nombreObjeto.getMarca().equalsIgnoreCase(marca)) {
                encontrados.add(nombreObjeto);
            }
        }
        return encontrados;
    }
}