package T4.Data;

import java.util.ArrayList;

/**
 * @author Pere Prior
 */
public class Player{

    private String name;
    private String position;
    private String birthdate;
    private String heigth;
    private String number;
    private String team;

    public Player(ArrayList<String> arrayList){
        this.position=arrayList.get(0);
        this.name=arrayList.get(1);
        this.birthdate=arrayList.get(2);
        this.heigth=arrayList.get(3);
        this.number=arrayList.get(4);
        this.team=arrayList.get(5);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: "+name+"\nTeam: "+team+"\nPosition: "+position+"\nNumber: "+number+"\nBirthdate: "+birthdate+"\nHeight: "+heigth;
    }
}
