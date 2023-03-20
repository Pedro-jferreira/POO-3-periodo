package aula_15_03;



public class ChefeDeDeoartamento extends  Funcionario{
    private String departamento;
    private String datadepromoao;
    private double gratificacao;

    public ChefeDeDeoartamento() {
    }

    public ChefeDeDeoartamento(String nome, String cpf, String datadenascimento, String matricula, String datadeadimissao, double salario, String departamento, String datadepromoao, double gratificacao) {
        super(nome, cpf, datadenascimento, matricula, datadeadimissao, salario);
        this.departamento = departamento;
        this.datadepromoao = datadepromoao;
        this.gratificacao = gratificacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDatadepromoao() {
        return datadepromoao;
    }

    public void setDatadepromoao(String datadepromoao) {
        this.datadepromoao = datadepromoao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n\n Chefe De Departamento>>>\n" +
                "\n departamento: " + departamento +
                "\n datadepromoao: " + datadepromoao+
                "\n gratificacao: " + gratificacao;
    }
    void MostrarChefe(){
        System.out.println("\n\n CHEFE DE DEPARTAMENTO CADASTRADO>>>> \n\n"+toString()+"\n<<<<<<<<<<><><><><><><><><><>>>>>>>>>>>");
    }
}
