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

/**
 *
 * @author Pedro Spindola
 * @date 02/03/2024
 * @brief Class Exercicios01
 */
public class Questao14 {

    public static void main(String[] args) {
        
        int numbAtual, numbDivisor;
        
        System.out.println("O números primos compreendidos entre 1 e 1000 são:");
        for (int i = 2; i <= 100; i++) {
            numbAtual = i;
            numbDivisor = 0;
            for(int j = 1; j <= i; j++){
                if(numbAtual % j == 0){
                    numbDivisor++;
                }
            }
            if(numbDivisor == 2){
                System.out.println(numbAtual);
            }
        }
    }
}
