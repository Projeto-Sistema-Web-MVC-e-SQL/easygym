// Generated with g9.

package database;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Cliente implements Serializable {

    /** Primary key. */
    protected static final String PK = "codCli";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    private Serializable lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Serializable getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Serializable aLockFlag) {
        lockFlag = aLockFlag;
    }

    private int codCli;
    private String nomeCli;
    private String cpfCli;
    private String emailCli;
    private String telefoneCli;
    private String cepCli;
    private String endCli;
    private String cidadeCli;
    private String estadoCli;
    private Plano plano;
    private Horario horario;
    private Funcionario funcionario;

    /** Default constructor. */
    public Cliente() {
        super();
    }

    /**
     * Access method for codCli.
     *
     * @return the current value of codCli
     */
    public int getCodCli() {
        return codCli;
    }

    /**
     * Setter method for codCli.
     *
     * @param aCodCli the new value for codCli
     */
    public void setCodCli(int aCodCli) {
        codCli = aCodCli;
    }

    /**
     * Access method for nomeCli.
     *
     * @return the current value of nomeCli
     */
    public String getNomeCli() {
        return nomeCli;
    }

    /**
     * Setter method for nomeCli.
     *
     * @param aNomeCli the new value for nomeCli
     */
    public void setNomeCli(String aNomeCli) {
        nomeCli = aNomeCli;
    }

    /**
     * Access method for cpfCli.
     *
     * @return the current value of cpfCli
     */
    public String getCpfCli() {
        return cpfCli;
    }

    /**
     * Setter method for cpfCli.
     *
     * @param aCpfCli the new value for cpfCli
     */
    public void setCpfCli(String aCpfCli) {
        cpfCli = aCpfCli;
    }

    /**
     * Access method for emailCli.
     *
     * @return the current value of emailCli
     */
    public String getEmailCli() {
        return emailCli;
    }

    /**
     * Setter method for emailCli.
     *
     * @param aEmailCli the new value for emailCli
     */
    public void setEmailCli(String aEmailCli) {
        emailCli = aEmailCli;
    }

    /**
     * Access method for telefoneCli.
     *
     * @return the current value of telefoneCli
     */
    public String getTelefoneCli() {
        return telefoneCli;
    }

    /**
     * Setter method for telefoneCli.
     *
     * @param aTelefoneCli the new value for telefoneCli
     */
    public void setTelefoneCli(String aTelefoneCli) {
        telefoneCli = aTelefoneCli;
    }

    /**
     * Access method for cepCli.
     *
     * @return the current value of cepCli
     */
    public String getCepCli() {
        return cepCli;
    }

    /**
     * Setter method for cepCli.
     *
     * @param aCepCli the new value for cepCli
     */
    public void setCepCli(String aCepCli) {
        cepCli = aCepCli;
    }

    /**
     * Access method for endCli.
     *
     * @return the current value of endCli
     */
    public String getEndCli() {
        return endCli;
    }

    /**
     * Setter method for endCli.
     *
     * @param aEndCli the new value for endCli
     */
    public void setEndCli(String aEndCli) {
        endCli = aEndCli;
    }

    /**
     * Access method for cidadeCli.
     *
     * @return the current value of cidadeCli
     */
    public String getCidadeCli() {
        return cidadeCli;
    }

    /**
     * Setter method for cidadeCli.
     *
     * @param aCidadeCli the new value for cidadeCli
     */
    public void setCidadeCli(String aCidadeCli) {
        cidadeCli = aCidadeCli;
    }

    /**
     * Access method for estadoCli.
     *
     * @return the current value of estadoCli
     */
    public String getEstadoCli() {
        return estadoCli;
    }

    /**
     * Setter method for estadoCli.
     *
     * @param aEstadoCli the new value for estadoCli
     */
    public void setEstadoCli(String aEstadoCli) {
        estadoCli = aEstadoCli;
    }

    /**
     * Access method for plano.
     *
     * @return the current value of plano
     */
    public Plano getPlano() {
        return plano;
    }

    /**
     * Setter method for plano.
     *
     * @param aPlano the new value for plano
     */
    public void setPlano(Plano aPlano) {
        plano = aPlano;
    }

    /**
     * Access method for horario.
     *
     * @return the current value of horario
     */
    public Horario getHorario() {
        return horario;
    }

    /**
     * Setter method for horario.
     *
     * @param aHorario the new value for horario
     */
    public void setHorario(Horario aHorario) {
        horario = aHorario;
    }

    /**
     * Access method for funcionario.
     *
     * @return the current value of funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * Setter method for funcionario.
     *
     * @param aFuncionario the new value for funcionario
     */
    public void setFuncionario(Funcionario aFuncionario) {
        funcionario = aFuncionario;
    }

    /**
     * Compares the key for this instance with another Cliente.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Cliente and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Cliente)) {
            return false;
        }
        Cliente that = (Cliente) other;
        if (this.getCodCli() != that.getCodCli()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Cliente.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Cliente)) return false;
        return this.equalKeys(other) && ((Cliente)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getCodCli();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Cliente |");
        sb.append(" codCli=").append(getCodCli());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("codCli", Integer.valueOf(getCodCli()));
        return ret;
    }

}
