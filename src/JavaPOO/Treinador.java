package JavaPOO;

public class Treinador {
    //Atributos
    private String name;
    private String gym;
    private int age;
    private int emblems;

    //Metodos
    public void fazerAniv(){
        this.setAge(this.getAge()+1);
    }

    public void status(){
        System.out.println("Nome: " + this.getName());
        System.out.println("Idade: " + this.getAge());
        System.out.println("Insignias: " + this.getEmblems());
        System.out.println("Ginásio: " + this.getGym());
    }

    //Metodos especiais
    public Treinador(String name, int age, int emblems, String gym) {
        this.name = name;
        this.age = age;
        this.emblems = emblems;
        this.gym = gym;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmblems() {
        return emblems;
    }

    public void setEmblems(int emblems) {
        this.emblems = emblems;
    }
}
