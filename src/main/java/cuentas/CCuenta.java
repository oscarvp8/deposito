package cuentas;

/**
 * Clase que crea objetos CCuenta
 * @author Oscar Velasco
 */

public class CCuenta {
    
    /**
     * Atributos de la clase
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Getter atributo nombre
     * @return nombre
     */

    public String getNombre() {
        return nombre;
    }
    
    /**
     * Setter atributo nombre
     * @param nombre nombre
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Getter atributo cuenta
     * @return cuenta
     */

    public String getCuenta() {
        return cuenta;
    }
    
    /**
     * Setter atributo cuenta
     * @param cuenta cuenta
     */

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    /**
     * Getter atributo saldo
     * @return saldo
     */

    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Setter atributo saldo
     * @param saldo saldo
     */

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Getter atributo tipoInterés
     * @return tipoInterés
     */

    public double getTipoInterés() {
        return tipoInterés;
    }
    
    /**
     * Setter atributo tipoInterés
     * @param tipoInterés tipo de interés
     */

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * Constructor base para crear objetos CCuenta
     */
    
    public CCuenta()
    {
    }
    
    /**
     * Constructor para crear objetos CCuenta con todos los atributos de la clase
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo
     * @param tipo tipo de interés
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Método de obtención del saldo
     * @return saldo
     */

    public double estado()
    {
        return saldo;
    }
    
    /**
     * Método que aumentará la cantidad del saldo en función de la cantidad introducida por parámetro; devolverá una excepción si la cantidad es menor que 0.
     * @param cantidad cantidad a ingresar
     * @throws Exception "No se puede ingresar una cantidad negativa"
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * Método que restará al saldo la cantidad introducida por parámetro a no ser que la cantidad sea negativa, igual a 0 o el saldo sea menor que la cantidad, en ese caso retornará una excepción
     * @param cantidad a retirar
     * @throws Exception "No se puede retirar una cantidad negativa" ó "No se hay suficiente saldo"
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
