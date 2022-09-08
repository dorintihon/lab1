//Dorin Tihon
public class bedSize {
    private int bedSizeX;
    private int bedSizeY;
     private String bedName;


    public void setQueen(){
        setBedName("Queen");
    }
    public void setKing(){
        setBedName("King");
    }
    public int getBedSizeX() {
        return bedSizeX;
    }

    public void setBedSizeX(int bedSizeX) {
        this.bedSizeX = bedSizeX;

    }

    public int getBedSizeY() {
        return bedSizeY;
    }

    public void setBedSizeY(int bedSizeY) {
        this.bedSizeY = bedSizeY;

    }

    public String getBedName() {
        return bedName;

    }

    public void setBedName(String bedName) {
        this.bedName = bedName;
    }


}
