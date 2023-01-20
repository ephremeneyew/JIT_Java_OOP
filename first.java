class Rectangle{
    float height;//fields of the Rectangle classs
    float width;
    //let's define a method/behaviours
    float calculateArea(float h, float w){
    return(h*w);

    }
    //there two types of constructors
    //1. Default constructor(you can modify the default constructor)- parameterless
    
    //2. Parameterized constructor
    public Rectangle(){//parameterless
    height = 1;
    width = 1;
    }
    public Rectangle(float h, float w){//parameterized
    height = h;
    width = w;
    }
    }
    public class first {
        public static void main(String[] args) {
        //there are three steps in object creating
        // 1 step declaration
        Rectangle rect1,rect2;
        //2 and 3 step instantiation(new) and initialization(constructor)
        rect1 = new Rectangle();//parameterless
        System.out.println("Rect 1 values!");
        System.out.println("Height : " + rect1.height);
        System.out.println("Width : " + rect1.width);
        System.out.println("Area : " + rect1.calculateArea(rect1.height,rect1.width));
        
        rect2 = new Rectangle(5,6);
        System.out.println("Rect 2 values!");
        System.out.println("Height : " + rect2.height);
        System.out.println("Width : " + rect2.width);
        System.out.println("Area : " + rect2.calculateArea(rect2.height,rect2.width));
        }
        }