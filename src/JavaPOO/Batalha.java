package JavaPOO;

import java.util.Random;

public class Batalha {
    //Atributos
    private Pokemon desafiante;
    private Pokemon desafiado;
    private boolean aceitar;

    //Metodos
    public void marcarBatalha(Pokemon p1, Pokemon p2) {
        if(p1.getLevel() > p2.getLevel()+10 && p1 != p2){
            this.aceitar = false;
            this.desafiante = null;
            this.desafiado = null;
        }else{
            this.aceitar = true;
            this.desafiante = p1;
            this.desafiado = p2;
        }
    }

    public void batalhar(){
        if(this.aceitar){
            System.out.println("## POKEMON DESAFIANTE ##");
            this.desafiante.status();
            System.out.println("## POKEMON DESAFIADO ##");
            this.desafiado.status();

            //sorteio
            Random random = new Random();
            int vencedor = random.nextInt(2);

            switch(vencedor){
                case 0: // ganhou desafiante
                    System.out.println(this.desafiante.getName() + " venceu a batalha!!!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;

                case 1: //ganhou desafiado
                    System.out.println(this.desafiado.getName() + " venceu a batalha!!!");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
            }
        }else {
            System.out.println("LUTA NÃO PODE ACONTECER!");
        }
    }

    //Metodos especiais
    public Pokemon getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Pokemon desafiante) {
        this.desafiante = desafiante;
    }

    public Pokemon getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Pokemon desafiado) {
        this.desafiado = desafiado;
    }

    public boolean isAceitar() {
        return aceitar;
    }

    public void setAceitar(boolean aceitar) {
        this.aceitar = aceitar;
    }
}
