import javax.swing.*;
public class TesteTurma
{
   public static void main(String[] args)
   {
      String nome = JOptionPane.showInputDialog("Nome");
      String curso = JOptionPane.showInputDialog("Curso");
      int qtdAluno = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Alunos"));
      int serie = Integer.parseInt(JOptionPane.showInputDialog("Serie"));
      
      Turma turma = new Turma(nome, curso, qtdAluno,serie);
      
      String msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade de Alunos: " + turma.getQtdAlunos() + "\nSerie: " + turma.getSerie();
      
      JOptionPane.showMessageDialog(null, msg);
      
      nome = JOptionPane.showInputDialog("Nome");
      curso = JOptionPane.showInputDialog("Curso");
      qtdAluno = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Alunos"));
      serie = Integer.parseInt(JOptionPane.showInputDialog("Serie"));
      turma.setNome(nome);
      turma.setCurso(curso);
      turma.setQtdAlunos(qtdAluno);
      turma.setSerie(serie);
      
      msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade de Alunos: " + turma.getQtdAlunos() + "\nSerie: " + turma.getSerie();
      JOptionPane.showMessageDialog(null,msg);
   }
}