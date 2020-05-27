package builderStrategy;

public class MagicAttack implements ActionBehaviour{
    @Override
    public String attack() {
        return "CONJURA BOLA DE FOGO";
    }
//    @Override
//    public void attack(int magicPoints,int energy) {
//        if ( (magicPoints & energy) >  30){
//            System.out.println("CONJURA BOLA DE FOGO");
//        } else if (magicPoints < 30) {
//            System.out.println("Magia insuficiente");
//        } else {
//            System.out.println("Energia insuficiente");
//        }
//    }

}
