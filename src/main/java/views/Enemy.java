package views;

public class Enemy extends Character{


    public Enemy(String name, int pv, int pvMax, int damage) {
        super(name, pv, pvMax, damage);

    }


    public static Enemy GenerateEnemy(int level) {
        Enemy enemy;

        switch (level){

            case 2:
                enemy=  new Enemy("Basilic",100,100,35);
            break;

            case 3:
            enemy=new Enemy("Detractors",100,100,35);
            break;

            case 4:
            enemy=new Enemy("Voldemort and Peter Pettigrow",100,100,40);
            break;

            case 5:
            enemy=new Enemy("Dolores Shade",100,100,50);
            break;

            case 6:
                enemy=new Enemy("Death Eater",110,110,65);
                break;
            case 7:
                enemy=new Enemy("voldemort and Bellatrix Lestrange",110,110,80);
                break;

            default:
                enemy=new Enemy("Troll",90,90,30);

            break;
        }


        return enemy;
    }
    @Override
    public int attack(){
        return (int) (Math.random());
    }


}
