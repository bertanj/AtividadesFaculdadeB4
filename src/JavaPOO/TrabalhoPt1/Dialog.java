package JavaPOO.TrabalhoPt1;

public abstract class Dialog  {

    //Metodos
    public void render(){
        Button okButton = createButton();
        okButton.render();
        okButton.onClick();
    }

    public abstract Button createButton();

}
