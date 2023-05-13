package uni.edu.pe;

import java.util.Objects;

public class Empleado {
    private String dni;
    private Posicion posicion;

    public Empleado(String dni, Posicion posicion) {
        this.dni = dni;
        this.posicion = posicion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return dni.equalsIgnoreCase(empleado.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return dni;
    }
}
