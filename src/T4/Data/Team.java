package T4.Data;

import java.util.ArrayList;

/**
 * @author Pere Prior
 */
public class Team {

    private String country;
    private String league;
    private String coach;
    private String name;

    public Team(ArrayList<String> arrayList){
        this.name=arrayList.get(0);
        this.country=arrayList.get(1);
        this.league=arrayList.get(2);
        this.coach=arrayList.get(3);
    }

    public String getCountry() {
        return country;
    }

    public String getLeague() {
        return league;
    }

    public String getCoach() {
        return coach;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: "+name+" Country: "+country+" League: "+league+" Coach: "+coach;
    }
}
