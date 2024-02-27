public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {10,11,12}; //toda variable primitiva siempre se pasa por valor

        System.out.println("iniciamos el metodo main");
        for(int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes de llmar el metodo test");
        test(edad);
        System.out.println("Después de llamar el metodo test" );
        for(int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println(" finalizamos el metodo main con los datos del arreglo modificados  ");
    }

    public static void test(int[] edadArr){
        System.out.println(" iniciamos el metofo test " );
        for(int i = 0; i < edadArr.length; i++){
            edadArr[i] = edadArr[i] + 20;

        }
        System.out.println("Finaliza con el metofo test ");
    }
}
