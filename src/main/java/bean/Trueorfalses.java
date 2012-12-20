
package bean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yan
 */
public class Trueorfalses {
    private String body;
    private boolean answer;
    private int judge = 1;
    
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

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    
}
