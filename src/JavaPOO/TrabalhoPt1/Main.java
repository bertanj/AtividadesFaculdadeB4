package JavaPOO.TrabalhoPt1;

public class Main {
    public static void main(String[] args) {
      Dialog dialog = new WindowsDialog();
      dialog.render();

      Dialog dialog1 = new WebDialog();
      dialog1.render();
    }
}
