package cucotucsi;

import java.util.ArrayList;
import java.util.List;

public class CFilPrincipal {
    public static void main(String[] args) {
        int numProcesosHijos = 3; 

        if (numProcesosHijos <= 0 || numProcesosHijos > 10) {
            System.out.println("Número de procesos hijos no válido.");
            return;
        }

        List<CFil> procesosHijos = new ArrayList<>();

        for (int i = 0; i < numProcesosHijos; i++) {
            CFil procesoHijo = new CFil("Hijo" + i, (i + 1) * 1000); // Temporización
            procesoHijo.start();
            procesosHijos.add(procesoHijo);
        }

        // Espera a que todos los procesos hijos terminen
        for (CFil procesoHijo : procesosHijos) {
            try {
                procesoHijo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Proceso Padre finalizado.");
    }
}
