package prueba2_ventas;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Prueba2_Ventas {

    private String codigo;
    private String nombre;
    private String apellido;
    private int VtaJulio;
    private int VtaAgosto;
    private int VtaSeptiembre;
    private int VtaMayor;
    private String estado;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getVtaJulio() {
        return VtaJulio;
    }

    public void setVtaJulio(int VtaJulio) {
        this.VtaJulio = VtaJulio;
    }

    public int getVtaAgosto() {
        return VtaAgosto;
    }

    public void setVtaAgosto(int VtaAgosto) {
        this.VtaAgosto = VtaAgosto;
    }

    public int getVtaSeptiembre() {
        return VtaSeptiembre;
    }

    public void setVtaSeptiembre(int VtaSeptiembre) {
        this.VtaSeptiembre = VtaSeptiembre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getVtaMayor() {
        return VtaMayor;
    }

    public void setVtaMayor(int VtaMayor) {
        this.VtaMayor = VtaMayor;
    }

    public void guardar() {
        try {
            String ruta = "Trabajador.txt";
            BufferedWriter escritura = new BufferedWriter(new FileWriter(ruta, true));
            String data = codigo + ";" + nombre + ";" + apellido + ";" + VtaJulio + ";" + VtaAgosto + ";" + VtaSeptiembre + ";" + estado;
            escritura.write(data);
            escritura.newLine();
            escritura.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
