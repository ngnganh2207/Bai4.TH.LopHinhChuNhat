public class Rectangle {
    int width;
    int height;
    public Rectangle(){

    }
    public Rectangle(int width, int height){
        this.width= width;
        this.height=height;
    }
    public int getArea(){
        return this.width*this.height;
    }
    public int getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "Rectangle{width="+width+",height="+height+"}";
    }
}

