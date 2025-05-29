package programmingWithAbstraction;

public class Circle extends Shape{
    private float radius;

    public Circle(float r){
        this.radius = r;
    }

    @Override
    public float calculateArea(){
        float area = (float)Math.PI * this.radius *this.radius;
        return area;
    }

    @Override
    public void draw(){
        System.out.println("Drawing Circle with radius=" + this.radius);
    }

    @Override
    public void lineColor(String color){
        System.out.println("The circle's color is: " + color);
    }

    @Override
    public float calculatePerimeter(){
        float perimeter = (float)(2 * Math.PI * this.radius);
        return perimeter;
    }
}
