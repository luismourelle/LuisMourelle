class MiClase{
    int x;
    MiClase(int i){
      x=1;
    }
}

class Unidad2{
    public static void main(String args[]){
        MiClase obj1 = new MiClase(5); 
        System.out.println("x vale: "+ obj1.x);
        MiClase obj2 = new MiClase(9); 
        System.out.println("x vale: "+ obj2.x);
        MiClase obj3 = new MiClase(); 
        System.out.println("x vale: "+ obj3.x);
    }    
}   