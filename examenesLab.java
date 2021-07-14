package Quiz;

/**
 * Nombre del programa: Quiz #1 Clasificacion de examenes de laboratorio
 * Descripcion: Determinar la clasificación de los resultados de un examen de laboratorio de una persona.
 * Autor: Kimberly C.
 * Fecha de creacion: 11-06-2020
 * Modificado por: Kimberly Cascante Mora
 * fecha de modificacion: 11-06-2020
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class quiz1 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{
        
        double resultadoObtenido;
        String clasificacion;

        escribir.println("Digite el resultado obtenido");
        resultadoObtenido = Double.parseDouble(leer.readLine());

        if (resultadoObtenido>220){
            clasificacion = "Riesgo muy alto";

        } else if (resultadoObtenido<220 & resultadoObtenido>180){
            clasificacion = "Riesgo alto";

        } else if (resultadoObtenido<180 & resultadoObtenido>120){
            clasificacion = "Moderado";

        } else {
            clasificacion = "Normal";
        
        }

        escribir.println("La clasificación del resultado obtenido es: " + clasificacion);

    }
}