public class Camion extends VehiculoCarga {
    private int numEjes;

    // constructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes) {
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;
    }

    // Getter y Setter para tipoCombustible
    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    // Sobreescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de Ejes: " + numEjes);
    }


    //sobre escirbirmos el realizar mantenimiento.
    @Override
    public void realizarMantenimiento(){
        super.realizarMantenimiento();
        System.out.println("El mantenimiento aplicado fue lo siguiente:");
        System.out.println("Repaciones en los amortizadores, cambio de aceite, mejora en el motor y su capacidad de potencia");
    }
}
