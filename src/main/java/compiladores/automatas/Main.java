/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores.automatas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joseestrada
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        String entrada = null;
        System.out.print("Introduzca el numero:");
        try {
            BufferedReader leerEntrada = new BufferedReader(new InputStreamReader(System.in));
            // aquí abajo guarda el valor leído
            entrada = leerEntrada.readLine();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        int state = 0;
        int cp = -1;
        int cont = entrada.length();
        boolean flag = false;

        for (int i = 0; i < cont; i++) {
            cp++;
            switch (state) {
                case 0:
                    switch (entrada.charAt(cp)) {
                        case '0':
                            state = 6;
                            flag = true;
                            break;
                        case '1':
                            state = 1;
                            break;
                        case '2':
                            state = 2;
                            break;
                        case '3':
                            state = 3;
                            break;
                        case '4':
                            state = 4;
                            break;
                        case '5':
                            state = 5;
                            break;
                        case '6':
                            state = 6;
                            flag = true;
                            break;
                        case '7':
                            state = 1;
                            break;
                        case '8':
                            state = 2;
                            break;
                        case '9':
                            state = 3;
                            break;
                        default:
                            System.out.print("No es una entrada valida");
                            return;
                    }
                    break;
                case 1:
                    if (entrada.charAt(cp) == '0' || entrada.charAt(cp) == '6') {
                        state = 4;
                        flag = false;
                    } else if (entrada.charAt(cp) == '1' || entrada.charAt(cp) == '7') {
                        state = 5;
                        flag = false;
                    } else if (entrada.charAt(cp) == '2' || entrada.charAt(cp) == '8') {
                        state = 6;
                        flag = true;
                    } else if (entrada.charAt(cp) == '3' || entrada.charAt(cp) == '9') {
                        state = 1;
                        flag = false;
                    } else if (entrada.charAt(cp) == '4') {
                        state = 2;
                        flag = false;
                    } else if (entrada.charAt(cp) == '5') {
                        state = 3;
                        flag = false;
                    }
                    break;
                case 2:
                    if (entrada.charAt(cp) == '0' || entrada.charAt(cp) == '6') {
                        state = 2;
                        flag = false;
                    } else if (entrada.charAt(cp) == '1' || entrada.charAt(cp) == '7') {
                        state = 3;
                        flag = false;
                    } else if (entrada.charAt(cp) == '2' || entrada.charAt(cp) == '8') {
                        state = 4;
                        flag = false;
                    } else if (entrada.charAt(cp) == '3' || entrada.charAt(cp) == '9') {
                        state = 5;
                        flag = false;
                    } else if (entrada.charAt(cp) == '4') {
                        state = 6;
                        flag = true;
                    } else if (entrada.charAt(cp) == '5') {
                        state = 1;
                        flag = false;
                    }
                    break;
                case 3:
                    if (entrada.charAt(cp) == '0' || entrada.charAt(cp) == '6') {
                        state = 6;
                        flag = true;
                    } else if (entrada.charAt(cp) == '1' || entrada.charAt(cp) == '7') {
                        state = 1;
                        flag = false;
                    } else if (entrada.charAt(cp) == '2' || entrada.charAt(cp) == '8') {
                        state = 2;
                        flag = false;
                    } else if (entrada.charAt(cp) == '3' || entrada.charAt(cp) == '9') {
                        state = 3;
                        flag = false;
                    } else if (entrada.charAt(cp) == '4') {
                        state = 4;
                        flag = false;
                    } else if (entrada.charAt(cp) == '5') {
                        state = 5;
                        flag = false;
                    }
                    break;
                case 4:
                    if (entrada.charAt(cp) == '0' || entrada.charAt(cp) == '6') {
                        state = 4;
                        flag = false;
                    } else if (entrada.charAt(cp) == '1' || entrada.charAt(cp) == '7') {
                        state = 5;
                        flag = false;
                    } else if (entrada.charAt(cp) == '2' || entrada.charAt(cp) == '8') {
                        state = 6;
                        flag = true;
                    } else if (entrada.charAt(cp) == '3' || entrada.charAt(cp) == '9') {
                        state = 1;
                        flag = false;
                    } else if (entrada.charAt(cp) == '4') {
                        state = 2;
                        flag = false;
                    } else if (entrada.charAt(cp) == '5') {
                        state = 3;
                        flag = false;
                    }
                    break;
                case 5:
                    if (entrada.charAt(cp) == '0' || entrada.charAt(cp) == '6') {
                        state = 2;
                        flag = false;
                    } else if (entrada.charAt(cp) == '1' || entrada.charAt(cp) == '7') {
                        state = 3;
                        flag = false;
                    } else if (entrada.charAt(cp) == '2' || entrada.charAt(cp) == '8') {
                        state = 4;
                        flag = false;
                    } else if (entrada.charAt(cp) == '3' || entrada.charAt(cp) == '9') {
                        state = 5;
                        flag = false;
                    } else if (entrada.charAt(cp) == '4') {
                        state = 6;
                        flag = true;
                    } else if (entrada.charAt(cp) == '5') {
                        state = 1;
                        flag = false;
                    }
                    break;
                case 6:
                    if (entrada.charAt(cp) == '0' || entrada.charAt(cp) == '6') {
                        state = 6;
                        flag = true;
                    } else if (entrada.charAt(cp) == '1' || entrada.charAt(cp) == '7') {
                        state = 1;
                        flag = false;
                    } else if (entrada.charAt(cp) == '2' || entrada.charAt(cp) == '8') {
                        state = 2;
                        flag = false;
                    } else if (entrada.charAt(cp) == '3' || entrada.charAt(cp) == '9') {
                        state = 3;
                        flag = false;
                    } else if (entrada.charAt(cp) == '4') {
                        state = 4;
                        flag = false;
                    } else if (entrada.charAt(cp) == '5') {
                        state = 5;
                        flag = false;
                    }
                    break;
                default:
                    System.out.print("No es una entrada valida");
                    return;
            }
        }
        if (flag) {
            System.out.print("El número " + entrada + " es divisible por 6");
        } else {
            System.out.print("El número " + entrada + " no es divisible por 6");
        }

    }
}
