package dev_superior.JavaeProgramaçãoOrientadaaObjetosExpert.Construtores_this_sobrecarga_encapsulamento.base;

public class Champion {

    private String name;
    private int life;
    private int attack;
    private int armor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        if (life < 0) {
            this.life = 0;
        } else {
            this.life = life;
        }
    }

    public void setAttack(int attack) {

        if (attack < 0){
            this.attack = 0;
        }else{
            this.attack = attack;
        }
    }

    public void setArmor(int armor) {

        if(armor < 0){
            this.armor = 0;
        }else{
            this.armor = armor;
        }
    }

    public Champion(String name, int life, int attack, int armor){

        setName(name);
        setLife(life);
        setAttack(attack);
        setArmor(armor);
    }

    public void takeDamage (Champion other){

       int damage = other.attack - this.armor;

        if (damage < 1){
            damage = 1;
        }

        this.setLife(this.getLife() - damage);

        if (this.life < 0){
            this.life = 0;
        }
    }

    public String status(){
        if (this.life <= 0){
            return this.getName() + ": " + this.getLife() + " (morreu)";
        }
        return this.getName() + ": " + this.getLife() + " de vida";
    }


}
