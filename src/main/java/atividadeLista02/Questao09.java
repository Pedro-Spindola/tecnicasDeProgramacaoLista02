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
public class Questao09 {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l1, l2, l3;

        System.out.println("Informe os lados do triângulo a, b, c: ");
        l1 = scanner.nextInt();
        l2 = scanner.nextInt();
        l3 = scanner.nextInt();
        
        if(l1 == l2 && l1 == l3){
            System.out.println("Triângulo se classifica como: Equilátero");
        } else if(l1 == l2 || l1 == l3 || l2 == l3){
            System.out.println("Triângulo se classifica como: Isósceles");
        } else {
            System.out.println("Triângulo se classifica como: Escaleno");
        }
    }
}
