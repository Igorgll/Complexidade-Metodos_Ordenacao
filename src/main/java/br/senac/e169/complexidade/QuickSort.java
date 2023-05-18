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

public class QuickSort {
    public static int quickSort(int[] vetor) {
        AtomicInteger trocas = new AtomicInteger(0);
        quickSortRecursivo(vetor, 0, vetor.length - 1, trocas);
        return trocas.get();
    }

    private static void quickSortRecursivo(int[] vetor, int inicio, int fim, AtomicInteger trocas) {
        if (inicio < fim) {
            int indiceParticao = particionar(vetor, inicio, fim, trocas);
            quickSortRecursivo(vetor, inicio, indiceParticao - 1, trocas);
            quickSortRecursivo(vetor, indiceParticao + 1, fim, trocas);
        }
    }

    private static int particionar(int[] vetor, int inicio, int fim, AtomicInteger trocas) {
        int pivo = vetor[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivo) {
                i++;
                trocar(vetor, i, j, trocas);
            }
        }

        trocar(vetor, i + 1, fim, trocas);
        return i + 1;
    }

    private static void trocar(int[] vetor, int i, int j, AtomicInteger trocas) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
        trocas.incrementAndGet();
    }
}

