package edu.renan.segundasemana;

public class MyClass {
    public static void main (String [] args){

        String primeiroNome = "Renan";
        String segundoNome = "Carneiro";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado da pesquisa: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
