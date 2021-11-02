public class Fraccion {
 private int numerador;
 private int denominador;

Fraccion(int num, int denom) {
	this.numerador=num;
	this.denominador=denom;
}
void suma(Fraccion f2) {
	int num = this.numerador+f2.numerador;
	this.numerador=num;
	this.denominador=f2.denominador;
}

void resta(Fraccion f2) {
	int num = this.numerador-f2.numerador;
	this.numerador=num;
	this.denominador=f2.denominador;
} 

void multiplicacion(Fraccion f2) {
	int num = this.numerador*f2.numerador;
	int denom = this.denominador*f2.denominador;
	this.numerador=num;
	this.denominador=denom;
}

void division(Fraccion f2) {
	int num = this.numerador*f2.denominador;
	int denom = this.denominador*f2.numerador;
	this.numerador=num;
	this.denominador=denom;
}
@Override
public String toString() {
	return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
}

 
}
