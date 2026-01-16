public class Ranged extends Player{


  public Ranged(double HP, double maxHP, String statfx1, String statfx2) {
    this.maxHP = HP;
    this.HP = HP;
    this.statfx1 = statfix1;
    this.statfx2 = statfx2;
  }


  public String getStatus1() {
    return statfx1;
  }

  public String getStatus2() {
    return statfx2;
  }

  public String getHP() {
    return maxHP;
  }

  public void takeDmg() {
    this.HP -= 10;
  }

  public void attack1(Player other) {
    other.HP -= 10;
  }
  public void attack2(Player other) {
    other.HP -= 10;
  }
  public void ultimate(Player other) {
    other.HP -= 10;
  }

  public void dodge();


}
