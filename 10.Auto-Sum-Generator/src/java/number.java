/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Hitesh
 */
@Named(value = "number")
@SessionScoped
public class number implements Serializable {
    private int q1,q2,ans1,q3,q4,q5,q6,q7,q8,q9,q10,q11,q22,q33,q44,q55,q66,q77,q88,q99,q1010,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10;
    
    
    private String result,result2,result3,result4,result5,result6,result7,result8,result9,result10;

    public int getQ3() {
        return q3;
    }

    public void setQ3(int q3) {
        this.q3 = q3;
    }

    public int getQ4() {
        return q4;
    }

    public void setQ4(int q4) {
        this.q4 = q4;
    }

    public int getQ5() {
        return q5;
    }

    public void setQ5(int q5) {
        this.q5 = q5;
    }

    public int getQ6() {
        return q6;
    }

    public void setQ6(int q6) {
        this.q6 = q6;
    }

    public int getQ7() {
        return q7;
    }

    public void setQ7(int q7) {
        this.q7 = q7;
    }

    public int getQ8() {
        return q8;
    }

    public void setQ8(int q8) {
        this.q8 = q8;
    }

    public int getQ9() {
        return q9;
    }

    public void setQ9(int q9) {
        this.q9 = q9;
    }

    public int getQ10() {
        return q10;
    }

    public void setQ10(int q10) {
        this.q10 = q10;
    }

    public int getQ11() {
        return q11;
    }

    public void setQ11(int q11) {
        this.q11 = q11;
    }

    public int getQ22() {
        return q22;
    }

    public void setQ22(int q22) {
        this.q22 = q22;
    }

    public int getQ33() {
        return q33;
    }

    public void setQ33(int q33) {
        this.q33 = q33;
    }

    public int getQ44() {
        return q44;
    }

    public void setQ44(int q44) {
        this.q44 = q44;
    }

    public int getQ55() {
        return q55;
    }

    public void setQ55(int q55) {
        this.q55 = q55;
    }

    public int getQ66() {
        return q66;
    }

    public void setQ66(int q66) {
        this.q66 = q66;
    }

    public int getQ77() {
        return q77;
    }

    public void setQ77(int q77) {
        this.q77 = q77;
    }

    public int getQ88() {
        return q88;
    }

    public void setQ88(int q88) {
        this.q88 = q88;
    }

    public int getQ99() {
        return q99;
    }

    public void setQ99(int q99) {
        this.q99 = q99;
    }

    public int getQ1010() {
        return q1010;
    }

    public void setQ1010(int q1010) {
        this.q1010 = q1010;
    }

    public int getAns2() {
        return ans2;
    }

    public void setAns2(int ans2) {
        this.ans2 = ans2;
    }

    public int getAns3() {
        return ans3;
    }

    public void setAns3(int ans3) {
        this.ans3 = ans3;
    }

    public int getAns4() {
        return ans4;
    }

    public void setAns4(int ans4) {
        this.ans4 = ans4;
    }

    public int getAns5() {
        return ans5;
    }

    public void setAns5(int ans5) {
        this.ans5 = ans5;
    }

    public int getAns6() {
        return ans6;
    }

    public void setAns6(int ans6) {
        this.ans6 = ans6;
    }

    public int getAns7() {
        return ans7;
    }

    public void setAns7(int ans7) {
        this.ans7 = ans7;
    }

    public int getAns8() {
        return ans8;
    }

    public void setAns8(int ans8) {
        this.ans8 = ans8;
    }

    public int getAns9() {
        return ans9;
    }

    public void setAns9(int ans9) {
        this.ans9 = ans9;
    }

    public int getAns10() {
        return ans10;
    }

    public void setAns10(int ans10) {
        this.ans10 = ans10;
    }

    public String getResult2() {
        return result2;
    }

    public void setResult2(String result2) {
        this.result2 = result2;
    }

    public String getResult3() {
        return result3;
    }

    public void setResult3(String result3) {
        this.result3 = result3;
    }

    public String getResult4() {
        return result4;
    }

    public void setResult4(String result4) {
        this.result4 = result4;
    }

    public String getResult5() {
        return result5;
    }

    public void setResult5(String result5) {
        this.result5 = result5;
    }

    public String getResult6() {
        return result6;
    }

    public void setResult6(String result6) {
        this.result6 = result6;
    }

    public String getResult7() {
        return result7;
    }

    public void setResult7(String result7) {
        this.result7 = result7;
    }

    public String getResult8() {
        return result8;
    }

    public void setResult8(String result8) {
        this.result8 = result8;
    }

    public String getResult9() {
        return result9;
    }

    public void setResult9(String result9) {
        this.result9 = result9;
    }

    public String getResult10() {
        return result10;
    }

    public void setResult10(String result10) {
        this.result10 = result10;
    }

    public int getQ1() {
        return q1;
    }

    public void setQ1(int q1) {
        this.q1 = q1;
    }

    public int getQ2() {
        return q2;
    }

    public void setQ2(int q2) {
        this.q2 = q2;
    }

    public int getAns1() {
        return ans1;
    }

    public void setAns1(int ans1) {
        this.ans1 = ans1;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    /**
     * Creates a new instance of number
     */
    public number() {}
    
    public void check(){
    if((q1+q11)==(ans1))
    result="CORRECT";
    else
    result="INCORRECT";
    
    if((q2+q22)==(ans2))
    result2="CORRECT";
    else
    result2="INCORRECT";
    
    if((q3+q33)==(ans3))
    result3="CORRECT";
    else
    result3="INCORRECT";
    
    if((q4+q44)==(ans4))
    result4="CORRECT";
    else
    result4="INCORRECT";
    
    if((q5+q55)==(ans5))
    result5="CORRECT";
    else
    result5="INCORRECT";
    
    if((q6+q66)==(ans6))
    result6="CORRECT";
    else
    result6="INCORRECT";
    
    if((q7+q77)==(ans7))
    result7="CORRECT";
    else
    result7="INCORRECT";
    
    if((q8+q88)==(ans8))
    result8="CORRECT";
    else
    result8="INCORRECT";
    
    if((q9+q99)==(ans9))
    result9="CORRECT";
    else
    result9="INCORRECT";
    
    if((q10+q1010)==(ans10))
    result10="CORRECT";
    else
    result10="INCORRECT";
    
    
    }
    public void generate(){
    Random rn = new Random();
    q1=rn.nextInt(100)+1;
    q2=rn.nextInt(100)+1;
    q3=rn.nextInt(100)+1;
    q4=rn.nextInt(100)+1;
    q5=rn.nextInt(100)+1;
    q6=rn.nextInt(100)+1;
    q7=rn.nextInt(100)+1;
    q8=rn.nextInt(100)+1;
    q9=rn.nextInt(100)+1;
    q10=rn.nextInt(100)+1;
    q11=rn.nextInt(100)+1;
    q22=rn.nextInt(100)+1;
    q33=rn.nextInt(100)+1;
    q44=rn.nextInt(100)+1;
    q55=rn.nextInt(100)+1;
    q66=rn.nextInt(100)+1;
    q77=rn.nextInt(100)+1;
    q88=rn.nextInt(100)+1;
    q99=rn.nextInt(100)+1;
    q1010=rn.nextInt(100)+1;
    
    ans1=0;
    ans2=0;
    ans3=0;
    ans4=0;
    ans5=0;
    ans6=0;
    ans7=0;
    ans8=0;
    ans9=0;
    ans10=0;
    
    result="";
    result2="";
    result3="";
    result4="";
    result5="";
    result6="";
    result7="";
    result8="";
    result9="";
    result10="";
    
    
    }
    
    
}
