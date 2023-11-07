import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /* 1° forma de atribuição

        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5; */

        /* 2° forma de atribuição */
        int[] numeros = {1, 2, 3, 4, 5};

        /* 1° forma de exibição */
        for (int i=0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        /* 2° forma de exibição através de função do java */
        System.out.println(Arrays.toString(numeros));

        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i=0; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }
            media += numeros[i];
        }

        System.out.println("maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media/numeros.length);


    }
}