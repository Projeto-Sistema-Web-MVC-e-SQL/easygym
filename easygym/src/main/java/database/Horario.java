// Generated with g9.

package database;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Horario implements Serializable {

    /** Primary key. */
    protected static final String PK = "codHorario";

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

    private int codHorario;
    private String horario;
    private String faixaHorario;
    private Set<Cliente> cliente;
    private Set<Plano> plano;

    /** Default constructor. */
    public Horario() {
        super();
    }

    /**
     * Access method for codHorario.
     *
     * @return the current value of codHorario
     */
    public int getCodHorario() {
        return codHorario;
    }

    /**
     * Setter method for codHorario.
     *
     * @param aCodHorario the new value for codHorario
     */
    public void setCodHorario(int aCodHorario) {
        codHorario = aCodHorario;
    }

    /**
     * Access method for horario.
     *
     * @return the current value of horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * Setter method for horario.
     *
     * @param aHorario the new value for horario
     */
    public void setHorario(String aHorario) {
        horario = aHorario;
    }

    /**
     * Access method for faixaHorario.
     *
     * @return the current value of faixaHorario
     */
    public String getFaixaHorario() {
        return faixaHorario;
    }

    /**
     * Setter method for faixaHorario.
     *
     * @param aFaixaHorario the new value for faixaHorario
     */
    public void setFaixaHorario(String aFaixaHorario) {
        faixaHorario = aFaixaHorario;
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
     * Access method for plano.
     *
     * @return the current value of plano
     */
    public Set<Plano> getPlano() {
        return plano;
    }

    /**
     * Setter method for plano.
     *
     * @param aPlano the new value for plano
     */
    public void setPlano(Set<Plano> aPlano) {
        plano = aPlano;
    }

    /**
     * Compares the key for this instance with another Horario.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Horario and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Horario)) {
            return false;
        }
        Horario that = (Horario) other;
        if (this.getCodHorario() != that.getCodHorario()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Horario.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Horario)) return false;
        return this.equalKeys(other) && ((Horario)other).equalKeys(this);
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
        i = getCodHorario();
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
        StringBuffer sb = new StringBuffer("[Horario |");
        sb.append(" codHorario=").append(getCodHorario());
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
        ret.put("codHorario", Integer.valueOf(getCodHorario()));
        return ret;
    }

}
