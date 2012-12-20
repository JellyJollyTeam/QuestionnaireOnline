/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yan
 */
package bean;
public class Shortanswers {
    private String body;
    private String answer;
    private int judge = 4;

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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
}
