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
public class Questao12 {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero desejada calcular o fatorial dele: ");
        int n = scanner.nextInt();
        int resultado = 1;
        if(n == 0){
            System.out.println("Fatorial de " + n + " = " + resultado);
        } else {
            for(int i = 1; i <= n; i++){
                resultado = resultado * i;
            }
            System.out.println("Fatorial de " + n + " = " + resultado);
        }
    }
}
