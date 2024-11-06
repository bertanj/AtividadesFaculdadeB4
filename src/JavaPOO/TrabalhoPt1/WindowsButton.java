package JavaPOO.TrabalhoPt1;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Criando botão Windows");
    }

    @Override
    public void onClick() {
        System.out.println("Clique no botão Windows gerado!");
    }
}
