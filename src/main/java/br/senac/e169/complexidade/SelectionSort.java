/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.e169.complexidade;

/**
 *
 * @author igor
 */
public class SelectionSort {
    public static int selectionSort(int[] vetor) {
        int trocas = 0;
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            if (indiceMinimo != i) {
                int temp = vetor[i];
                vetor[i] = vetor[indiceMinimo];
                vetor[indiceMinimo] = temp;
                trocas++;
            }
        }

        return trocas;
    }
}
