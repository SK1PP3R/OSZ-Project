package Model;
import org.json.JSONException;
import org.json.JSONObject;
public class User {
    public int     id;
    public String  username;
    public String  passwort;
    public String  email;
    public Boolean activated;
    public User(JSONObject Data){
        try{
            this.id        = Data.getInt("id");
            this.username  = Data.getString("id");
            this.passwort  = Data.getString("passwort");
            this.email     = Data.getString("email");
            this.activated = Data.getBoolean("activated");
        }
        catch(JSONException e){
            System.out.print("Fehler im JSON");
        }
    }
}