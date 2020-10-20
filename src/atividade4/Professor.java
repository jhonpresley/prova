package atividade4;
public class Professor extends Pessoa {
    //Atributos
    private String especialidade;
    private float salario;
    
    //Metodos
    public void receberAumento(float aum){
        this.salario+= aum;
    }
    
    //Metodos Especiais
    public String getEspecialidade(){
        return especialidade;
    }
    public void setEspecialidade(String e){
        this.especialidade = e;
    }
    public float getSalario(){
        return salario;
    }
    public void setSalario(float s){
        this.salario = s;
    }
    
	@Override
	public String toString() {
		return "Professor ----- >" + 
				"Especialidade: " + getEspecialidade() +
				" Salario: " + getSalario() + 
				" nome: " + getNome() + 
				" idade: " + getIdade() + 
				" sexo: " + getSexo();
	}
    
}
