public class inheritance {
    class animal{
        void eat(){
            System.out.println("eats");
        }
        void breath(){
            System.out.println("breath");
        }

    }
    class fish extends animal{
        void swim(){
            System.out.println("swim");
        }
    }    
    public static void main(String[] args){
        fish ob= new fish();
        ob.breath();

     
    }
}
