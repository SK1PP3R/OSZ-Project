package Model;
import org.json.JSONException;
import org.json.JSONObject;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.URLConnection;
//import java.net.URL;

public class User {
    private int     id;
    private String  username;
    private String  passwort;
    private String  email;
    private Boolean activated;
    public User(int id){
            this.id = id;
    }
//    public static JSONArray getJson(){
//        try{
//            URL httpClient = new URL("http","82.165.118.172",80,"/api/1.0/project/view?user_id=1");
//            URLConnection httppost = httpClient.openConnection();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(
//                    httppost.getInputStream()));
//            String inputLine;
//            while ((inputLine = reader.readLine()) != null){
//                System.out.println(inputLine);
//                return new JSONArray(inputLine);
//            }
//            reader.close();
//        }
//        catch(Exception e){
//            System.out.print(e.getMessage());
//        }
//        return new JSONArray();
//    }
}