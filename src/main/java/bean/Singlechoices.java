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
public class Singlechoices {
        private String body;
        private ArrayList options = new ArrayList ();
        private String answer;
        private int judge = 2;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

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

    public String getOption() {
        return answer;
    }

    public void setOption(String answer) {
        this.answer = answer;
    }
        
}
