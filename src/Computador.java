public abstract class Computador {

    // atributos
    protected String marca;
    protected String modelo;
    protected int precioBase;

    // constructor sin parámetros
    public Computador() {
    }

    // constructor con parametros
    public Computador(String marca, String modelo, int precioBase) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPrecioBase(precioBase);
    }

    // getters and setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Error, la marca no puede estar vacío ni ser nula.");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Error, el modelo no puede estar vacío ni ser nulo.");
        }
        this.modelo = modelo;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        if (precioBase < 0) {
            throw new IllegalArgumentException("Error, el precio base debe ser mayor que cero.");
        }
        this.precioBase = precioBase;
    }

    // tostring marca y modelo
    @Override
    public String toString() {
        return marca + " - " + modelo;
    }

    // metodo funcional
    public abstract double calcularPrecio();

    // metodo obtener detalle
    public abstract String obtenerDetalle();
}