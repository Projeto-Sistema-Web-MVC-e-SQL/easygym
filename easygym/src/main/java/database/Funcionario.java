// Generated with g9.

package database;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Funcionario implements Serializable {

    /** Primary key. */
    protected static final String PK = "codFunc";

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

    private int codFunc;
    private String nomeFunc;
    private String cpfFunc;
    private String emailFunc;
    private String telefoneFunc;
    private String cepFunc;
    private String endFunc;
    private String cidadeFunc;
    private String estadoFunc;
    private Set<Cliente> cliente;
    private Cargo cargo;

    /** Default constructor. */
    public Funcionario() {
        super();
    }

    /**
     * Access method for codFunc.
     *
     * @return the current value of codFunc
     */
    public int getCodFunc() {
        return codFunc;
    }

    /**
     * Setter method for codFunc.
     *
     * @param aCodFunc the new value for codFunc
     */
    public void setCodFunc(int aCodFunc) {
        codFunc = aCodFunc;
    }

    /**
     * Access method for nomeFunc.
     *
     * @return the current value of nomeFunc
     */
    public String getNomeFunc() {
        return nomeFunc;
    }

    /**
     * Setter method for nomeFunc.
     *
     * @param aNomeFunc the new value for nomeFunc
     */
    public void setNomeFunc(String aNomeFunc) {
        nomeFunc = aNomeFunc;
    }

    /**
     * Access method for cpfFunc.
     *
     * @return the current value of cpfFunc
     */
    public String getCpfFunc() {
        return cpfFunc;
    }

    /**
     * Setter method for cpfFunc.
     *
     * @param aCpfFunc the new value for cpfFunc
     */
    public void setCpfFunc(String aCpfFunc) {
        cpfFunc = aCpfFunc;
    }

    /**
     * Access method for emailFunc.
     *
     * @return the current value of emailFunc
     */
    public String getEmailFunc() {
        return emailFunc;
    }

    /**
     * Setter method for emailFunc.
     *
     * @param aEmailFunc the new value for emailFunc
     */
    public void setEmailFunc(String aEmailFunc) {
        emailFunc = aEmailFunc;
    }

    /**
     * Access method for telefoneFunc.
     *
     * @return the current value of telefoneFunc
     */
    public String getTelefoneFunc() {
        return telefoneFunc;
    }

    /**
     * Setter method for telefoneFunc.
     *
     * @param aTelefoneFunc the new value for telefoneFunc
     */
    public void setTelefoneFunc(String aTelefoneFunc) {
        telefoneFunc = aTelefoneFunc;
    }

    /**
     * Access method for cepFunc.
     *
     * @return the current value of cepFunc
     */
    public String getCepFunc() {
        return cepFunc;
    }

    /**
     * Setter method for cepFunc.
     *
     * @param aCepFunc the new value for cepFunc
     */
    public void setCepFunc(String aCepFunc) {
        cepFunc = aCepFunc;
    }

    /**
     * Access method for endFunc.
     *
     * @return the current value of endFunc
     */
    public String getEndFunc() {
        return endFunc;
    }

    /**
     * Setter method for endFunc.
     *
     * @param aEndFunc the new value for endFunc
     */
    public void setEndFunc(String aEndFunc) {
        endFunc = aEndFunc;
    }

    /**
     * Access method for cidadeFunc.
     *
     * @return the current value of cidadeFunc
     */
    public String getCidadeFunc() {
        return cidadeFunc;
    }

    /**
     * Setter method for cidadeFunc.
     *
     * @param aCidadeFunc the new value for cidadeFunc
     */
    public void setCidadeFunc(String aCidadeFunc) {
        cidadeFunc = aCidadeFunc;
    }

    /**
     * Access method for estadoFunc.
     *
     * @return the current value of estadoFunc
     */
    public String getEstadoFunc() {
        return estadoFunc;
    }

    /**
     * Setter method for estadoFunc.
     *
     * @param aEstadoFunc the new value for estadoFunc
     */
    public void setEstadoFunc(String aEstadoFunc) {
        estadoFunc = aEstadoFunc;
    }

    /**
     * Access method for cliente.
     *
     * @return the current value of cliente
     */
    public Set<Cliente> getCliente() {
        return cliente;
    }

    /**
     * Setter method for cliente.
     *
     * @param aCliente the new value for cliente
     */
    public void setCliente(Set<Cliente> aCliente) {
        cliente = aCliente;
    }

    /**
     * Access method for cargo.
     *
     * @return the current value of cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * Setter method for cargo.
     *
     * @param aCargo the new value for cargo
     */
    public void setCargo(Cargo aCargo) {
        cargo = aCargo;
    }

    /**
     * Compares the key for this instance with another Funcionario.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Funcionario and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Funcionario)) {
            return false;
        }
        Funcionario that = (Funcionario) other;
        if (this.getCodFunc() != that.getCodFunc()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Funcionario.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Funcionario)) return false;
        return this.equalKeys(other) && ((Funcionario)other).equalKeys(this);
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
        i = getCodFunc();
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
        StringBuffer sb = new StringBuffer("[Funcionario |");
        sb.append(" codFunc=").append(getCodFunc());
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
        ret.put("codFunc", Integer.valueOf(getCodFunc()));
        return ret;
    }

}
