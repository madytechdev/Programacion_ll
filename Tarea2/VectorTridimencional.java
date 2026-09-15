package Practicas;
public class VectorTridimencional {
    private double x, y, z;
    public VectorTridimencional() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public VectorTridimencional(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public VectorTridimencional sumar(VectorTridimencional b) {
        return new VectorTridimencional(this.x + b.x, this.y + b.y, this.z + b.z);
    }
    public VectorTridimencional multiplicarEscalar(double r) {
        return new VectorTridimencional(r * this.x, r * this.y, r * this.z);
    }
    public double longitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public VectorTridimencional normalizar() {
        double mod = longitud();
        if (mod == 0) {
            return new VectorTridimencional(); 
        }
        return new VectorTridimencional(x / mod, y / mod, z / mod);
    }
    public double productoEscalar(VectorTridimencional b) {
        return this.x * b.x + this.y * b.y + this.z * b.z;
    }
    public VectorTridimencional productoVectorial(VectorTridimencional b) {
        double nx = this.y * b.z - this.z * b.y;
        double ny = this.z * b.x - this.x * b.z;
        double nz = this.x * b.y - this.y * b.x;
        return new VectorTridimencional(nx, ny, nz);
    }
    public boolean esPerpendicular(VectorTridimencional b) {
        VectorTridimencional suma = this.sumar(b);
        VectorTridimencional resta = this.sumar(b.multiplicarEscalar(-1)); // this - b
        return Math.abs(suma.longitud() - resta.longitud()) < 1e-9;
    }
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }}




