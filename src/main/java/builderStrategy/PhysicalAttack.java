package builderStrategy;

public class PhysicalAttack implements ActionBehaviour {
    //    @Override
//    public void attack(int magicPoints,int energy) {
//        if ( energy >  30 & magicPoints > 0){
//            System.out.println("Completa um ataque vertical com a espada + BONUS de ataque");
//        } else if (magicPoints < 10) {
//            System.out.println("Completa um ataque vertical com a espada + SEM BONUS DE ATAQUE");
//        }else {
//            System.out.println("Energia insuficiente");
//        }
//    }
    @Override
    public String attack() {
        return "ATAQUE FISICO COM ESPADA";
    }
}
