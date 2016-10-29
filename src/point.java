/**
 * Created by Fatmi on 28/10/2016.
 */
public class point {
    private double x;
    private double y;
    public point(){/*x=0; y=0*/
        this.x=0;
        this.y=0;
    }
    public point (double x){
        this.x=x;
        this.y=x;
    }
    public point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public point symetrie() {
        return new point(-x, y);
    }
    public void main(String [] args){
        point a= new point(2.0,4.5);
        System.out.println("cordonnes("+a.getX()+","+a.getY()+")");
    }
}
