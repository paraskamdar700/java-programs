public class objcla {
    
    class pen {
        String color;
        int tip;
        void setcolor(String newcolor) {
           color = newcolor;
        }
    
        void settip(int newtip) {
           tip = newtip;
        }
    }
    class student {
        String name;
        int age;
        float percentage;
        
        void calcpercentage(int math, int science, int english) {
            percentage = (math + science + english) / 3;
        }
        
    }   
    class account {
        public String username;
        private int password;
        public account(String username){
            this.username=username;
        }
        
        public void setpass(int pass) {
            password = pass;
            
        }
        
    }
 
    
    
    public static void main(String[] args) {
        pen p1 = new pen();// created a pen obj called p1
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(6);
        System.out.println(p1.tip);
        
        student p2 = new student();
        p2.calcpercentage(50, 50, 50);
        System.out.println(p2.percentage);
        
        account myacc = new account("ram");
        myacc.setpass(1233);
        
    }

}

