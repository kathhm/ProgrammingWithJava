package programmingWithAbstraction;

public class Rectangle extends Shape{
    private float width;
    private float height;

    public Rectangle(float w, float h){
        this.width = w;
        this.height = h;
    }

    @Override
    public float calculateArea(){
        float area = this.width * this.height;
        return area;
    }

    @Override
    public void draw(){
        System.out.println("Drawing rectangle with width= " + this.width + " height= " + this.height);
    }

    @Override
    public void lineColor(String color){
        System.out.println("The chosen color for this rectangle is: " + color);
    }

    @Override
    public float calculatePerimeter(){
        float perimeter = (this.height * 2) + (this.width * 2);
        return perimeter;
    }
}