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
public class Questao05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a velocidade em (km/h)");
        int velocidade = scanner.nextInt();
        System.out.println("Informe o tempo gasto na viagem. (horas)");
        int tempoV = scanner.nextInt();

        int dist = (velocidade * tempoV);

        System.out.println("Velocidade: " + velocidade + "km/h");
        System.out.println("Tempo da viagem: " + tempoV + "h");
        System.out.println("Distância percorrida: " + dist + "km");

    }
}
