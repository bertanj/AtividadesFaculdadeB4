package JavaPOO.TrabalhoPt1;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("HTML button sendo gerado");
    }

    @Override
    public void onClick() {
        System.out.println("HTML button clicked!");
    }
}
