
public class Linea{
    private Punto begin = new Punto();
    private Punto end = new Punto();
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public Linea(){
        super();
    }
    public Linea(int x1, int y1, int x2, int y2){
        super();
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    public Linea(Punto begin, Punto end){
        super();
        this.begin=begin;
        this.end=end;
    }
    public Punto getBegin(){
        return begin;
    }
    public void setBegin(Punto begin){
        this.begin=begin;
    }
    public Punto getEnd(){
        return end;
    }
    public void setEnd(Punto end){
        this.end=end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public int[] getBeginXY(){
        return begin.getXY();
    }
    public void setBeginXY(int x, int y){
        begin.setXY(x, y);
    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public int[] getEndXY(){
        return end.getXY();
    }
    public void setEndXY(int x, int y){
        end.setXY(x, y);
    }
    public String toString(){
        return "[begin=("+begin.getX()+", "+begin.getY()+"), end=("+end.getX()+", "+end.getY()+")]";
    }
    public double getLength(){
        return Integer.toString(Math.sqrt(Math.pow((begin.getX()-end.getX()), 2)+Math.pow((begin.getY()-end.getY()), 2)));
    }
}
