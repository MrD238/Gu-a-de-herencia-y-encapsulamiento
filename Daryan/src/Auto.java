public class Auto extends VehiculoPasajeros {
    private String tipoCombustible;

    // constructor
    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible) {
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }

    // Getter y Setter para tipoCombustible
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }


    // Sobreescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de Combustible: " + tipoCombustible);

    }
    //sobre escirbirmos el metodo.
    @Override
    public void realizarMantenimiento(){
        super.realizarMantenimiento();
        System.out.println("El mantenimiento aplicado fue lo siguiente:");
        System.out.println("Reparaciones de asientos, pintura nueva.");
        
    }
    
    // Metodo calcular costo del mantenimiento
    public int calcularCostoMantenimiento(int costoxkm, int kmRecorridos) {
        int costoTotal = 0;
        costoTotal = costoxkm * kmRecorridos;
        System.out.println("Costo de Mantenimiento: C$ " + costoTotal);
        return costoTotal;
    }
    
}
