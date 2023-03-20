package aula_14_03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

/*        Professor prof1 = new ProfDe("augusto", 123, 1123.56, 122);
        Professor prof2 = new ProfHorista("maria", 456,14,12.5);
*//*
        ProfDe prof3 = (ProfDe) new Professor("joao",2,14);
*//*



        Professor profSuper;
        ProfDe profSub;
        ProfDe prof4= new ProfDe("jose",3,10,122);
        profSuper = prof4;
        profSub = (ProfDe) profSuper;
        profSub.getSalario();


        System.out.println();
        System.out.println();*/

        ArrayList<ProfDe> cadDe= new ArrayList<>();
        ArrayList<ProfHorista> cadHorista = new ArrayList<>();

        cadDe.add(new ProfDe("joao", 1, 1123.56));
        cadDe.add(new ProfDe("maria",2,1200.00));
        cadHorista.add(new ProfHorista("jose",3,14,12.5));
        cadHorista.add(new ProfHorista("fernando",4,14,12.5));
        cadHorista.add(new ProfHorista("ana",5,1200,12.5));

        ArrayList<Professor> cadProfessor = new ArrayList<>();
        cadProfessor.add(new ProfDe("joao", 1, 1123.56));
        cadProfessor.add(new ProfDe("maria",2,1200.00));
        cadProfessor.add(new ProfHorista("jose",3,14,12.5));
        cadProfessor.add(new ProfHorista("fernando",4,14,12.5));
        cadProfessor.add(new ProfHorista("ana",5,120,12.5));


        for (Professor p :cadProfessor) {
            if (p instanceof ProfDe profDe){
                System.out.println(profDe);
            }else {
                ProfHorista profHorista = (ProfHorista)p;
                System.out.println(profHorista);}
            }



    }
}
