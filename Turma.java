public class Turma
{
   private String nome;
   private String curso;
   private int quantidadeDeAlunos;
   private int serie;
   
   public Turma (String n, String c, int qtd, int s)
   {
      nome = n;
      curso = c;
      quantidadeDeAlunos = qtd;
      serie = s;
   } 
   
   public void setNome(String nome)
   {
      this.nome = nome;
   }
   public void setCurso(String curso)
   {
      this.curso = curso;
   }
   public void setQtdAlunos(int qtdAlunos)
   {
      quantidadeDeAlunos = qtdAlunos;
   }
   public void setSerie(int serie)
   {
      this.serie = serie;
   }
   
   public String getNome()
   {
      return nome;
   }
   public String getCurso()
   {
      return curso;
   }
   public int getQtdAlunos()
   {
      return quantidadeDeAlunos;
   }
   public int getSerie()
   {
      return serie;
   }
   
}