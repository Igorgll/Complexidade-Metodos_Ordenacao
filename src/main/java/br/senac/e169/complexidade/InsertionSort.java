/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.e169.complexidade;

/**
 *
 * @author igor
 */
public class InsertionSort {
        public static int insertionSort(int[] vetor) {
        int n = vetor.length;
        int trocas = 0;
        
        for (int i = 1; i < n; ++i) {
            int chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
                trocas++;
            }
            
            vetor[j + 1] = chave;
        }
        
        return trocas;
        
        }
}
