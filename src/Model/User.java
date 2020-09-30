package Model;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
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
    public static JSONArray getJson(){
        try{
            URL httpClient = new URL("http","82.165.118.172",80,"/api/1.0/project/view?user_id=1");
            URLConnection httppost = httpClient.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    httppost.getInputStream()));
            String inputLine;
            while ((inputLine = reader.readLine()) != null){
                System.out.println(inputLine);
                return new JSONArray(inputLine);
            }
            reader.close();
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
        return new JSONArray();
    }
}