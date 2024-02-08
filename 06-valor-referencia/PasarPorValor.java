public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10; //toda variable primitiva siempre se pasa por valor

        System.out.println("iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println("Finaliza el metodo main con i (se mantiene igual) = " + i);
    }

    public static void test(int i){
        System.out.println(" iniciamos el metofo test con i = " + i);
        i = 35;
        System.out.println("Finaliza con el metofo test con i = " + i);
    }
}
