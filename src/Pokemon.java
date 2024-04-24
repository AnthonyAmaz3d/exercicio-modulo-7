/**
 * @author Anthony.Amaz3d
 */

// criação da classe Pokemon
public class Pokemon {

    // propriedada da classe ou no caso o Pokemon
    private String name;
    private String type;
    private int level;
    private int number;

    // método para pegar o nome no pokemon
    public String getName() {
        return name;
    }

    // metodo para definir o nome do pokemon
    public void setName(String name) {
        this.name = name;
    }

    //metodo para pegar o tipo do pokemon
    public String getType() {
        return type;
    }

    //metodo para definir o tipo do pokemon
    public void setType(String type) {
        this.type = type;
    }

    // metodo para pegar o level do pokemon
    public int getLevel() {
        return level;
    }

    // metodo para definir o level do pokemon
    public void setLevel(int level) {
        this.level = level;
    }

    // metodo para pegar o numero da pokedex do pokemon
    public int getNumber() {
        return number;
    }

    // metodo para definir o numero da pokedex do pokemon
    public void setNumber(int number) {
        this.number = number;
    }

    // metodo para imprimir o nome do pokemon
    public void imprimirNome() {
        System.out.println("Nome: " + this.getName());
    }

    // metodo para imprimir o level do pokemon
    public void imprimirLevel() {
        System.out.println("Level: " + this.getLevel());
    }

    // metodo para imprimir o tipo do pokemon
    public void imprimirTipo() {
        System.out.println("Tipo: " + this.getType());
    }

    // metodo para imprimir o numero da pokedex do pokemon
    public void imprimirNumber() {
        System.out.println("Número na pokedex: " + this.getNumber());
    }
}