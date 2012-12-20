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
public class Qusetion {
    private DB db ;
    private Mongo mongo ;
    private DBCollection dbcollection ;
    private long id;
    
    public Qusetion() throws UnknownHostException {//constructor
           mongo = new Mongo();
           db = mongo.getDB("qestionnaireonline");
           dbcollection = db.getCollection("question");
    }
    public void insertQuestion (String body){//to insert question
        dbcollection.insert(new BasicDBObject("body",body));
        id = dbcollection.find(new BasicDBObject("body",body)).getCursorId();  
    }
    public long getID (){//get _id when insert 
        return id;
    }
    public void deleteQuestion (String body){//delete question
        dbcollection.remove(new BasicDBObject("body",body));
    
    }
    public void updateQuestion (String body_old , String body_new){//update question
        dbcollection.findAndModify(new BasicDBObject("body",body_old), new BasicDBObject("body",body_new));
    }
    public void findQuestion (){
        //
    }
}
