/**
 *
 * @author Vamsheeth
 */
package quad;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@RequestScoped
@Named
public class quad
{
    private int a,b,c; 
    private String r1,r2;
    private String nature;
    
    public int getA(){return a;}
    public void setA(int a){this.a=a;}
    
    public int getB(){return b;}
    public void setB(int b){this.b=b;}
    
    public int getC(){return c;}
    public void setC(int c){this.c=c;}
    
    public String getNature(){return nature;}
    public void setNature(String nature) {this.nature = nature;}
    
    public String getR1(){return r1;}
    public void setR1(String r1){this.r1=r1;}
    
    public String getR2(){return r2;}
    public void setR2(String r2){this.r2=r2;}
    
    public void calcRoots()
    {
        
        
        double discriminant = ((b*b)-(4*a*c));
        if(discriminant < 0)
        {
            nature = "Roots are imaginary";
            r1= b + " + " +Math.sqrt(Math.abs(discriminant)) + "i / " + (2 * a);
            r2= b +" - "+ Math.sqrt(Math.abs(discriminant)) + "i / " + (2 * a);
        }
        else if (discriminant == 0)
        {
            nature = "Roots are real and equal";
            double root01=((-b)+ Math.sqrt((b*b)-4*a*c))/(2*a);
            r1 = String.valueOf(root01);
            double root02=((-b)- Math.sqrt((b*b)-4*a*c))/(2*a);
        r2 = String.valueOf(root02);
        }
        else 
        {
            nature = "Roots are real and unique";
            double root01=((-b)+ Math.sqrt((b*b)-4*a*c))/(2*a);
            r1 = String.valueOf(root01);
            double root02=((-b)- Math.sqrt((b*b)-4*a*c))/(2*a);
            r2 = String.valueOf(root02);
        }
    }
    public quad() 
    {
        
    }
    
}
