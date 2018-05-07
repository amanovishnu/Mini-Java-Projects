package triangle;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @Vamsheeth
 */
@Named(value = "triangle")
@RequestScoped
public class triangle {
    private double sideA,sideB,sideC,result1,result2,result3,result4,result5;
    public double getSideA () {return sideA;}
    public void setSideA (double sideA) {this.sideA=sideA;}
    public double getSideB () {return sideB;}
    public void setSideB (double sideB) {this.sideB=sideB;}
    public double getSideC () {return sideC;}
    public void setSideC (double sideC) {this.sideC=sideC;}
    public double getResult1 () {return result1;}
    public void setResult1 (double result1) {this.result1=result1;}
    public double getResult2 () {return result2;}
    public void setResult2 (double result2) {this.result2=result2;}
    public double getResult3 () {return result3;}
    public void setResult3 (double result3) {this.result3=result3;}
    public double getResult4 () {return result4;}
    public void setResult4 (double result4) {this.result4=result4;}
    public double getResult5 () {return result5;}
    public void setResult5 (double result5) {this.result5=result5;}
    
    public void AngleA() {result1=(Math.acos(((sideA*sideA)+(sideC*sideC)-(sideB*sideB))/(2*sideA*sideC))*(180/Math.PI));}
    public void AngleB() {result2=(Math.acos(((sideA*sideA)+(sideB*sideB)-(sideC*sideC))/(2*sideA*sideB))*(180/Math.PI));}
    public void AngleC() {result3=(Math.acos(((sideB*sideB)+(sideC*sideC)-(sideA*sideA))/(2*sideB*sideC))*(180/Math.PI));}
    public void Area () {result4=(Math.sqrt(((sideA+sideB+sideC)/2)*(((sideA+sideB+sideC)/2)-sideA)*(((sideA+sideB+sideC)/2)-sideB)*(((sideA+sideB+sideC)/2)-sideC)));}
    public void Perimeter () {result5=(sideA+sideB+sideC);}
    
    public String getResponse () {
        if (((sideA+sideB)>sideC) && ((sideA+sideC)>sideB) && ((sideB+sideC)>sideA))
            return "It is a triangle";
        else
            return "It is not a triangle";
    
    }

    public triangle() {}
    
}
