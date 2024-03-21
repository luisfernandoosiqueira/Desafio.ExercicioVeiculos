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
 * @brief Class Onibus
 */
// Esta classe `Onibus` é uma especialização da classe `Veiculo`, indicando que um Ônibus é um tipo específico de Veículo.
// Ela herda características de `Veiculo` e adiciona suas próprias especificidades, como o número de assentos.
public class Onibus extends Veiculo {

    // Variável de instância privada para armazenar o número de assentos disponíveis no ônibus. 
    // O modificador `private` garante o encapsulamento, restringindo o acesso direto à variável de fora da classe.
    private int assentos;

    // Construtor padrão sem parâmetros. Ele cria uma instância de `Onibus` sem inicializar a placa, o ano ou o número de assentos.
    public Onibus() {
    }

    // Construtor que inicializa apenas o número de assentos do ônibus. 
    // É útil quando os outros detalhes do ônibus (como placa e ano) não são necessários ou desconhecidos no momento da criação.
    public Onibus(int assentos) {
        this.assentos = assentos; // Atribui o valor do parâmetro `assentos` à variável de instância `assentos`.
    }

    // Construtor que inicializa a placa, o ano (herdados de `Veiculo`) e o número de assentos do ônibus.
    // Isso permite a criação de um objeto `Onibus` com todas as informações relevantes fornecidas desde o início.
    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano); // Chama o construtor da superclasse `Veiculo` para inicializar a placa e o ano.
        this.assentos = assentos; // Atribui o valor do parâmetro `assentos` à variável de instância `assentos`.
    }

    // Método getter para o número de assentos. Permite outras classes acessarem o número de assentos do ônibus.
    public int getAssentos() {
        return assentos;
    }

    // Método setter para o número de assentos. Permite a modificação do número de assentos do ônibus por outras classes.
    public void setAssentos(int assentos) {
        this.assentos = assentos; // Atribui o valor do parâmetro `assentos` à variável de instância `assentos`.
    }

    // Método para exibir os detalhes do ônibus, incluindo a placa, o ano e o número de assentos.
    // Ele utiliza a saída padrão para exibir as informações.
    public void exibirDados() {
        // Utiliza a herança para acessar os métodos `getPlaca` e `getAno` da superclasse `Veiculo` e exibe todos os detalhes do ônibus.
        System.out.println("Ônibus [Placa = " + super.getPlaca() + ", Ano = " + super.getAno() + ", Número de assentos = " + assentos + "]");
    }
}
