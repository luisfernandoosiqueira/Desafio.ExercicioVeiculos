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
 * @brief Class Moto
 */
// A classe `Moto` estende a classe `Veiculo`, significando que `Moto` é uma subclasse específica de `Veiculo`.
// Isso permite que `Moto` herde propriedades e métodos de `Veiculo` e adicione suas próprias características únicas.
public class Moto extends Veiculo {

    // Declaração de uma variável de instância privada para armazenar as cilindradas da moto.
    // O modificador `private` assegura o encapsulamento, limitando o acesso direto à variável.
    private int cilindradas;

    // Construtor que inicializa apenas as cilindradas da moto.
    // Este construtor não inicializa a placa e o ano da moto, pois esses campos são herdados da classe `Veiculo`.
    public Moto(int cilindradas) {
        this.cilindradas = cilindradas; // Atribui o valor do parâmetro `cilindradas` à variável de instância `cilindradas`.
    }

    // Construtor parametrizado que inicializa a placa, o ano (herdados de `Veiculo`) e as cilindradas da moto.
    // Este construtor permite a criação de um objeto `Moto` com todas as informações importantes definidas desde o início.
    public Moto(String placa, int ano, int cilindradas) {
        super(placa, ano); // Chama o construtor da superclasse `Veiculo` para inicializar a placa e o ano.
        this.cilindradas = cilindradas; // Atribui o valor do parâmetro `cilindradas` à variável de instância `cilindradas`.
    }

    // Método getter para as cilindradas. Permite que outras classes obtenham o valor das cilindradas da moto.
    public int getCilindradas() {
        return cilindradas;
    }

    // Método setter para as cilindradas. Permite que o valor das cilindradas da moto seja modificado por outras classes.
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas; // Atribui o valor do parâmetro `cilindradas` à variável de instância `cilindradas`.
    }

    // Método para exibir os dados da moto, incluindo placa, ano (herdados de `Veiculo`) e cilindradas.
    // Utiliza a saída padrão para mostrar as informações.
    public void exibirDados() {
        // Acessa os métodos `getPlaca` e `getAno` da superclasse `Veiculo` para obter esses valores e, em seguida, exibe todas as informações relevantes da moto.
        System.out.println("Moto [Placa = " + super.getPlaca() + ", Ano = " + super.getAno() + ", Cilindradas = " + cilindradas + "]");
    }
}
