public class Runner {
    public static void main(String[] args){
        Hen RussHen = new Hen(){
           @Override
           public void description(){
              System.out.println("Я курица из России.");
          }
        };

        Hen MoldovanHen = new Hen(){
            @Override
            public void description(){
                System.out.println("Я курица из Молдовы.");
            }
        };

        Hen BelarusHen = new Hen(){
            @Override
            public void description(){
                System.out.println("Я курица из Беларуси.");
            }
        };

        RussHen.description();
        MoldovanHen.description();
        BelarusHen.description();
    }
}
