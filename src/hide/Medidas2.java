package hide;

import java.util.Date;

/**
 *
 * @author h4ck3r
 */
public class Medidas2 {
    private int idMedidas;
    private int idCliente;
    private double peso;
    private double altura;
    private double imc;
    private Date dataMedicao;

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
     * @param peso the imc to set
     * @param altura
     */
    public void setImc(double peso, double altura) {
        this.imc = peso/((altura/100)*(altura/100));
    }

    /**
     * @return the dataMedicao
     */
    public Date getDataMedicao() {
        return dataMedicao;
    }

    /**
     * @param dataMedicao the dataMedicao to set
     */
    public void setDataMedicao(Date dataMedicao) {
        this.dataMedicao = dataMedicao;
    }
}
