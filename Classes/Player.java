public abstract class Player{
    private double HP, maxHP;
    private int speed, maxSpeed;
    private String statfx1, statfx2, ultimate;
    void attack1(Player target);
    void attack2(Player target);
    void ultimate(Player target);
    void dodge();
}
