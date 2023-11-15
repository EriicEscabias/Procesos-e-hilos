package cucotucsi;

public class CFil extends Thread {
    private String nombre;
    private int temporizacion; // temporizador

    public CFil(String nombre, int temporizacion) {
        this.nombre = nombre;
        this.temporizacion = temporizacion;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setTemporizacion(int temporizacion) {
        this.temporizacion = temporizacion;
    }

    @Override
    public void run() {
        try {
            // ejecución del proceso hijo
            Thread.sleep(temporizacion);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Proceso " + nombre + " finalizado.");
    }
}
