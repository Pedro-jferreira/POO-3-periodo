package biblioteca;

public class Usuario extends Pessoa{
Professor professor;
Aluno aluno;
Funcionario funcionario;

    @Override
    public String getNome() {
        return super.getNome();
    }

    public Usuario(Aluno aluno) {
        this.aluno = aluno;
    }

    public Usuario(Professor professor) {
        this.professor = professor;
    }

    public Usuario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void LerLivro() {
        System.out.println("vc está lendo um livro");
    }

    @Override
    public String toString() {
        if (aluno == null && funcionario==null){
        return "professor=" + professor;
        } else if (professor == null && funcionario == null) {
            return " aluno=" + aluno;
        }else
            return " funcionario=" + funcionario ;
    }
    public String Imprimir(){
        if (aluno == null && funcionario==null){
            return "professor=" + professor.getNome();
        } else if (professor == null && funcionario == null) {
            return " aluno=" + aluno.getNome();
        }else
            return " funcionario=" + funcionario.getNome() ;

    }

}
