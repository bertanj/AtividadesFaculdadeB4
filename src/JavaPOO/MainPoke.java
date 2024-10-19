package JavaPOO;

public class MainPoke {
    public static void main(String[] args) {
        Pokemon p[] = new Pokemon[5];

        p[0] = new Pokemon("Pikachu", 500, "Elétrico", "Raro", 8, 3, 36);
        p[1]= new Pokemon("Dragonite", 1890, "Dragão", "Pseudo Lendário", 56, 1, 86);
        p[2]= new Pokemon("Alakazan", 1240, "Psiquico", "Raro", 31, 9, 41);
        p[3]= new Pokemon("Zubat", 95, "Venenoso", "Comum", 0,28,12);

        p[1].status();

        Treinador t[] = new Treinador[3];
        t[0] = new Treinador("Mateus", 18, 29, "Agua");
        t[1] = new Treinador("Anderson", 30, 26, "Fogo");

        t[0].status();


        Batalha PokeFight = new Batalha();
        PokeFight.marcarBatalha(p[0], p[2]);
        PokeFight.batalhar();
    }
}
