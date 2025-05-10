public class Vehiculo {
    private String codigo; // Código único del vehículo
    private String marca; // Marca del vehículo
    private String tipo; // Tipo de vehículo (Auto, Camioneta, Motocicleta)
    private int modelo; // Año del modelo
    private double kilometraje; // Kilometraje del vehículo

    // Constructor de la clase Vehiculo
    public Vehiculo(String codigo, String marca, String tipo, int modelo, double kilometraje) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.kilometraje = kilometraje; // Se corrige  el error con la asignación correcta "kilometraje"
    }

    // Métodos getter para obtener los valores de los atributos
    public String getCodigo() {
        return codigo; // Se reemplaza ******* con "codigo" que es el atributo correcto
    }

    public String getMarca() {
        return marca; // Se reemplaza ******* con "marca" que es el atributo correcto
    }

    public String getTipo() {
        return tipo; // Se reemplaza ******* con "tipo" que es el atributo correcto
    }

    public int getModelo() {
        return modelo; // Se reemplaza ******* con "modelo" que es el atributo correcto
    }

    public double getKilometraje() {
        return kilometraje; // Se reemplaza ******* con "kilometraje" que es el atributo correcto
    }

    // Método toString para representar la información del vehículo en texto
    @Override
    public String toString() {
        return "[Codigo: " + codigo + ", Marca: " + marca + ", Tipo: " + tipo + ", Modelo: " + modelo + ", Kilometraje: " + kilometraje + "]";
    }
}
// Clases derivadas de Vehiculo
class Auto extends Vehiculo {
    // Constructor de la clase Auto
    public Auto(String codigo, String marca, int modelo, double kilometraje) {
        super(codigo, marca, "auto", modelo, kilometraje); // Llama al constructor de Vehiculo, Se corrige el tercer argumento "auto"
    }
}

class Camioneta extends Vehiculo {
    // Constructor de la clase Camioneta
    public Camioneta(String codigo, String marca, int modelo, double kilometraje) {
        super(codigo, marca, "Camioneta", modelo, kilometraje); // Se corrigen los argumentos
    }
}

class Motocicleta extends Vehiculo {
    // Constructor de la clase Motocicleta
    public Motocicleta(String codigo, String marca, int modelo, double kilometraje) {
        super(codigo, marca, "Motocicleta", modelo, kilometraje); // Se corrigen los argumentos
    }
}
