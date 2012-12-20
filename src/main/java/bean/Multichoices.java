package bean;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yan
 */
public class Multichoices {
    private String body ;
    private ArrayList options = new ArrayList ();
    private ArrayList answer = new ArrayList ();
    private int judge = 3 ;

    public int getJudge() {
        return judge;
    }

    public void setJudge() {
        
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ArrayList getOptions() {
        return options;
    }

    public void setOptions(ArrayList options) {
        this.options = options;
    }

    public ArrayList getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList answer) {
        this.answer = answer;
    }
    
}
