package T4.Data;

import java.util.ArrayList;

/**
 * @author Pere Prior
 */
public class Player {
    private String position;
    private String name;
    private String birthdate;
    private double heigth;
    private int number;
    private String team;

    public Player(ArrayList<String> arrayList){
        this.position=arrayList.get(0);
        this.name=arrayList.get(1);
        this.birthdate=arrayList.get(2);
        this.heigth=Double.parseDouble(arrayList.get(3));
        this.number=Integer.parseInt(arrayList.get(4));
        this.team=arrayList.get(5);
    }

    public String getTeam() {
        return team;
    }

    public String getPosition() {
        return position;
    }

    public double getHeigth() {
        return heigth;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "Name: "+name+" Team: "+team+" Position: "+position+" Number: "+number+" Birthdate: "+birthdate+" Height: "+heigth;
    }
}
