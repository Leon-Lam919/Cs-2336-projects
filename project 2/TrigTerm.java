import java.lang.Math;
// This class will take the part of the 

public class TrigTerm extends LinearTerm{

    private TrigType r;
    private double x;

    public TrigTerm(int x, TrigType r){
        super(x);
        setTrig(r);
    } 

    public void setX(double x) {
        Math.toRadians(x);
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

    @Override
    public String toString(){
        return "";
    }


    public double evaluate(double term){
        TrigType t = getTrig();
        double num = getX();
        double ans = 0;

        if (t == TrigType.COSINE){
            ans = num * Math.cos(term);
            if (ans < 0){
                return ans * -1;
            }
            return ans;
        }
        else if (t == TrigType.SINE){
            ans = num * Math.sin(term);
            if (ans < 0){
                return ans * -1;
            }
            return ans;
        }
        return ans;
    }

}
