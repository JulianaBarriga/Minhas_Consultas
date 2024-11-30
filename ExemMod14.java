import dao.ClienteMapDAO;
import dao.IClienteDAO;
import domain.Cliente;

import javax.swing.*;

public class ExemMod14 {
    private static IClienteDAO iClienteDAO;
    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        /* JOptionPane é uma classe que possibilita a criação de uma caixa
         de dialogo padrão que ou solicita um valor para o usuário ou
         retorna uma informação. */
        /* showInputDialog – Exibe uma caixa solicitando a entrada de dados
        pelo usuário em um campo de texto, e botões OK e Cancel. */

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair.",
                "Cadastro",JOptionPane.INFORMATION_MESSAGE);
        while (!isOpcaoValida(opcao)){
            if (opcao.equals("")){
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção Inválida! Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair.",
                    "Green dinner",JOptionPane.INFORMATION_MESSAGE);
        }
        while (isOpcaoValida(opcao)){
            if(isOpcaoSair(opcao)){
                sair();
            } else if(isOpcaoCadastro(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vírgula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado.",
                        "Cadastro",JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if(isOpcaoConsultar(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF:",
                        "Consultar",JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if(isOpcaoExcluir(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF:",
                        "Excluir",JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else if(isOpcaoAlterar(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF:",
                        "Alterar",JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
            }


            opcao = JOptionPane.showInputDialog(null,
                    "Opção Inválida! Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair.",
                    "Green dinner",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void alterar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        iClienteDAO.alterar(cliente);
        String dadoss = JOptionPane.showInputDialog(null,
                "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                "Atualização", JOptionPane.INFORMATION_MESSAGE);
        atualizar(dadoss);
    }

    private static void atualizar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        iClienteDAO.alterar(cliente);
    }

    private static boolean isOpcaoAlterar(String opcao) {
        if (opcao.equals("4")){
            return true;
        } return false;
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Exclusão realizada!", "Cadastro Excluído", JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isOpcaoExcluir(String opcao) {
        if (opcao.equals("3")){
            return true;
        } return false;
    }

    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "Consulta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.", "Consulta ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isOpcaoConsultar(String opcao) {
        if (opcao.equals("2")){
            return true;
        } return false;
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(", ");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean iscadastrado = iClienteDAO.cadastrar(cliente);
        if(iscadastrado){
            JOptionPane.showMessageDialog(null,
                    "Cliente cadastrado com sucesso!",
                    "Cadastro realizado",JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null,
                    "Cliente já se encontra cadastrado!",
                    "Cadastro encontrado",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isOpcaoCadastro(String opcao){
        if (opcao.equals("1")){
            return true;
        } return false;
    }
    private static boolean isOpcaoSair(String opcao) {
        if(opcao.equals("5")){
            return true;
        } return false;
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null,
                "Até logo",
                "SAIR",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao){
        if (opcao.equals("1") || opcao.equals("2") || opcao.equals("3") || opcao.equals("4") || opcao.equals("5")){
            return true;
        } return false;
    }
}