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
public class Questao13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y, r, a;

        System.out.println("Informe o valor de x.");
        x = scanner.nextInt();
        System.out.println("Informe o valor de y.");
        y = scanner.nextInt();
        r = 0;
        
        if(y == 0 || y == 1) {
            r = x;
            System.out.println("Resultado da equação x^y é = " + r);
        }   else {
            a = x;
            for (int i = 1; i < y; i++) {
                r = x * a;
                a = r;
            }
            System.out.println("Resultado da equação x^y é = " + r);
        }
    }
}
