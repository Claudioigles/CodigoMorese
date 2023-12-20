package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String texto, letraTablaAbc, caracterEnCodigoMorse, codigoTransformado="";
        String letraDeTexto;

        Scanner entrada= new Scanner(System.in);


        String[] tablaAbc = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        // Tabla de código Morse
        String[] tablaCodigoMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};



        System.out.println("Ingrese un texto");
        texto=entrada.nextLine();


        for (int i=0; i< texto.length(); i++){//Recorre el largo del texto ingresado
            letraDeTexto= ""+texto.charAt(i);//Guarda cada caraceter del texto que ingrese
            System.out.println("Muestra la letra del taxto"+letraDeTexto);

            for (int j=0; j< tablaAbc.length; j++){//Recorre el largo de la tabla ABC
                letraTablaAbc=tablaAbc[j].toLowerCase();//Almacena el valor de la primera posicion de la tabla ABC
                if (letraTablaAbc.equalsIgnoreCase(letraDeTexto.toLowerCase())){//El ignorecase es para que ignore entre mayus y m inusc -Si el valor en la 1ra posicion de la tabla AbC es igual al valor almacena en la variable LetraDeTExtp
                    caracterEnCodigoMorse=tablaCodigoMorse[j];//
                    codigoTransformado += " " +caracterEnCodigoMorse;
                }

            }

        }

        System.out.println("Codigo morse "+codigoTransformado );

    }
}