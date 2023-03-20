package aula_15_03;

public class TestarTudo {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("pedro", "70718430158","07/03/2003","1");

        ChefeDeDeoartamento chefeDeDeoartamento = new ChefeDeDeoartamento("pedro ferreira", "70718430158", "07/03/2003",
                             "2", "15/02/2020", 1600.00,"rh", "15/02/2023", 200.00);
        aluno.MostrarAluno();
        chefeDeDeoartamento.MostrarChefe();}

}
