//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //criando o objeto pokemon
        Pokemon pokemon = new Pokemon();
        //setando o nome dele
        pokemon.setName("Pikachu");
        //setando o level dele
        pokemon.setLevel(8);
        //setando o tipo dele
        pokemon.setType("Electric");
        //setando o numero dele
        pokemon.setNumber(24);

        //imprimindo o nome, level, tipo e numero
        pokemon.imprimirNome();
        pokemon.imprimirLevel();
        pokemon.imprimirTipo();
        pokemon.imprimirNumber();

        //criando o segundo objeto pokemon2
        Pokemon pokemon2 = new Pokemon();

        //setando o nome
        pokemon2.setName("Riolu");
        //setando o level
        pokemon2.setLevel(2);
        //setando o tipo
        pokemon2.setType("Fighting");
        //setando o numero
        pokemon2.setNumber(446);

        //imprimindo o nome, level, tipo e numero
        pokemon2.imprimirNome();
        pokemon2.imprimirLevel();
        pokemon2.imprimirTipo();
        pokemon2.imprimirNumber();
    }
}