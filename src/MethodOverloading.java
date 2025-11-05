public class MethodOverloading {
    void show(int x){
        System.out.println(x);
    }
    void show(String name){
        System.out.println(name);
    }

    void show(int x, String name){

    }
    void show(String name, int x){

    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.show("Sakshi");
        obj.show(5);
        obj.show("Rohini");
        obj.show(15);
    }
}
