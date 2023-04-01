package views;

public class Enemy extends Character{


    public Enemy(String name, int pv, int pvMax, int damage) {
        super(name, pv, pvMax, damage);

    }


    public static Enemy GenerateEnemy(int level) {
        Enemy enemy;

        switch (level){

            case 2:
            enemy=new Enemy("basilic",100,100,40);
            break;

            case 3:
            enemy=new Enemy("troll2",100,100,30);
            break;

            case 4:
            enemy=new Enemy("troll3",100,100,30);
            break;

            case 5:
            enemy=new Enemy("trol4l",100,100,30);
            break;
            default:
                enemy=new Enemy("troll",100,100,40);

            break;
        }


        return enemy;
    }
    @Override
    public int attack(){
        return (int) (Math.random());
    }


}
