package problemstatement1_4;

import java.util.Scanner;

class RectangleModify {
    int length; 
    int width; 
    int area; 
    int parameter;
    
    public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	
    public RectangleModify()
    {
    	length = 1;
    	width= 1;
    }

    void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = s.nextInt();
        System.out.print("Enter width of rectangle: ");
        width = s.nextInt();
    }
    
    void  areaRectangle()
    {
        area = length * width;
       
    }
 
     void  perimeterRectangle()
    {
    	 parameter = 2*(length + width);
       
    }

    void display() {
    	if(length>0 && length<20)
        {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Parameter of Rectangle = " +parameter);}
       
        }

    public static void main(String args[]) {
    	
        RectangleModify r1 = new RectangleModify();
        r1.input();
        r1.areaRectangle();
        r1.perimeterRectangle();
        r1.display();
        RectangleModify r2 = new RectangleModify();
        r2.input();
        r2.areaRectangle();
        r2.perimeterRectangle();
        r2.display();
        RectangleModify r3 = new RectangleModify();
        r3.input();
        r3.areaRectangle();
        r3.perimeterRectangle();
        r3.display();
        RectangleModify r4 = new RectangleModify();
        r4.input();
        r4.areaRectangle();
        r4.perimeterRectangle();
        r4.display();
        RectangleModify r5 = new RectangleModify();
        r5.input();
        r5.areaRectangle();
        r5.perimeterRectangle();
        r5.display();
    	
    }
}
