package br.senai.sp.jandira.imc;

import br.senai.sp.jandira.imc.model.Aluno;
import br.senai.sp.jandira.imc.model.Imc;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Scanner;

public class ImcApp {
    //objeto: (o bolo)
    public static void main(String[] args) {

        JFrame tela = new JFrame();
        tela.setSize(500, 300);
        tela.setTitle("Calculo de IMC");
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLayout(null);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(10, 20, 120, 30);

        tela.getContentPane().add(txtNome);


        tela.setVisible(true);

        Scanner leitor = new Scanner(System.in);

        Imc imcBia = new Imc();

        Aluno joao = new Aluno();
        joao.setNome("João de Almeida Vasconcelo.");
        joao.setEmail("joao@gmail.com");
        joao.setCelular("(11)96362-9725");
        joao.setPeso(78);
        joao.setAltura(1.72);
        joao.setDataNascimento(LocalDate.of(1999, 5, 15));

        Imc imcJoao = new Imc(joao);

        //imcBia.exibirDados();
        imcJoao.exibirDados();
    }
}
