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
 * @brief Class Veiculos
 */
// Inclusão do pacote ex01 ao qual esta classe pertence.


// Declaração da classe Veiculo como abstrata. Isso significa que não é possível instanciar objetos diretos dessa classe, 
// mas ela pode servir de base para outras classes.

public abstract class Veiculo {

    // Declaração de variáveis de instância privadas para a classe Veiculo. Isso encapsula os dados e protege a integridade dos mesmos.
    private String placa; // Variável para armazenar a placa do veículo.
    private int ano;      // Variável para armazenar o ano do veículo.

    // Construtor padrão sem argumentos. É útil para criar instâncias de Veiculo sem inicializar os campos placa e ano imediatamente.
    public Veiculo() {
    }

    // Construtor parametrizado que permite a inicialização dos campos placa e ano no momento da criação do objeto Veiculo.
    public Veiculo(String placa, int ano) {
        this.placa = placa; // Atribui o valor do argumento 'placa' à variável de instância 'placa'.
        this.ano = ano;     // Atribui o valor do argumento 'ano' à variável de instância 'ano'.
    }

    // Método getter para a placa. Permite que outras classes obtenham o valor da placa de um objeto Veiculo.
    public String getPlaca() {
        return placa;
    }

    // Método setter para a placa. Permite que outras classes definam o valor da placa de um objeto Veiculo.
    public void setPlaca(String placa) {
        this.placa = placa; // Atribui o valor do argumento 'placa' à variável de instância 'placa'.
    }

    // Método getter para o ano. Permite que outras classes obtenham o valor do ano de um objeto Veiculo.
    public int getAno() {
        return ano;
    }

    // Método setter para o ano. Permite que outras classes definam o valor do ano de um objeto Veiculo.
    public void setAno(int ano) {
        this.ano = ano; // Atribui o valor do argumento 'ano' à variável de instância 'ano'.
        
    }

    void exibirDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
