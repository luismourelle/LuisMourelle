class Persona{
    private String nombre;
    private int edad;

    String getNombre(){
        return nombre;
    }
    void setNombre(String nom){
        nombre=nom;
    }
    int getEdad(){
        return edad;
    }
    void setEdad(int ed){
        if(ed<0){
            edad=0;
        }else{
            edad=ed;
    }
}

class Unidad2{
    public static void main(String[] args) {
        Persona persona1= new Persona();
        Persona persona2= new Persona();
    //persona1.nombre="Ana" //¡error!
        persona1.setNombre("Ana");
        persona1.setEdad(11);

        persona2.setNombre("Julio");
        persona2.setEdad(-16);

        System.out.println(persona1.getNombre()+" tiene "+ persona1.getEdad()+" años");
        System.out.println(persona2.getNombre()+" tiene "+ persona2.getEdad()+" años");
        }
    }
}