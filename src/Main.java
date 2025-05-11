public class Main {
    public static void main(String[] args) {
        // Crear un concesionario
        Concesionario concesionario = new Concesionario();

        // Agregar vehículos al inventario
        concesionario.agregarVehiculo(new Vehiculo("001", "Toyota", "Auto", 2020, 0));
        concesionario.agregarVehiculo(new Vehiculo("002", "Chevrolet", "Camioneta", 2018, 50000));
        concesionario.agregarVehiculo(new Vehiculo("003", "Suzuki", "Motocicleta", 2019, 10000));

        // Mostrar el inventario
        concesionario.mostrarInventario();

        // Realizar una venta
        concesionario.realizarVenta("002", 25000, "Pérez", "Juan", "12345678");

        // Mostrar el inventario y las ventas
        concesionario.mostrarInventario();
        concesionario.mostrarVentas();
    }
}

/* Comentario Final (CONCLUSION)

Finalmente en base a todo lo desarrollado en la actividad y los procedimientos aplicados podemos decir que hay diferentes formas de aprender peros siempre enriquecedoras,
haciendo uso correcto de plataformas que mejoran nuestras habilidades y fortalecen los conocimientos dentro de lo que es el mundo de la programación, el uso de GitGub nos
permitió explorar nuevas herramientas y opciones para programar y modificar código en lenguaje JAVA, aprendiendo y recordando términos y secuencias que podemos usar para crear
y modificar funciones ejecutando de manera segura. Todo esto en función con la temática vista en las clases nos permite comprender que muchas plataformas con la IA, son
herramientas que mejoran nuestras prácticas a la hora de trabajar con distintos lenguajes de programación y así mismo permiten ampliar nuestro conocimiento mejorando la calidad
de aprendizaje ya sea de manera colectiva o individual, lo cual lo hace aún más interesante ya que aprovechando la herramienta como el internet podemos mejorar capacidades
desde el aprendizaje explorando nuevas herramientas con un solo fin conocer, comprender y aprender.
*/