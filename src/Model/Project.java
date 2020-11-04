package Model;
import org.json.JSONException;
import org.json.JSONObject;
public class Project {
    private int           id;
    private User          User;
    private String        project_name;
    private int           function_type;
    public Project(JSONObject Data){
        try{
            this.id            = Data.getInt("id");
            this.User          = new User(Data.getInt("user_id"));
            this.project_name  = Data.getString("project_name");
            this.function_type = Data.getInt("function_type");
        }
        catch(JSONException e){
            System.out.print(e.getMessage());
        }
    }
    public Project(int id){
        this.id = id;
        this.getById();
    }
    private void getById(){
        try{
            JSONObject json    = new JSONObject();
            this.User          = new User(json.getInt("user_id"));
            this.project_name  = json.getString("project_name");
            this.function_type = json.getInt("function_type");
        }
        catch(JSONException e){
            System.out.print(e.getMessage());
        }
    }
    public void setName(String newName){
        this.project_name = newName;
    }
}