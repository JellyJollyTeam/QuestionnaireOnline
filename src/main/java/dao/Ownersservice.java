package dao;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yan
 */
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.ServerAddress;
import java.net.UnknownHostException;
public class Ownersservice {
    private DB db ;
    private Mongo mongo ;
    private DBCollection dbcollection ;
    private DBObject dbobject;
    //private DBObject dbobject_new;
    public Ownersservice () throws UnknownHostException{
           mongo = new Mongo();
           db = mongo.getDB("qestionnaireonline");
           dbcollection = db.getCollection("owners");
    }
    public void insertOwner (String username,String password){
        dbobject = new BasicDBObject ();
        dbobject.put("username", username);
        dbobject.put("password", password);
        dbcollection.save(dbobject);
    }
    public void deleteOwner (String username , String password){
        
        dbobject = new BasicDBObject ();
        dbobject.put("username", username);
        dbobject.put("password", password);
        dbcollection.remove(dbobject);
    
    }
    public void updatePassword (String username , String password_old , String password_new){
        
        dbcollection.findAndModify(new BasicDBObject("username", username), new BasicDBObject("password", password_new));
    
    }
    public void findOwner (String username){
        // to do
        dbcollection.find(new BasicDBObject ("username",username)).getCursorId();//
       
    }   

}
