// Generated with g9.

package database;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Plano implements Serializable {

    /** Primary key. */
    protected static final String PK = "codPlano";

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

    private int codPlano;
    private float valorMensal;
    private Set<Cliente> cliente;
    private Horario horario;

    /** Default constructor. */
    public Plano() {
        super();
    }

    /**
     * Access method for codPlano.
     *
     * @return the current value of codPlano
     */
    public int getCodPlano() {
        return codPlano;
    }

    /**
     * Setter method for codPlano.
     *
     * @param aCodPlano the new value for codPlano
     */
    public void setCodPlano(int aCodPlano) {
        codPlano = aCodPlano;
    }

    /**
     * Access method for valorMensal.
     *
     * @return the current value of valorMensal
     */
    public float getValorMensal() {
        return valorMensal;
    }

    /**
     * Setter method for valorMensal.
     *
     * @param aValorMensal the new value for valorMensal
     */
    public void setValorMensal(float aValorMensal) {
        valorMensal = aValorMensal;
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
     * Compares the key for this instance with another Plano.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Plano and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Plano)) {
            return false;
        }
        Plano that = (Plano) other;
        if (this.getCodPlano() != that.getCodPlano()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Plano.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Plano)) return false;
        return this.equalKeys(other) && ((Plano)other).equalKeys(this);
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
        i = getCodPlano();
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
        StringBuffer sb = new StringBuffer("[Plano |");
        sb.append(" codPlano=").append(getCodPlano());
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
        ret.put("codPlano", Integer.valueOf(getCodPlano()));
        return ret;
    }

}
