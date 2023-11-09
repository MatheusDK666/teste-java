package Entites;

public class Alunos {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double finalGrade(){
        return this.nota1 + this.nota2 + this.nota3;
    }
    public double missingPoints() {
        return 60.00 - finalGrade();
    }
}
