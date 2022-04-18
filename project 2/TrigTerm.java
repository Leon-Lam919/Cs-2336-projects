import java.lang.Math;
// This class will take the part of the 

public class TrigTerm extends LinearTerm{

    private TrigType r;
    private int x;

    public TrigTerm(int x, TrigType r){
        super(x);
        setX(x);
        setTrig(r);
    } 

    public void setX(int x) {
        this.x = x;    
    }

    public void setTrig(TrigType r){
        this.r = r;
    }

    public double getX(){
        return x;
    }

    public TrigType getTrig(){
        return r;
    }
    
    public double evaluate(double term){
        TrigType t = getTrig();
        double num = getX();
        double ans = 0;

        if (t == TrigType.COSINE){
            ans = num * Math.cos(Math.toRadians(term));
            return ans;
        }
        else if (t == TrigType.SINE){
            ans = num * Math.sin(Math.toRadians(term));
            return ans;
        }
        return -1;
    }
    
    public ITerm derivative(){
        double x = getX();
        TrigType t = getTrig();
        TrigTerm trig = new TrigTerm((int)x, t);

        return trig;
    }

    public String toString(){
        if (getTrig() == TrigType.COSINE){
            if (getX() < 0){
            return "+ " + getX()*-1 + "sin(x)" ;
            }
            else {
                return "- " + getX() + "sin(x) ";
            }
        }
        else if (getTrig() == TrigType.SINE){
            if (getX() < 0){
                return "- " + getX()*-1 + "cos(x) ";
            }
            else {
                return "+ " + getX() + "cos(x) ";
            }
        }
        return "";
    }

}
