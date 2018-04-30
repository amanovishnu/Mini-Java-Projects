
//package jsfDemo;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "pizza")
@RequestScoped
public class Pizza
{
    private String firstName, mi, lastName, pnumber,email,addressline1,addressline2,city,pin,psize="Small";
    private String mushrooms="0", redpeppers="0", greenolives="0" , pineapple="0", broccoli="0", blackolives="0" ;
    public String getFirstName () {return firstName;}
    public void setFirstName (String firstName) {this.firstName = firstName;}
    public String getMi () {return mi;}
    public void setMi (String mi) {this.mi = mi;}
    public String getLastName () {return lastName;}
    public void setLastName (String lastName) {this.lastName = lastName;}
    public String getPnumber () {return pnumber;}
    public void setPnumber (String pnumber) {this.pnumber = pnumber;}
    public String getEmail () {return email;}
    public void setEmail (String email) {this.email = email;}
    public String getAddressline1 () {return addressline1;}
    public void setAddressline1 (String addressline1) {this.addressline1 = addressline1;}
    public String getAddressline2 () {return addressline2;}
    public void setAddressline2 (String addressline2) {this.addressline2 = addressline2;}
    public String getCity () {return city;}
    public void setCity (String city) {this.city = city;}
    public String getPin () {return pin;}
    public void setPin (String pin) {this.pin = pin;}
    
    public String getPsize () {return psize;}
    public void setPsize (String psize) {this.psize = psize;}
    
    public String getMushrooms () {return mushrooms;}
    public void setMushrooms (String mushrooms) {this.mushrooms = mushrooms;}
    
    public String getRedpeppers () {return redpeppers;}
    public void setRedpeppers (String redpeppers) {this.redpeppers = redpeppers;}
    
    public String getGreenolives () {return greenolives;}
    public void setGreenolives (String greenolives) {this.greenolives = greenolives;}
    
    public String getPineapple () {return pineapple;}
    public void setPineapple (String pineapple) {this.pineapple = pineapple;}
    
    public String getBroccoli () {return broccoli;}
    public void setBroccoli (String broccoli) {this.broccoli = broccoli;}
    
    public String getBlackolives () {return blackolives;}
    public void setBlackolives (String blackolives) {this.blackolives = blackolives;}
    
    public String getResponse ()throws NullPointerException
    {
        try{
            
        
        int a=0,d=0;
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@')
                a=1;
            if(email.charAt(i)=='.')
                d=1;
        }
        
        if (lastName == null)
           return "<br/>Invalid Name !!";
           // return "";
        
        else if(pnumber.length() !=10)
            return "<br/>Enter Valid Phone Number !!";
        
        else if(a==0 || d==0)
            return "<br/>Enter valid Email Id";
        
        else
        {
            double sum=0.0, ingr=0.0, base=0.0, gst;
            
            //String [] allIngredients=null;
            
               
            ingr = Double.parseDouble(mushrooms) + Double.parseDouble(redpeppers) + Double.parseDouble(greenolives) + Double.parseDouble(pineapple) + Double.parseDouble(broccoli) + Double.parseDouble(blackolives);
            
            if(psize.equals("Small"))
            base = 500;
            else if(psize.equals("Medium"))
            base = 750;
            if(psize.equals("Large"))
            base = 1000;
            sum = base + ingr;
            gst = 0.15 * sum;
            sum = sum+ gst;
            return "<center><br/>BILL<br/><br/>"+"Name:" +
                   firstName + " " + mi + " " + lastName + "<br/>" +
                //   "Gender: " + gender + "<br/>" +
                   //"Major: " + major + "<br/>" +
                    "Phone Number: " + pnumber + "<br/>"+
                    "Email Id: " + email + "<br/>"+
                    "Address: " + addressline1 + "<br/>"+
                    "         "+addressline2 + "<br/>"+
                    "City: " + city + "<br/>"+
                    "Pin: " + pin + "<br/>"+
                    "Pizza Size: " + psize + "<br/>"+
                    "Price of the pizza size : "+base + "<br/>"+
                    "Price of the ingredients choosen : "+ingr + "<br/>"+
                    "GST : "+gst + "<br/>"+
                    "Amount to be paid : " + sum
                    +"</center>";
        }
        
        }
        catch(Exception e){};
        return "";
    }

    public Pizza() {}
}
