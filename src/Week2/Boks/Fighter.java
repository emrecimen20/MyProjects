package Week2.Boks;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int chance;

    public Fighter(String name,int damage,int health,int weight,int dodge,int chance){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        if(this.dodge>=0&&this.dodge<=100){
            this.dodge=dodge;
        }else{
            this.dodge=0;
        }
        this.chance=chance;

    }

    public int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if (foe.isDodge()) {
            System.out.println(foe.name + " Gelen hasarı blokladı.");
            return foe.health;
        }
        if(foe.health-this.damage<0){
            return 0;
        }else{
            return foe.health-this.damage;
        }


    }
    public boolean isDodge(){
        double randomNumber =Math.random()*100;
        return randomNumber<=this.dodge;
    }

}
