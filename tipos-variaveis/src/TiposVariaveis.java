public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}


/* Esse é o exemplo,de como se faz a adaptacao de uma variavel. Essa é uma boa pratica porem a linguagem permite isso  */

short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = (short) numeroNormal; /*Esse é um casting */


 