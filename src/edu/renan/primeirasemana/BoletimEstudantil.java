package edu.renan.primeirasemana;
public class BoletimEstudantil {
    public static void main(String[] args) {
        double mediaFinal = 4.5;
            if (mediaFinal < 6)
                System.out.print("Reprovado!");
            else if (mediaFinal == 6)
                System.out.print("Recuperação!");
            else
                System.out.print("Aprovado!");
    }
}
