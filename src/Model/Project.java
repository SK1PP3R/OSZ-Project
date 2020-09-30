package Model;
import org.json.JSONException;
import org.json.JSONObject;
import java.time.LocalDateTime;
public class Project {
    public int           id;
    public User          User;
    public String        project_name;
    public int           function_type;
    public LocalDateTime updated;
    public LocalDateTime created;
    public Project(JSONObject Data){
        try{
            this.id            = Data.getInt("id");
            //this.User          = Model.User.getUserById(Data.getInt("user_id"));
            this.project_name  = Data.getString("project_name");
            this.function_type = Data.getInt("function_type");
            //this.updated       = new LocalDateTime(Data.getString("activated"));
            //this.created       = Data.getString("activated");
        }
        catch(JSONException e){
            System.out.print("Fehler im JSON");
        }
    }
}