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
 * @brief Class Main
 */

// Importações necessárias para utilizar a classe ArrayList e a classe Scanner.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Declaração da classe Main que contém o método principal do programa.
public class Main {
    // Declaração de uma lista para armazenar objetos do tipo Veiculo. A lista é capaz de armazenar diferentes tipos de veículos, como Moto, Ônibus e Caminhão.
    private static List<Veiculo> veiculos = new ArrayList<>();
    // Declaração de um objeto Scanner para capturar a entrada do usuário através do console.
    private static Scanner scanner = new Scanner(System.in);

    // Método principal que executa o programa.
    public static void main(String[] args) {
        int opcao; // Variável para armazenar a opção escolhida pelo usuário no menu.

        // Loop principal do programa. Executa repetidamente até que o usuário escolha sair (opção 0).
        do {
            // Apresentação do menu de opções para o usuário.
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Editar veículo");
            System.out.println("3. Excluir veículo");
            System.out.println("4. Listar veículos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt(); // Captura a opção escolhida pelo usuário.
            scanner.nextLine(); // Limpa o buffer do teclado para evitar problemas na leitura de entradas subsequentes.

            // Estrutura switch para tratar a opção escolhida pelo usuário.
            switch (opcao) {
                case 1:
                    cadastrarVeiculo(); // Chama o método para cadastrar um novo veículo.
                    break;
                case 2:
                    editarVeiculo(); // Chama o método para editar um veículo existente.
                    break;
                case 3:
                    excluirVeiculo(); // Chama o método para excluir um veículo existente.
                    break;
                case 4:
                    listarVeiculos(); // Chama o método para listar todos os veículos cadastrados.
                    break;
                case 0:
                    System.out.println("Saindo..."); // Mensagem de saída do programa.
                    break;
                default:
                    System.out.println("Opção inválida!"); // Mensagem para opção inválida.
            }
        } while (opcao != 0); // Condição para continuar no loop. O programa termina quando o usuário escolhe a opção 0.
    }

    // Método para cadastrar um novo veículo. O usuário deve fornecer informações como tipo do veículo, placa, ano e características específicas (como cilindradas, assentos ou eixos).
    private static void cadastrarVeiculo() {
        // Apresenta as opções de tipos de veículos para o usuário.
        System.out.println("\nTipo de veículo:");
        System.out.println("1. Moto");
        System.out.println("2. Ônibus");
        System.out.println("3. Caminhão");
        System.out.print("Escolha uma opção: ");
        int tipo = scanner.nextInt(); // Captura o tipo de veículo escolhido.
        scanner.nextLine(); // Limpa o buffer do teclado.

        // Solicita a placa e o ano do veículo, que são informações comuns a todos os tipos de veículos.
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        Veiculo veiculo = null; // Declara uma variável para referenciar o novo veículo.

        // Estrutura switch para determinar o tipo de veículo e solicitar informações adicionais específicas de cada tipo.
        switch (tipo) {
            case 1: // Caso Moto
                System.out.print("Cilindradas: ");
                int cilindradas = scanner.nextInt(); // Captura as cilindradas da moto.
                veiculo = new Moto(placa, ano, cilindradas); // Cria uma nova instância de Moto.
                break;
            case 2: // Caso Ônibus
                System.out.print("Assentos: ");
                int assentos = scanner.nextInt(); // Captura o número de assentos do ônibus.
                veiculo = new Onibus(placa, ano, assentos); // Cria uma nova instância de Ônibus.
                break;
            case 3: // Caso Caminhão
                System.out.print("Eixos: ");
                int eixos = scanner.nextInt(); // Captura o número de eixos do caminhão.
                veiculo = new Caminhao(placa, ano, eixos); // Cria uma nova instância de Caminhão.
                break;
            default:
                System.out.println("Tipo de veículo inválido!"); // Mensagem para tipo de veículo inválido.
                return; // Retorna do método sem cadastrar um veículo.
        }

        veiculos.add(veiculo); // Adiciona o novo veículo à lista de veículos.
        System.out.println("Veículo cadastrado com sucesso!"); // Mensagem de confirmação de cadastro.
    }

    // Método para editar um veículo existente. O usuário deve fornecer o índice do veículo na lista e, em seguida, inserir as novas informações para o veículo.
    private static void editarVeiculo() {
        System.out.print("Informe o índice do veículo a ser editado: ");
        int index = scanner.nextInt(); // Captura o índice do veículo a ser editado.
        if (index >= 0 && index < veiculos.size()) { // Verifica se o índice é válido.
            veiculos.remove(index); // Remove o veículo antigo pelo índice.
            cadastrarVeiculo(); // Invoca o método de cadastro para inserir um novo veículo, que será o veículo "editado".
        } else {
            System.out.println("Índice inválido!"); // Mensagem para índice inválido.
        }
    }

    // Método para excluir um veículo existente. O usuário deve fornecer o índice do veículo na lista.
    private static void excluirVeiculo() {
        System.out.print("Informe o índice do veículo a ser excluído: ");
        int index = scanner.nextInt(); // Captura o índice do veículo a ser excluído.
        if (index >= 0 && index < veiculos.size()) { // Verifica se o índice é válido.
            veiculos.remove(index); // Remove o veículo pelo índice.
            System.out.println("Veículo excluído com sucesso!"); // Mensagem de confirmação de exclusão.
        } else {
            System.out.println("Índice inválido!"); // Mensagem para índice inválido.
        }
    }

    // Método para listar todos os veículos cadastrados. Exibe as informações de cada veículo na lista.
    private static void listarVeiculos() {
        if (veiculos.isEmpty()) { // Verifica se a lista de veículos está vazia.
            System.out.println("Nenhum veículo cadastrado."); // Mensagem caso não haja veículos cadastrados.
        } else {
            System.out.println("\nLista de Veículos:"); // Cabeçalho da lista de veículos.
            for (int i = 0; i < veiculos.size(); i++) { // Itera sobre a lista de veículos.
                Veiculo v = veiculos.get(i); // Obtém o veículo na posição atual do loop.
                // Assumindo que todas as classes de veículos implementam um método `exibirDados()`.
                System.out.println(i + ":"); // Exibe o índice do veículo.
                v.exibirDados(); // Chama o método `exibirDados()` do veículo para exibir suas informações.
            }
        }
    }
}
