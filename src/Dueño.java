public class Dueno {
    int edadAnos
    String nombreDueno="";
    double alturaDueno;
    public String MayorMenor(){
        String my="";
        if (edadAnos>=18){
           my="Es Mayor de Edad" ;
            System.out.print(my);

        }else{
            my="Es menor de Edad";
            System.out.print(my);
        }
    }

}
