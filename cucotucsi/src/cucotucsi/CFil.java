package cucotucsi;

public class CFil extends Thread {
    private String nombre;
    private int temporizacion; // Agrega un atributo de temporización

    public CFil(String nombre, int temporizacion) {
        this.nombre = nombre;
        this.temporizacion = temporizacion;
    }

    // Getter para consultar el nombre del proceso
    public String getNombre() {
        return nombre;
    }

    // Setter para modificar la temporización
    public void setTemporizacion(int temporizacion) {
        this.temporizacion = temporizacion;
    }

    @Override
    public void run() {
        try {
            // Simula la ejecución del proceso hijo
            Thread.sleep(temporizacion);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Proceso " + nombre + " finalizado.");
    }
}
