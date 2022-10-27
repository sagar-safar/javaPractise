


class Pen{
    String color;
    String type;

  //  Pen(){    //  non-paramaterized constructor
    //   System.out.println("object created");
   // }

   Pen(String color,String type){
    this.color = color;
    this.type = type;
   }


    
    public void write() {
        System.out.println("writing something");
    }
    
    public void printColor() {
        System.out.println(this.color);
        
    }
    
}






public class Oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen("blue","gel");
       
        pen1.write();
        pen1.printColor();
       

        
    }
    
}
