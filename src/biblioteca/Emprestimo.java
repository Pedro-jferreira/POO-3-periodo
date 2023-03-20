package biblioteca;

public class Emprestimo {

    private String DatadoEmprestimo;
    private int hora;
    private Livro livro;
    private Usuario usuario;


    public Emprestimo(String datadoEmprestimo, int hora) {
        DatadoEmprestimo = datadoEmprestimo;
        this.hora = hora;
    }

    public String getDatadoEmprestimo() {
        return DatadoEmprestimo;
    }

    public void setDatadoEmprestimo(String datadoEmprestimo) {
        DatadoEmprestimo = datadoEmprestimo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }



    void DevolverLivro(){
        livro.setEmprestimo(true);
        System.out.println("livro devolvido");
    }



    void abrirLivro(){
        livro.Abrir();
    }
    void FecharLivro(){
        livro.Fechar();
    }
    void LerLivro(){
        usuario.LerLivro();
    }

    public Emprestimo(String datadoEmprestimo, int hora, Livro livro, Usuario usuario) {
        DatadoEmprestimo = datadoEmprestimo;
        this.hora = hora;
        this.livro = livro;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "<<<<<Emprestimo>>>>>" +
                "\n Data do Emprestimo: " + DatadoEmprestimo +
                "\n Hora: " + hora +livro.Imprimir() +
                "\n"+usuario.Imprimir();
    }

}
