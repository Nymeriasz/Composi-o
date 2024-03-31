package Composição;

public class Aluno {
    private String curso;
    private Pessoa pessoa;

    public Aluno(String curso,String pessoaNome){
        this.curso=curso;
        this.pessoa=new Pessoa(pessoaNome);
    }
    public void Nome(){
        System.out.println("Curso: "+curso);
        pessoa.Nome();
    }
}
