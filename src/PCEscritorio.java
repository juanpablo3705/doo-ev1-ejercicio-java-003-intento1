public class PCEscritorio extends Computador {

    // atributos
    private String tipoGabinete;
    private boolean incluyeMonitor;

    // constructor sin parametros
    public PCEscritorio() {
    }

    // constructor con parametros
    public PCEscritorio(String marca, String modelo, int precioBase, String tipoGabinete, boolean incluyeMonitor) {
        super(marca, modelo, precioBase);
        this.setTipoGabinete(tipoGabinete);
        this.setIncluyeMonitor(incluyeMonitor);
    }

    // getters y setters
    public String getTipoGabinete() {
        return tipoGabinete;
    }

    public void setTipoGabinete(String tipoGabinete) {
        this.tipoGabinete = tipoGabinete;
    }

    public boolean isIncluyeMonitor() {
        return incluyeMonitor;
    }

    public void setIncluyeMonitor(boolean incluyeMonitor) {
        this.incluyeMonitor = incluyeMonitor;
    }

    // metodo funcional
    @Override
    public double calcularPrecio() {
        double precioBase = getPrecioBase();
        if (incluyeMonitor) {
            precioBase = precioBase + 100000;
        }
        return precioBase;
    }

    // metodo obtener detalle
    @Override
    public String obtenerDetalle() {
        return modelo + ": $" + precioBase;
    }
}