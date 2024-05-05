package Model;

public class Aluno {

    private String nome;
    private int idade;
    private String curso;
    private int fase;
    private int id = 0;

    public Aluno(String nome, int idade, String curso, int fase) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCurso(curso);
        this.setFase(fase);
        this.setId(this.getId()+1);
    }

    public Aluno() {
        this.setNome("");
        this.setIdade(0);
        this.setCurso("Curso");
        this.setFase(1);
    }

    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

}
