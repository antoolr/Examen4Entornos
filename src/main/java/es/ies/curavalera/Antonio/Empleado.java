package es.ies.curavalera.Antonio;

public class Empleado {
    private String dni;
    private String nombre;
    private String direccion;
    private String cargo;
    private int numHijos;


    public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }

    void infoEmpleado() {
        System.out.println("DNI: "+ getDni());
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Cargo: "+ getCargo());
        System.out.println("Número de hijos: "+ getNumHijos());;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public double calcula_sueldo(double base){
        double total=base;

        if(cargo.equals("ENCARGADO"))
            total+=300;
        else if(cargo.equals("DIRECTOR"))
            total+=1000;
        if(numHijos>=3)
            total+=numHijos*50;
        return total;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cargo='" + cargo + '\'' +
                ", numHijos=" + numHijos +
                '}';
    }
}
