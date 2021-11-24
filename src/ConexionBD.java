
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

    /*
     * El proyecto sera sobre una pizzería, la colección tendrá los siguientes
     * documentos: Pizza: Nombre del producto, tamaño, precio, existencia.
     * Ticket: Numero de orden, nombre del producto, cantidad del producto,
     * costo total de la orden.
     *
     *
     * El proyecto en java tendrá los siguientes menús: Registrar compra
     * (Insertar en Ticket) Consultar el historial de ventas (Consultar de
     * Ticket) Eliminar una venta (Eliminar de Ticket) Reponer inventario
     * (Actualizar en Pizza)
     *
     *
     * Evidentemente cada vez que se realice una venta se actualizara la
     * cantidad en existencia de ese producto.
     */
    ConnectionString connectionString = new ConnectionString("mongodb+srv://Admin:1234@cluster0.x3zsn.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("practica2");

    public MongoDatabase obtenerDB() {
        return database;
    }

}
