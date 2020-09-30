package Model;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class User {
    public int     id;
    public String  username;
    public String  passwort;
    public String  email;
    public Boolean activated;
    public User(int id){
            this.id = id;
    }
    public static void getJson(){
        try{
            URL httpClient = new URL("https","cloudu24.de/api/1.0/",443,"project/view?user_id=1");
            URLConnection httppost = httpClient.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    httppost.getInputStream()));
            String inputLine;
            while ((inputLine = reader.readLine()) != null)
                System.out.println(inputLine);
            reader.close();
        }
        catch(java.net.MalformedURLException e){
            System.out.print("Client funktioniert nicht");
        }
        catch(java.io.IOException f){
            System.out.print("Verbindung funkioniert nicht");
        }
    }
}