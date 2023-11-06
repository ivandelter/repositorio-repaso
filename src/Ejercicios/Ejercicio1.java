class Ejercicio1{

    public static void main(String[] args) {

        System.out.println("Imprimiendo del uno al cuatro...");

        for(int i = 1; i <= 4; i++){
            System.out.println(i);
        }

        int num = 10;
        System.out.println("Se va a generar 5 números entre 0 y 20 y se comparará para saber si es menor o mayor a " + num);

        for(int i = 1; i <= 5; i++){
            int random = (int)Math.random() * 20;
            if(random > num){
                System.out.println(random " es mayor a " + num);
            } else if(random < num){
                System.out.println(random " es menor a " + num);
            }else{
                System.out.println(random + " y " + num + " son igaules.");
            }
        }

        System.out.println("Saliendo...");

    }

}