public class Map {

    private int width;
    private int height;
    private Vertex[] map;

    public Map(int width, int height){
        this.width = width;
        this.height = height;
        map = new Vertex[width*height];
        initializeMap();
        setUpNeighbors();
    }

    public void initializeMap(){
        for(int i = 0; i < map.length; i++){
            map[i] = new Vertex(i%width, i/height, Vertex.STATUS.VALID);
        }
    }

    public void setUpNeighbors(){
        Vertex current;

        for(int i = 0; i < map.length; i++){

            current = map[i];

            if(current.getPoint().getY()-1 != -1) {
                if(current.getPoint().getX()-1 != -1) current.addNeighbor(getVertex(current.getPoint().getX() - 1, current.getPoint().getY() - 1));    //top left
                current.addNeighbor(getVertex(current.getPoint().getX(), current.getPoint().getY() - 1));    //top center
                if(current.getPoint().getX()+1 != width) current.addNeighbor(getVertex(current.getPoint().getX() + 1, current.getPoint().getY() - 1));    //top right
            }

            if(current.getPoint().getX()-1 != -1) current.addNeighbor(getVertex(current.getPoint().getX()-1, current.getPoint().getY()));    //center left
            if(current.getPoint().getX()+1 != width) current.addNeighbor(getVertex(current.getPoint().getX()+1, current.getPoint().getY()));    //center right

            if(current.getPoint().getY()+1 != height) {
                if(current.getPoint().getX()-1 != -1) current.addNeighbor(getVertex(current.getPoint().getX() - 1, current.getPoint().getY() + 1));    //bottom left
                current.addNeighbor(getVertex(current.getPoint().getX(), current.getPoint().getY() + 1));    //bottom center
                if(current.getPoint().getX()+1 != width) current.addNeighbor(getVertex(current.getPoint().getX() + 1, current.getPoint().getY() + 1));    //bottom right
            }

        }

    }

    public void setStatus(int x, int y, Vertex.STATUS newStatus){
        getVertex(x,y).setStatus(newStatus);
    }

    public Vertex getVertex(int x, int y){
        return map[width*y+x];
    }

    public Vertex[] getNeighbors(int x, int y){
        return map[width*y+x].getNeightbors();
    }

}
