/*
 * Copyright (C) 2024 Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
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

package ex02;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 19/03/2024
 * @brief Class Caminhao
 */
// A classe Caminhao herda de Veiculo, o que significa que Caminhao é um tipo específico de Veiculo com características adicionais.
public class Caminhao extends Veiculo {

    // Variável de instância privada para armazenar a quantidade de eixos do caminhão.
    private int eixos;

    // Construtor padrão sem argumentos. Serve para criar instâncias de Caminhao sem inicializar os campos herdados de Veiculo ou o campo eixos.
    public Caminhao() {
    }

    // Construtor que inicializa apenas a quantidade de eixos do caminhão. Não inicializa os campos herdados de Veiculo.
    public Caminhao(int eixos) {
        this.eixos = eixos; // Atribui o valor do argumento 'eixos' à variável de instância 'eixos'.
    }

    // Construtor parametrizado que inicializa tanto os campos herdados de Veiculo (placa e ano) quanto o campo específico de Caminhao (eixos).
    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano); // Chama o construtor da classe pai (Veiculo) para inicializar 'placa' e 'ano'.
        this.eixos = eixos; // Atribui o valor do argumento 'eixos' à variável de instância 'eixos'.
    }

    // Método getter para a quantidade de eixos. Permite que outras classes obtenham o valor da quantidade de eixos de um objeto Caminhao.
    public int getEixos() {
        return eixos;
    }

    // Método setter para a quantidade de eixos. Permite que outras classes definam o valor da quantidade de eixos de um objeto Caminhao.
    public void setEixos(int eixos) {
        this.eixos = eixos; // Atribui o valor do argumento 'eixos' à variável de instância 'eixos'.
    }

    // Método para exibir os dados do caminhão, incluindo a placa, o ano e a quantidade de eixos.
    // A palavra-chave 'super' é usada para acessar os métodos getPlaca e getAno da classe pai (Veiculo).
    public void exibirDados() {
        System.out.println("Caminhão [Placa = " + super.getPlaca() + ", Ano = " + super.getAno() + ", Quantidade de eixos = " + eixos + "]");
    }
}
