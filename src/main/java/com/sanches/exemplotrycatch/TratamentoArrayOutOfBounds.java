/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanches.exemplotrycatch;

import java.util.Scanner;

/**
 *
 * @author devsys-b
 */
public class TratamentoArrayOutOfBounds {

    public static void main(String[] args) {
        int[] matrizA = new int[3];
        Scanner teclado = new Scanner(System.in);

        try {
            for (int i = 0; i < 6; i++) {
                System.out.println("Informe os elementos da matriz: ");
                matrizA[i] = teclado.nextInt();
                //System.out.println("Matriz:"+matrizA[i]);
            }

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Erro: " + exception.getMessage());
            System.out.println("Erro no tamanho da matriz");
        }
    }

}
