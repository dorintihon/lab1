//Dorin Tihon
public class bedThickness {
     private int  bedThickness;
   private String thicknessName;

    public void setSlim(){
        setThicknessName("Slim");
    }

    public void setThick(){
        setThicknessName("Thick");
    }

    public int getBedThickness() {
        return bedThickness;
    }

    public void setBedThickness(int bedThickness) {
        this.bedThickness = bedThickness;
    }

    public String getThicknessName() {
        return thicknessName;
    }

    public void setThicknessName(String thicknessName) {
        this.thicknessName = thicknessName;
    }
}
