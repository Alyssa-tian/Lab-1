public class Battle {

    private int round_num=0;
    private float dmg=0;

    private String name1;
    private float atk1;
    private float def1;
    private float hp1;

    private String name2;
    private float atk2;
    private float def2;
    private float hp2;

    Battle(String player1,float attack1,float defence1,float health1,
    String player2, float attack2,float defence2,float health2){
        name1=player1;
        atk1=attack1;
        def1=defence1;
        hp1=health1;

        name2=player2;
        atk2=attack2;
        def2=defence2;
        hp2=health2;
    }

    public void simulateRound(){
        round_num+=1;
        System.out.println("Round "+round_num);

        dmg=atk1-def2;
        hp2-=dmg;
        System.out.printf("%s does %.0f points of damage to %s\n", name1, dmg, name2); 
        
        dmg=atk2-def1;
        hp1-=dmg;
        System.out.printf("%s does %.0f points of damage to %s\n", name2, dmg, name1);
        System.out.printf("%s : %.0f\n", name1, hp1);
        System.out.printf("%s : %.0f", name2, hp2);
        System.out.println("\n");

    } 

    public String getMonster1Name(){return name1;}

    public String getMonster2Name(){return name2;}

    public float getMonster1HP(){return hp1;}

    public float getMonster2HP(){return hp2;}

    public float getMonster1Attack(){return atk1;}

    public float getMonster2Attack(){return atk2;}

    public float getMonster1Defence(){return def1;}

    public float getMonster2Defence(){return def2;}

    public Boolean isMonster1Dead (){
        if (hp1<=0)
            return true;
        else
            return false;
    }

    public Boolean isMonster2Dead (){
        if (hp2<=0)
            return true;
        else
            return false;
    }
    

}
