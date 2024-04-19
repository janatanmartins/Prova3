package principal;

import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

import funcionario.Funcionario;


public class Principal {

 //	public static void main(String[] args) {
//		        Funcionario f = new Funcionario();
//		       		      
	static Funcionario f = new Funcionario();

		                public static void main(String[] args) {
		                	
		                    ArrayList<Funcionario> funcionarios = new ArrayList<>();

		                    // Loop para adicionar funcionários
		                    while (true) {
		                        Funcionario funcionario = adicionarFuncionario();
		                        if (funcionario == null) {
		                            break;
		                        }
		                        funcionarios.add(funcionario);
		                    }

		                    // Gerar relatórios
		                    gerarRelatorioPorCidade(funcionarios);
		                    gerarRelatorioPorCargo(funcionarios);
		                    gerarRelatorioPorSexo(funcionarios);
		                    gerarRelatorioPorEstado(funcionarios);
		                }

		                static Funcionario adicionarFuncionario() {
		                    f.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário:"));
		                    if (f.getNome() == null || f.getNome().isEmpty()) {
		                        return null; // Usuário cancelou ou deixou em branco
		                    }
		                    f.setCargo(JOptionPane.showInputDialog("Digite o cargo do funcionário:"));
		                    f.setHabilidades(JOptionPane.showInputDialog("Digite as habilidades do funcionário:"));
		                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionário:"));
		                    f.setSexo(JOptionPane.showInputDialog("Digite o sexo do funcionário:"));
		                    f.setEndereco(JOptionPane.showInputDialog("Digite o endereço do funcionário:"));
		                    f.setCidade(JOptionPane.showInputDialog("Digite a cidade do funcionário:"));
		                    f.setEstado(JOptionPane.showInputDialog("Digite o estado do funcionário:"));
		                    
		                    String relatorio = "Cadastro do funcionário:\n" +
			                        "Nome: " + f.getNome() + "\n" +
			                        "Cargo: " + f.getCargo() + "\n" +
			                        "Habilidades: " + f.getHabilidades() + "\n" +
			                        "Idade: " + idade + "\n" +
			                        "Sexo: " + f.getSexo() + "\n" +
			                        "Endereço: " + f.getEndereco() + "\n" +
			                        "Cidade: " + f.getCidade() + "\n" +
			                        "Estado: " + f.getEstado();

			                JOptionPane.showMessageDialog(null, relatorio);

		                    return new Funcionario(f.getNome(), f.getCargo(), f.getHabilidades(), idade, f.getSexo(), f.getEndereco(), f.getCidade(), f.getEstado());
		                }

		                static void gerarRelatorioPorCidade(ArrayList<Funcionario> funcionarios) {
		                    HashMap<String, StringBuilder> relatorios = new HashMap<>();

		                    for (Funcionario funcionario : funcionarios) {
		                        String cidade = funcionario.getCidade();
		                        StringBuilder relatorio = relatorios.getOrDefault(cidade, new StringBuilder());
		                        relatorio.append(funcionario.toString()).append(f.getNome());
		                        relatorios.put(cidade, relatorio);
		                    }

		                    exibirRelatorios("Relatório por Cidade", relatorios);
		                }

		                static void gerarRelatorioPorCargo(ArrayList<Funcionario> funcionarios) {
		                	  HashMap<String, StringBuilder> relatorios = new HashMap<>();

			                    for (Funcionario funcionario : funcionarios) {
			                        String cargo = funcionario.getCargo();
			                        StringBuilder relatorio = relatorios.getOrDefault(cargo, new StringBuilder());
			                        relatorio.append(funcionario.toString()).append("\b");
			                        relatorios.put(cargo, relatorio);
			                    }
			                    
			                    exibirRelatorios("Relatório por Cargo", relatorios);   
		                }

		                static void gerarRelatorioPorSexo(ArrayList<Funcionario> funcionarios) {
		                	  HashMap<String, StringBuilder> relatorios = new HashMap<>();

			                    for (Funcionario funcionario : funcionarios) {
			                        String sexo = funcionario.getSexo();
			                        StringBuilder relatorio = relatorios.getOrDefault(sexo, new StringBuilder());
			                        relatorio.append(funcionario.toString()).append("\r");
			                        relatorios.put(sexo, relatorio);
			                    } // Implementar relatório por sexo
			                    
			                    exibirRelatorios("Relatório por Sexo", relatorios);
		                }

		                static void gerarRelatorioPorEstado(ArrayList<Funcionario> funcionarios) {
		                    // Implementar relatório por estado
		                	  HashMap<String, StringBuilder> relatorios = new HashMap<>();

			                    for (Funcionario funcionario : funcionarios) {
			                        String estado = funcionario.getEstado();
			                        StringBuilder relatorio = relatorios.getOrDefault(estado, new StringBuilder());
			                        relatorio.append(funcionario.toString()).append("\t");
			                        relatorios.put(estado, relatorio);
			                    }
			                    
			                    exibirRelatorios("Relatório por Estado", relatorios);
			                    
			                   
		                }

		                static void exibirRelatorios(String titulo, HashMap<String, StringBuilder> relatorios) {
		                    StringBuilder relatorioFinal = new StringBuilder();
		                    for (String chave : relatorios.keySet()) {
		                        relatorioFinal.append("=== ").append(chave).append("=== f.getNome");
		                        relatorioFinal.append(relatorios.get(chave)).append(f.getNome());
		                        System.out.println(f.getCidade());
		                        relatorioFinal.append("=== ").append(chave).append(" ===\b");
		                        relatorioFinal.append(relatorios.get(chave)).append("\b\b");
		                        relatorioFinal.append("=== ").append(chave).append(" ===\r");
		                        relatorioFinal.append(relatorios.get(chave)).append("\r\r");
		                        relatorioFinal.append("=== ").append(chave).append(" ===\t");
		                        relatorioFinal.append(relatorios.get(chave)).append("\t\t");
		                    }
	                    JOptionPane.showMessageDialog(null, relatorioFinal.toString(), titulo, JOptionPane.INFORMATION_MESSAGE);
		                }
		            

		            }

		        


