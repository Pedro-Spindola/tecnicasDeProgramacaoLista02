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

package atividadadeLista01;
import java.util.Scanner;

/**
 *
 * @author Pedro Spindola
 * @date 02/03/2024
 * @brief Class Exercicios01
 */
public class Questao06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1, x2, y1, y2;

        System.out.println("Informe a coordenadas x1, y1, x2, y2)");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        int dist = (((x1 - x2) ^ 2) + ((y1 - y2) ^ 2));

        System.out.println("Ponto 1: (" + x1 + "," + y1 + ")");
        System.out.println("Ponto 2: (" + x2 + "," + y2 + ")");
        System.out.println("Distância: " + dist);

    }
}
