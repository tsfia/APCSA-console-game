public abstract class Melee implements Player{
    private double HP, maxHP;
    private int speed, maxSpeed;
    private String statfx1, statfx2;
    public double getHP(){
        return HP;
    }
    public int getSpeed(){
        return speed;
    }
    public String getStatus1(){
        return statfx1;
    }
    public String getStatus2(){
        return statfx2;
    }
    public static void attack1(Player target){
        target.HP -= 10;
    }
    public static void attack2(Player target){
        target.HP -= 20;
    }
    public static void ultimate(Player target){
        target.HP -= 100;
    }
    public static void dodge(){

    }
    public static void inflictBleed(Player target){
        if (!target.getStatus1().equals(null)) target.statfx1 = "Bleed";

    }
}
