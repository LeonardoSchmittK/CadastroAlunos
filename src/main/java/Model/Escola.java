package Model;

import java.util.ArrayList;

public class Escola {

    private ArrayList<Aluno> alunos;

    public Escola() {
        ArrayList<Aluno> emptyList = new ArrayList<Aluno>();
        this.setAlunos(emptyList);
    }

    public void addAluno(Aluno newAluno) {
        ArrayList<Aluno> newList = this.getAlunos();
        newList.add(newAluno);
        this.setAlunos(newList);
    }

   public void updateAluno(Aluno toUpdateAluno, int id) {

    ArrayList<Aluno> newList = this.getAlunos();

    for (int i = 0; i < newList.size(); i++) {

        Aluno aluno = alunos.get(i);

        if (aluno.getId() == id) {

            newList.set(i, toUpdateAluno);

            break;

        }

    }

    this.setAlunos(newList);

}
    
    public void removeAluno( int id) {

    ArrayList<Aluno> newList = new ArrayList<Aluno>();
    
    for (Aluno aluno : this.getAlunos()) {

        if (aluno.getId()!= id) {

            newList.add(aluno);

        }

    }

    this.setAlunos(newList);

}

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

}
