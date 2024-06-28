package br.senai.sp.jandira.imc.model;

import java.time.LocalDate;

public class Aluno {

    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private String celular;
    private int peso;
    private double altura;

    //métodos de acesso GET e SET/

        //NOME
    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
        //DATADENASCIMENTO
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
        //EMAIL
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        //CELULAR
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
        //PESO
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
        //ALTURA
    public double getAltura() {
        return altura;
    }


    public boolean setAltura(double novoValor){
        if(novoValor > 1.0 && novoValor < 2.5) {
            altura = novoValor;
            return true;
        } else{
            return false;
        }
    }

}
