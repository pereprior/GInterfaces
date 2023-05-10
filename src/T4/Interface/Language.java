package T4.Interface;

import java.io.IOException;
import java.util.Properties;

public class Language extends Properties{
    public static final int spanish = 0;
    public static final int english = 1;
    public Language(int lang){
        switch(lang){
            case spanish:
                getProperties("resources/espanol.properties");
                break;
            case english:
                getProperties("resources/ingles.properties");
                break;
        }
    }

    private void getProperties(String langFile) {
        try {
            this.load( getClass().getResourceAsStream(langFile) );
        } catch (IOException ex) {

        }
    }
}
