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
import java.util.Date;
import java.net.UnknownHostException;
public class Qusetionanswer {
    private DB db ;
    private Mongo mongo = null ;
    private DBCollection dbcollection ;

    public Qusetionanswer() throws UnknownHostException {
           mongo = new Mongo();
           db = mongo.getDB("qestionnaireonline");
           dbcollection = db.getCollection("owners");
    }
    public void insertAnswer (String answer){
        dbcollection.insert(new BasicDBObject ("answer",answer));
    }
    public void deleteAnswer (String answer){
        dbcollection.remove(new BasicDBObject ("answer",answer));
    }
    public void updateAnswer (String answer_old,String answer_new){
    
        dbcollection.findAndModify(new BasicDBObject ("answer",answer_old), new BasicDBObject ("answer",answer_new));
    }
    
    public void findAnswer (String answer){
    
    } 
}
