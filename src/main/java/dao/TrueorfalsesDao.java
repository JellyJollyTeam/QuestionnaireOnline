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
public class TrueorfalsesDao {
    private String body;
    private boolean answer;
    //private Trueorfalses trueorfalse ;
    private DB db ;
    private Mongo mongo ;
    private DBCollection dbcollection ;
    private DBObject dbobject_old;
    private DBObject dbobject_new;
    //private DBObject dbobject_tem;
    public TrueorfalsesDao() throws UnknownHostException {
           mongo = new Mongo();
           db = mongo.getDB("qestionnaireonline");
           dbcollection = db.getCollection("trueorfalses");// 
    }
        
    public DBCollection getDBCollection (){
        return this.dbcollection;
    }
    
    public void insertBody (String body){
        dbobject_new = new BasicDBObject ("body",body);
        dbcollection.insert(dbobject_new );
    }
    
    public void insertAnswer (String body, boolean answer){
        dbobject_old = new BasicDBObject ("body",body);
        dbobject_new = dbcollection.findOne(dbobject_old);
        dbobject_new.put("answer", answer);
        dbcollection.findAndModify(dbobject_old, dbobject_new);
    }
    
    public void deleteBody (String body){
        dbobject_old = new BasicDBObject ("body",body);
        dbcollection.remove(dbobject_old);
    }
    
    public void updateBody (String body_old,String body_new){
        dbobject_old = new BasicDBObject ("body",body_old);
        dbobject_new= new BasicDBObject ("body",body_new);
        dbcollection.findAndModify(dbobject_old, dbobject_new);
    }
    
    
}
