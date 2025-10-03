public class Main{
    // Metodo principal de la aplicacion
    // Paramas args -- Argumento de linea de comandos (no se usa en esta aplicacion)
    public static void main(String[] args) {
        // == Tipo de Datos Wrapper en Javaa ==

        //Byte
        Byte edad = 25;
        System.out.println("Byte edad = " + edad);
        System.out.println("Byte MAX_VALUE = " + Byte.MAX_VALUE);

        // Short
        Short anio = 2025;
        System.out.println("\nShort ano = " + anio);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);

        // Integer
        Integer poblacionCiudad = 1_500_000;
        System.out.println("\nInteger poblacion ciudad = " + poblacionCiudad);
        System.out.println("Integer parseInt(\"123\") = " + Integer.parseInt( "123"));   // Sytring -> int
        System.out.println("Integer toHexString(255) = " + Integer.toHexString( 255));   // Decimal -> Hex

        // Long
        Long poblacionMundial = 8_000_000_000L;
        System.out.println("\nLong poblacion mundial = " + poblacionMundial);
        System.out.println("Long compare(100L, 200L) = " + Long.compare(100L, 200L));

        // Float
        Float precio = 99.99f;
        System.out.println("\nFloat precio = " + precio);
        System.out.println("Float isNaN(0.0f / 0.0f) = " + Float.isNaN( 0.0f / 0.0f));

        // Double
        Double  pi = 3.141592653589793;
        System.out.println("\nDouble pi = " + pi );
        System.out.println("Dauble valueOf (\"2.718\") = " + Double.valueOf( "2.78"));

        // Character
        Character inicial = 'C';
        System.out.println("\nCharacter inicial = " + inicial);
        System.out.println("Character.isLetter('9') = " + Character.isLetter( '9'));
        System.out.println("Character.toLowerCase('A') = " + Character.toLowerCase( 'A'));

        //Boolean
        Boolean esJavaGenial = Boolean.TRUE;
        System.out.println("\nBoolean es java genial = " + esJavaGenial);
        System.out.println("Boolean.parseBoolean(\"False\") = " + Boolean.parseBoolean( "false"));

        // === Operaciones con Wrappers ===
        System.out.println("\n === Operaciones con Wrappers ===");

        Integer x = 10;
        Integer y = 20;


        // Autoboxing y unboxing
        int suma = x + y;    // detras de camaras se desampaqueta (unboxing)
        System.out.println("Suma (X + Y) = " + suma);

        // Comparaciones
        System.out.println("X.compareTo(y) = " + x.compareTo(y));   //-1
        System.out.println("X.equals(y) = " + x.equals(y));      // False

        // Conversion de tipos
        String str = x.toString();
        System.out.println("X.toString() = " + str);

        int numero = Integer.parseInt( "1234");
        System.out.println("Integer.parseInt(\"1234\") = " + numero);


    }
}