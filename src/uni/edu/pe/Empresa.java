package uni.edu.pe;

import com.sun.jdi.request.InvalidRequestStateException;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

public class Empresa {
    private String nombre;
    private Set<Scooter> scooter;
    private List<String> errores;
    private Map<Empleado, Set<Integer>> scooters;

    public Empresa(String nombre, String cadena) {
        scooter = new TreeSet<>();
        this.nombre = nombre;
        String cad = "";
        String empresa = null;
        int codigo = 0;
        double lo = 0;
        double la = 0;
        double autonom = 0;
        int cont = 1;
        for (int i=0; i<cadena.length(); i++){
            if (cadena.charAt(i) != ' ') {
                cad = cad + cadena.charAt(i);
            }
            if (cadena.charAt(i) == ';' && cont == 1) {
                empresa = cad;
                cont++;
                cad="";
            }
            if (cadena.charAt(i) == ';' && cont == 2) {
                codigo = Integer.valueOf(cad);
                cont++;
                cad="";
            }
            if (cadena.charAt(i) == ';' && cont == 3) {
                lo = Double.valueOf(cad);
                cont++;
                cad="";
            }
            if (cadena.charAt(i) == ';' && cont == 4) {
                la = Double.valueOf(cad);
                cont++;
                cad="";
            }
            if (cadena.charAt(i) == '#' && cont == 5) {
                autonom = Double.valueOf(cad);
                cont=0;
                cad="";
                Posicion pos = new Posicion(lo,la);
                Scooter sco = new Scooter(empresa,codigo,pos,autonom);
                scooter.add(sco);
            }
        }
    }
    public void asignaScooterEmpleado (Empleado empleado, Set<Integer> codScooter ){
        Set<Integer>
        for (Integer )
    }
}

