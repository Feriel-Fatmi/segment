/**
 * Created by Fatmi on 28/10/2016.
 */
public class segment extends point{ // y a pas un héritage ici un segment relie deux points par définition 
  
    public segment ( double  px,double py){
      point or =new point();
       point  p= new point(px,py);
    }
    public segment (double xm,double ym, double xh , double yh){
      point m= new point(xm,ym);
       point  h= new point(xh,yh);
    }
    public double distance() {
    double xm= m.getX();
    double ym= m.getY();
    double xh=h.getX();
    double yh=h.getY();
        return Math.sqrt((xh-xm)*(xh-xm)+(yh-ym)*(yh-ym));
    }
    public segment symetrie(){
        return new segment(xm,ym,-xp,-yp);
    }
    public void main(String[]args){
        segment d= new segment(1.0,2.0,5.0,6.0);
        System.out.println(+xm.getX()+","+ym.getY()","+xp.getX()+","+yp.getY()+);
    }
}
