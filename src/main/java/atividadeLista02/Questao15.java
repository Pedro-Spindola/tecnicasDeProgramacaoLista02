/*
 * Copyright (C) 2024 Pedro Spindola
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package atividadeLista02;
import java.util.Scanner;

/**
 *
 * @author Pedro Spindola
 * @date 02/03/2024
 * @brief Class Exercicios01
 */
public class Questao15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz quadrada(X):");
        int tamanho = scanner.nextInt();

        int[][] matriz = new int[tamanho][tamanho];

        System.out.println("Digite os elementos da matriz: (Aperte enter para cada elemento.)");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Diagonal Principal:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(matriz[i][i]);
        }
    }
}
