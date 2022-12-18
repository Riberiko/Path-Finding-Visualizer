public class Vertex {

    public enum STATUS{
        VALID, INVALID;
    }

    private Point point;
    private STATUS status;

    private Vertex[] neightbors;
    private int numNeighbors;

    private int cost;

    public Vertex(int x, int y, STATUS status){
        point = new Point(x, y);
        this.status = status;
        neightbors = new Vertex[8];  //each cell can only have a maximum of 8 neighbors
        numNeighbors = 0;
    }

    public void addNeighbor(Vertex neighbor){
        neightbors[numNeighbors] = neighbor;
        numNeighbors += 1;
    }

    public void setStatus(STATUS newStatus){
        status = newStatus;
    }

    public Vertex[] getNeightbors(){
        return neightbors;
    }

    public int getCost(){
        return cost;
    }

    public Point getPoint(){
        return point;
    }

    public int getNumNeighbors(){
        return numNeighbors;
    }

    @Override
    public String toString(){
        return "("+point.getX()+", "+point.getY()+")";
    }

}
