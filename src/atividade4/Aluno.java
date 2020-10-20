package atividade4;

public class Aluno extends Pessoa {
    
	//Atributos
     int matr;
     String curso;
     
	public int getMatr() {
		return matr;
	}
	public void setMatr(int matr) {
		this.matr = matr;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Aluno ----- >" + 
				"matricula: " + getMatr() +
				" curso: " + getCurso() + 
				" nome: " + getNome() + 
				" idade: " + getIdade() + 
				" sexo: " + getSexo();
	}
    
	
    






}
