public class Notebook extends Computador implements Garantizable {

    // atributos
    private double pantalla;
    private boolean garantia;

    // constructor sin parametros
    public Notebook() {
    }

    // constructor con parametros
    public Notebook(String marca, String modelo, int precioBase, double pantalla, boolean garantia) {
        super(marca, modelo, precioBase);
        this.setPantalla(pantalla);
        this.setGarantia(false);
    }

    // getters y setters
    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    // metodo funcional
    @Override
    public double calcularPrecio() {
        double precioBase = getPrecioBase();
        if (garantia) {
            precioBase = precioBase * 1.1;
        }
        return precioBase;
    }

    // metodo obtener detalle
    @Override
    public String obtenerDetalle() {
        return modelo + ": Precio Base: $" + precioBase;
    }

    // metodos implementados de interfaz
    @Override
    public boolean tieneGarantia() {
        return garantia;
    }

    @Override
    public void activarGarantia() {
        garantia = true;
    }
}