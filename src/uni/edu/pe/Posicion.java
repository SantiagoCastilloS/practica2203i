package uni.edu.pe;

public class Posicion {
    private double longitud;
    private double latitud;

    public Posicion(double latitud, double longitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }

    /* calcula y devuelve la distancia entre
     * la posicion receptora del mensaje (this)
     * y la posicion recibida por parametro (p)
     */
    public double distancia(Posicion p) {
        return Math.sqrt(Math.pow(this.latitud - p.latitud, 2) +
                Math.pow(this.longitud - p.longitud, 2));
    }

    @Override
    public String toString() {
        return "Lat: " + latitud + "; Lon: " + longitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
}
