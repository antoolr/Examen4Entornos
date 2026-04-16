package es.ies.curavalera.Antonio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado variable = new Empleado("44885522R","Juan Gómez");
        variable.setDireccion("C/de mi casa,5");
        variable.setNumHijos(12);

        variable.infoEmpleado();

        System.out.println("Hola");
    }


}
