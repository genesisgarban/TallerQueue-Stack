public class Asistente {
    private String nombre;
    private String email;
    private String cedula;
    private int cantidadBoletos;

    public Asistente(String nombre, String email, String cedula, int cantidadBoletos) {
        this.nombre = nombre;
        this.email = email;
        this.cedula = cedula;
        this.cantidadBoletos = cantidadBoletos;
    }

    @Override
    public String toString() {
        return "Datos del asistente:\n" +
                "Nombre: " + nombre + "\n" +
                "Email: " + email + "\n" +
                "Cédula: " + cedula + "\n" +
                "Cantidad de boletos comprados: " + cantidadBoletos;
    }
}
