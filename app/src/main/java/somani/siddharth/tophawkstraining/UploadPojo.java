package somani.siddharth.tophawkstraining;
import com.google.firebase.database.IgnoreExtraProperties;
@IgnoreExtraProperties
public class UploadPojo{

    public String name;
    public String url;
    public String modules;
    public String minutes;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public UploadPojo() {
    }

    public UploadPojo(String name, String url, String modules, String minutes) {
        this.name = name;
        this.url= url;
        this.modules=modules;
        this.minutes=minutes;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
    public String getModules(){return modules;}
    public String getMinutes(){return minutes;}
}