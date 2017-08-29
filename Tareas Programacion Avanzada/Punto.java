
public class Punto extends Linea {
    private int x = 0;
    private int y = 0;
    private int[] XY = new int[2];
    public Punto(){
        super();
    }
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public String toString(){
        return "("+Integer.toString(x)+", "+Integer.toString(y)+")";
    }
    public int[] getXY(){
        return XY;
    }
    public void setXY(int x, int y){
        XY[0]=x;
        XY[1]=y;
    }
    public double distance(int x1, int y1){
        double distan;
        distan=Math.sqrt(Math.pow((x1-x), 2)+Math.pow((y1-y), 2));
        return distan;
    }
    public double distance(Punto another){
        double distan;
        distan=Math.sqrt(Math.pow((another.getX()-x), 2)+Math.pow((another.getY()-y), 2));
        return distan;
    }
    public double distance(){
        double distan;
        distan=Math.sqrt(Math.pow((0-x), 2)+Math.pow((0-y), 2));
        return distan;
    }
    
}
