public class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange() {
        this.width = 1.0;
        this.height = 1.0;
        this.color = "";
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Rectange(Rectange p) {
        this.width = p.width;
        this.height = p.height;
        this.color = p.color;
    }

    double getWidth() {
        return this.width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getHeight() {
        return this.height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    String getColor() {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }

    void setColor(String color) {
        this.color = color;
    }

    double findArea(Rectange p) {
        return p.width * p.height;
    }

    double findArea() {
        return this.width * this.height;
    }

    double findPerimeter(Rectange p) {
        return (p.width + p.height)*2;
    } 

    double findPerimeter() {
        return (this.width + this.height) * 2;
    }
}
