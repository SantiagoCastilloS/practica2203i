package uni.edu.pe;

import java.util.Objects;

public class Scooter {
    private String empresa;
    private int codigo;
    private Posicion posicion;
    private double autonomía;

    public Scooter(String empresa, int codigo, Posicion posicion, double autonomía) {
        if ( codigo < 0 )
            throw new ScooterException("El codigo es negativo");
        else if ( autonomía < 0 ) {
            throw new ScooterException("La autonomia es negativa");
        }
        this.empresa = empresa;
        this.codigo = codigo;
        this.posicion = posicion;
        this.autonomía = autonomía;
    }
    public Scooter(String empresa, int codigo, Posicion posicion) {
        this.empresa = empresa;
        this.codigo = codigo;
        this.posicion = posicion;
        autonomía = 0;
    }

    public Scooter() {

    }

    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        if ( codigo <= 0)
            throw new ScooterException("El codigo es negativo o 0");
        this.codigo = codigo;
    }
    public Posicion getPosicion() {
        return posicion;
    }
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    public double getAutonomía() {
        return autonomía;
    }
    public void setAutonomía(double autonomía) {
        if ( autonomía <= 0)
            throw new ScooterException("La autonomia es negativa o 0");
        this.autonomía = autonomía;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scooter scooter = (Scooter) o;
        return codigo == scooter.codigo && empresa.equalsIgnoreCase(scooter.empresa);
    }
    @Override
    public int hashCode() {
        return Objects.hash(empresa, codigo);
    }
    public int compareTo(Scooter s){
        int comparacion = this.empresa.compareToIgnoreCase(s.getEmpresa());
        if ( comparacion == 0 ){
            comparacion = this.codigo - s.getCodigo();
        }
        return comparacion;
    }

    @Override
    public String toString() {
        return "(Empresa: " + empresa + "; Codigo: " + codigo + "; " + getPosicion().toString() + "; Autonomia: " + autonomía + ")";
    }
}
