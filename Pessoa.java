
package cadastro;

import javax.swing.JOptionPane;


public class Pessoa {
    public static void main(String[] args) {
  int op = 0;
  do {
  op = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da operação:"+
  "\n1 - Cadastrar Aluno\n2 - Cadastrar Professor\n3 - Cadastrar Escola") );
  switch ( op )
  {
  case 1:
  String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
  String sobreNome = JOptionPane.showInputDialog("Digite o sobre nome: ");
  String ultimoNome = JOptionPane.showInputDialog("Digite o último nome: ");
  int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do nascimento: "));
  int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do nascimento: "));
  int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
  String rg = JOptionPane.showInputDialog("Digite seu rg: ");
  break;
  case 0:
  JOptionPane.showMessageDialog(null, "Saindo do Sistema");
  }
  } while ( op!= 0);
    }
