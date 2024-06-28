package br.senai.sp.jandira.imc.model;

public class Imc {
    //classe (receita de bolo)
    private double imc;
    private Aluno aluno;

    public Imc(Aluno aluno){
        this.aluno = aluno;
    }

    public Imc(){

    }

    private void calcularImc(){
        imc = aluno.getPeso() / Math.pow(aluno.getAltura(), 2.0);
    }

    public void definirEstadoImc(){
        String estado = "Calculando resultado...";
    }

    public void exibirDados(){
        System.out.println("--------------------------------");
        System.out.println("DADOS DO ALUNO: ");
        System.out.printf("NOME: %s\n", aluno.getNome());
        System.out.printf("PESO: %s\n", aluno.getPeso());
        System.out.printf("ALTURA: %s\n", aluno.getAltura());
        System.out.printf("EMAIL: %s\n", aluno.getEmail());
        System.out.printf("DATA DE NASCIMENTO: %s\n", aluno.getDataNascimento());
        System.out.printf("CELULAR: %s\n", aluno.getCelular());
        calcularImc();
        System.out.printf("IMC: %s\n", imc);

    }

}
