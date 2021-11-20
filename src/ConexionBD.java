
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author cesar
 */
public class ConexionBD {
    //Colección: PRODUCTOS  (DESCRIPCION String, PRECIO FLOAT/DECIMAL, EXISTENCIA INTEGER)

    ConnectionString connectionString = new ConnectionString("mongodb+srv://Admin:1234@cluster0.x3zsn.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("TAP_U4_Practica2");

    public MongoDatabase obtenerDB() {
        return database;
    }

}
