public abstract class Shape { // khai báo một abstract class
    // Có thể khai báo thuộc tính, phương thức, contructor như một lớp bình thường

    private String color;
    public Shape(String color){
        this.color = color;
    }
    public abstract double getS(); // Khai báo một phương thức abstract (phải nẳm trong lớp abstract)
    public abstract double getY();
    public Shape(){
    }
    public String getColor(){ // phương thức non abstract
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
