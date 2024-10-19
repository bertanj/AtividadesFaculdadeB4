package JavaPOO;

public class Pokemon {
    //Atributos
    private String name;
    private int PC;
    private String type;
    private String rarity;
    private int wins;
    private int losses;
    private int level;

    //Metodos
    public void status(){
        System.out.println("Nome do pokemon: " + this.getName());
        System.out.println("Tipo do pokemon: " + this.getType());
        System.out.println("Raridade do pokemon: " + this.getRarity());
        System.out.println("Força de combate do pokemon: " + this.getPC());
        System.out.println("Quantidade de vitórias do pokemon: " + this.getWins());
        System.out.println("Quantidade de derrotas do pokemon: " + this.getLosses());
    }
    public void evoluir(){
        this.setLevel(this.getLevel()+1);
    }

    public void ganharLuta(){
        this.setWins(this.getWins() + 1);
    }

    public void perderLuta(){
        this.setLosses(this.getLosses() + 1);
    }

    //Metodos especiais
    public Pokemon(String name, int PC, String type, String rarity, int wins, int losses, int level) {
        this.name = name;
        this.PC = PC;
        this.type = type;
        this.rarity = rarity;
        this.wins = wins;
        this.losses = losses;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPC() {
        return PC;
    }

    public void setPC(int PC) {
        this.PC = PC;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
}
