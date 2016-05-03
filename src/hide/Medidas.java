package hide;

import java.util.Date;

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
    private double pescoco;
    private double ombro;
    private double bracoRlxDir;
    private double bracoRlxEsq;
    private double bracoConDir;
    private double bracoConEsq;
    private double antebracoDir;
    private double antebracoEsq;
    private double toraxRlx;
    private double toraxInsp;
    private double cintura;
    private double abdomen;
    private double quadril;
    private double rcq;
    private double coxaDir;
    private double coxaEsq;
    private double panturrilhaDir;
    private double panturrilhaEsq;
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
     * @param altura  the imc to set
     * @param  peso 
     */
    public void setImc(double altura, double peso) {
        this.imc = peso/((altura/100)*(altura/100));
    }
    

    /**
     * @return the pescoco
     */
    public double getPescoco() {
        return pescoco;
    }

    /**
     * @param pescoco the pescoco to set
     */
    public void setPescoco(double pescoco) {
        this.pescoco = pescoco;
    }

    /**
     * @return the ombro
     */
    public double getOmbro() {
        return ombro;
    }

    /**
     * @param ombro the ombro to set
     */
    public void setOmbro(double ombro) {
        this.ombro = ombro;
    }

    /**
     * @return the bracoRlxDir
     */
    public double getBracoRlxDir() {
        return bracoRlxDir;
    }

    /**
     * @param bracoRlxDir the bracoRlxDir to set
     */
    public void setBracoRlxDir(double bracoRlxDir) {
        this.bracoRlxDir = bracoRlxDir;
    }

    /**
     * @return the bracoRlxEsq
     */
    public double getBracoRlxEsq() {
        return bracoRlxEsq;
    }

    /**
     * @param bracoRlxEsq the bracoRlxEsq to set
     */
    public void setBracoRlxEsq(double bracoRlxEsq) {
        this.bracoRlxEsq = bracoRlxEsq;
    }

    /**
     * @return the bracoConDir
     */
    public double getBracoConDir() {
        return bracoConDir;
    }

    /**
     * @param bracoConDir the bracoConDir to set
     */
    public void setBracoConDir(double bracoConDir) {
        this.bracoConDir = bracoConDir;
    }

    /**
     * @return the bracoConEsq
     */
    public double getBracoConEsq() {
        return bracoConEsq;
    }

    /**
     * @param bracoConEsq the bracoConEsq to set
     */
    public void setBracoConEsq(double bracoConEsq) {
        this.bracoConEsq = bracoConEsq;
    }

    /**
     * @return the antebracoDir
     */
    public double getAntebracoDir() {
        return antebracoDir;
    }

    /**
     * @param antebracoDir the antebracoDir to set
     */
    public void setAntebracoDir(double antebracoDir) {
        this.antebracoDir = antebracoDir;
    }

    /**
     * @return the antebracoEsq
     */
    public double getAntebracoEsq() {
        return antebracoEsq;
    }

    /**
     * @param antebracoEsq the antebracoEsq to set
     */
    public void setAntebracoEsq(double antebracoEsq) {
        this.antebracoEsq = antebracoEsq;
    }

    /**
     * @return the toraxRlx
     */
    public double getToraxRlx() {
        return toraxRlx;
    }

    /**
     * @param toraxRlx the toraxRlx to set
     */
    public void setToraxRlx(double toraxRlx) {
        this.toraxRlx = toraxRlx;
    }

    /**
     * @return the toraxInsp
     */
    public double getToraxInsp() {
        return toraxInsp;
    }

    /**
     * @param toraxInsp the toraxInsp to set
     */
    public void setToraxInsp(double toraxInsp) {
        this.toraxInsp = toraxInsp;
    }

    /**
     * @return the cintura
     */
    public double getCintura() {
        return cintura;
    }

    /**
     * @param cintura the cintura to set
     */
    public void setCintura(double cintura) {
        this.cintura = cintura;
    }

    /**
     * @return the abdomen
     */
    public double getAbdomen() {
        return abdomen;
    }

    /**
     * @param abdomen the abdomen to set
     */
    public void setAbdomen(double abdomen) {
        this.abdomen = abdomen;
    }

    /**
     * @return the quadril
     */
    public double getQuadril() {
        return quadril;
    }

    /**
     * @param quadril the quadril to set
     */
    public void setQuadril(double quadril) {
        this.quadril = quadril;
    }

    /**
     * @return the rcq
     */
    public double getRcq() {
        return rcq;
    }

    /**
     * @param rcq the rcq to set
     */
    public void setRcq(double rcq) {
        this.rcq = rcq;
    }

    /**
     * @return the coxaDir
     */
    public double getCoxaDir() {
        return coxaDir;
    }

    /**
     * @param coxaDir the coxaDir to set
     */
    public void setCoxaDir(double coxaDir) {
        this.coxaDir = coxaDir;
    }

    /**
     * @return the coxaEsq
     */
    public double getCoxaEsq() {
        return coxaEsq;
    }

    /**
     * @param coxaEsq the coxaEsq to set
     */
    public void setCoxaEsq(double coxaEsq) {
        this.coxaEsq = coxaEsq;
    }

    /**
     * @return the panturrilhaDir
     */
    public double getPanturrilhaDir() {
        return panturrilhaDir;
    }

    /**
     * @param panturrilhaDir the panturrilhaDir to set
     */
    public void setPanturrilhaDir(double panturrilhaDir) {
        this.panturrilhaDir = panturrilhaDir;
    }

    /**
     * @return the panturrilhaEsq
     */
    public double getPanturrilhaEsq() {
        return panturrilhaEsq;
    }

    /**
     * @param panturrilhaEsq the panturrilhaEsq to set
     */
    public void setPanturrilhaEsq(double panturrilhaEsq) {
        this.panturrilhaEsq = panturrilhaEsq;
    }
    
    
    
    public static void main(String[] arg){
        Medidas m = new Medidas();
        m.setAltura(165);
        m.setPeso(56);
        m.setImc(m.getAltura(), m.getPeso());
        System.out.println(m.getImc());
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
