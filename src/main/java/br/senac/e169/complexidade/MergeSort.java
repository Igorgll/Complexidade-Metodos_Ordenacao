/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.e169.complexidade;

/**
 *
 * @author igor
 */

import java.util.concurrent.atomic.AtomicInteger;

public class MergeSort {
    public static int mergeSort(int[] vetor) {
        AtomicInteger trocas = new AtomicInteger(0);
        int[] auxiliar = new int[vetor.length];
        mergeSortRecursivo(vetor, auxiliar, 0, vetor.length - 1, trocas);
        return trocas.get();
    }

    private static void mergeSortRecursivo(int[] vetor, int[] auxiliar, int inicio, int fim, AtomicInteger trocas) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSortRecursivo(vetor, auxiliar, inicio, meio, trocas);
            mergeSortRecursivo(vetor, auxiliar, meio + 1, fim, trocas);
            merge(vetor, auxiliar, inicio, meio, fim, trocas);
        }
    }

    private static void merge(int[] vetor, int[] auxiliar, int inicio, int meio, int fim, AtomicInteger trocas) {
        for (int i = inicio; i <= fim; i++) {
            auxiliar[i] = vetor[i];
        }

        int i = inicio;
        int j = meio + 1;
        int k = inicio;

        while (i <= meio && j <= fim) {
            if (auxiliar[i] <= auxiliar[j]) {
                vetor[k] = auxiliar[i];
                i++;
            } else {
                vetor[k] = auxiliar[j];
                j++;
            }
            trocas.incrementAndGet();
            k++;
        }

        while (i <= meio) {
            vetor[k] = auxiliar[i];
            i++;
            k++;
        }
    }
}

