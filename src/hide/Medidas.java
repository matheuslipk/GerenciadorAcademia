package hide;

/**
 *
 * @author h4ck3r
 */

public class Medidas {
    private int idMedidas;
    private int idCliente;
    private double peso;
    private double altura;
    private double imc;
    

    /**
     * @return the idMedidas
     */
    public int getIdMedidas() {
        return idMedidas;
    }

    /**
     * @param idMedidas the idMedidas to set
     */
    public void setIdMedidas(int idMedidas) {
        this.idMedidas = idMedidas;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the imc
     */
    public double getImc() {
        return imc;
    }

    /**
     * @param altura  the imc to set
     * @param  peso 
     */
    public void setImc(double altura, double peso) {
        this.imc = peso/((altura/100)*(altura/100));
    }
    
    
    public static void main(String[] arg){
        Medidas m = new Medidas();
        m.setAltura(165);
        m.setPeso(56);
        m.setImc(m.getAltura(), m.getPeso());
        System.out.println(m.getImc());
    }
    
}
