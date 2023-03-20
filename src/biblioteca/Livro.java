package biblioteca;

public class Livro extends Obra{
    private String Titulo, Autores, Area, Editora;
    private int Ano, Edicao, Ndepaginas;
    private boolean Emprestimo;

    public boolean isEmprestimo() {
        return Emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.Emprestimo = emprestimo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutores() {
        return Autores;
    }

    public void setAutores(String autores) {
        Autores = autores;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        this.Editora = editora;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public int getEdicao() {
        return Edicao;
    }

    public void setEdicao(int edicao) {
        Edicao = edicao;
    }

    public int getNdepaginas() {
        return Ndepaginas;
    }

    public void setNdepaginas(int ndepaginas) {
        Ndepaginas = ndepaginas;
    }
    void Abrir() {
        System.out.println("livro aberto");
    }

    void Fechar() {
        System.out.println("livro fechado");
    }

    public Livro() {
    }

    public Livro(String titulo, String autores) {
        Titulo = titulo;
        Autores = autores;

    }


    @Override
    public String toString() {
        return "\n Livro->" +
                "\n Titulo: " + Titulo +
                "\n Autores: " + Autores;
    }
    public String Imprimir(){
        if (isEmprestimo()){
            return "\nlivro-> titulo: "+getTitulo()+"livro em estoque";
        }else return "\nlivro-> titulo: "+getTitulo()+"\nlivro emprestado";


    }



}


