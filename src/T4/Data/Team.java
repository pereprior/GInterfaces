package T4.Data;

import java.util.ArrayList;

/**
 * @author Pere Prior
 */
public class Team{
    private String name;
    private String country;
    private String league;
    private String coach;

    public Team(ArrayList<String> arrayList){
        this.name=arrayList.get(0);
        this.country=arrayList.get(1);
        this.league=arrayList.get(2);
        this.coach=arrayList.get(3);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: "+name+"\nCountry: "+country+"\nLeague: "+league+"\nCoach: "+coach;
    }
}
