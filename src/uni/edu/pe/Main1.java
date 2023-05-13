package uni.edu.pe;

import java.util.Set;
import java.util.TreeSet;
import uni.edu.pe.Empleado;
import uni.edu.pe.Empresa;
import uni.edu.pe.Posicion;

public class Main1 {
    public static void main(String [] args){
        String lineaAnalizar = "Campero;100;-4.4204216;36.7182771;3.0#Aliquindoi;101;-4.4204216;36.7182771;2.0#aliquindoi;101;-4.4204216;36.7182771;2.0#Aliquindoi;100;-4.4495993;36.7015323;5.0#Aliquindoi;102;-4.4495993;36.7015323#Biznaga;100;-4.4204216;36.7182771;1.0#Aliquindoi;103;-4.4495993;36.7015323;hola#Aliquindoi;104;-4.4495993;36.7015323;-8.5#Aliquindoi;105;-4.4150382;36.7306184;7.0#Aliquindoi;102;-4.4150382;36.7306184;5.0#Aliquindoi;110;-4.4356238;36.9404817;4.0";
        Empresa empresa = new Empresa("Aliquindoi", lineaAnalizar);

        System.out.println(empresa);

        Empleado e1 = new Empleado("11222333X",
                new Posicion(-4.4204216, 36.7182771));
        Empleado e2 = new Empleado("99888777H",
                new Posicion(-4.4150382, 36.7306184));

        Set<Integer> c1 = new TreeSet<>();
        c1.add(100);
        c1.add(105);
        c1.add(102);
        c1.add(8);
        empresa.asignaScootersEmpleado(e1, c1);

        Set<Integer> c2 = new TreeSet<>();
        c2.add(102);
        c2.add(110);
        c2.add(7);
        empresa.asignaScootersEmpleado(e2, c2);

        Set<Integer> c3 = new TreeSet<>();
        c3.add(105);
        c3.add(110);
        c3.add(101);
        empresa.asignaScootersEmpleado(e1, c3);

        System.out.println(empresa);

        empresa.modificaScooter(100,
                new Posicion(-4.5444444, 36.8011111), 10);

        System.out.println(empresa);

    }
}
/**
 * Expected output:
 *
 * <pre>
 Aliquindoi
 Scooters: [(Empresa: Aliquindoi; Codigo:100; Lat: -4.4495993; Lon: 36.7015323: Autonomia: 5.0), (Empresa: Aliquindoi; Codigo:101; Lat: -4.4204216; Lon: 36.7182771: Autonomia: 2.0), (Empresa: Aliquindoi; Codigo:102; Lat: -4.4150382; Lon: 36.7306184: Autonomia: 5.0), (Empresa: Aliquindoi; Codigo:105; Lat: -4.4150382; Lon: 36.7306184: Autonomia: 7.0), (Empresa: Aliquindoi; Codigo:110; Lat: -4.4356238; Lon: 36.9404817: Autonomia: 4.0)]
 Errores: [Error, dato de tipo incorrecto en linea: Aliquindoi;102;-4.4495993;36.7015323, Error, dato de tipo incorrecto en linea: Aliquindoi;103;-4.4495993;36.7015323;hola, Error, dato de tipo incorrecto en linea: Aliquindoi;104;-4.4495993;36.7015323;-8.5]
 Empleados: {}

 Aliquindoi
 Scooters: [(Empresa: Aliquindoi; Codigo:100; Lat: -4.4495993; Lon: 36.7015323: Autonomia: 5.0), (Empresa: Aliquindoi; Codigo:101; Lat: -4.4204216; Lon: 36.7182771: Autonomia: 2.0), (Empresa: Aliquindoi; Codigo:102; Lat: -4.4150382; Lon: 36.7306184: Autonomia: 5.0), (Empresa: Aliquindoi; Codigo:105; Lat: -4.4150382; Lon: 36.7306184: Autonomia: 7.0), (Empresa: Aliquindoi; Codigo:110; Lat: -4.4356238; Lon: 36.9404817: Autonomia: 4.0)]
 Errores: [Error, dato de tipo incorrecto en linea: Aliquindoi;102;-4.4495993;36.7015323, Error, dato de tipo incorrecto en linea: Aliquindoi;103;-4.4495993;36.7015323;hola, Error, dato de tipo incorrecto en linea: Aliquindoi;104;-4.4495993;36.7015323;-8.5]
 Empleados: {11222333X=[100, 101, 102, 105, 110], 99888777H=[110]}

 Aliquindoi
 Scooters: [(Empresa: Aliquindoi; Codigo:100; Lat: -4.5444444; Lon: 36.8011111: Autonomia: 10.0), (Empresa: Aliquindoi; Codigo:101; Lat: -4.4204216; Lon: 36.7182771: Autonomia: 2.0), (Empresa: Aliquindoi; Codigo:102; Lat: -4.4150382; Lon: 36.7306184: Autonomia: 5.0), (Empresa: Aliquindoi; Codigo:105; Lat: -4.4150382; Lon: 36.7306184: Autonomia: 7.0), (Empresa: Aliquindoi; Codigo:110; Lat: -4.4356238; Lon: 36.9404817: Autonomia: 4.0)]
 Errores: [Error, dato de tipo incorrecto en linea: Aliquindoi;102;-4.4495993;36.7015323, Error, dato de tipo incorrecto en linea: Aliquindoi;103;-4.4495993;36.7015323;hola, Error, dato de tipo incorrecto en linea: Aliquindoi;104;-4.4495993;36.7015323;-8.5]
 Empleados: {11222333X=[100, 101, 102, 105, 110], 99888777H=[110]}
 * </pre>
 */
