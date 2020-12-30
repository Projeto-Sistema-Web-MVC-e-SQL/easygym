// Generated with g9.

package database;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Cargahoraria implements Serializable {

    /** Primary key. */
    protected static final String PK = "codCargaHor";

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

    private int codCargaHor;
    private String cargaHoraria;
    private Set<Cargo> cargo;

    /** Default constructor. */
    public Cargahoraria() {
        super();
    }

    /**
     * Access method for codCargaHor.
     *
     * @return the current value of codCargaHor
     */
    public int getCodCargaHor() {
        return codCargaHor;
    }

    /**
     * Setter method for codCargaHor.
     *
     * @param aCodCargaHor the new value for codCargaHor
     */
    public void setCodCargaHor(int aCodCargaHor) {
        codCargaHor = aCodCargaHor;
    }

    /**
     * Access method for cargaHoraria.
     *
     * @return the current value of cargaHoraria
     */
    public String getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * Setter method for cargaHoraria.
     *
     * @param aCargaHoraria the new value for cargaHoraria
     */
    public void setCargaHoraria(String aCargaHoraria) {
        cargaHoraria = aCargaHoraria;
    }

    /**
     * Access method for cargo.
     *
     * @return the current value of cargo
     */
    public Set<Cargo> getCargo() {
        return cargo;
    }

    /**
     * Setter method for cargo.
     *
     * @param aCargo the new value for cargo
     */
    public void setCargo(Set<Cargo> aCargo) {
        cargo = aCargo;
    }

    /**
     * Compares the key for this instance with another Cargahoraria.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Cargahoraria and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Cargahoraria)) {
            return false;
        }
        Cargahoraria that = (Cargahoraria) other;
        if (this.getCodCargaHor() != that.getCodCargaHor()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Cargahoraria.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Cargahoraria)) return false;
        return this.equalKeys(other) && ((Cargahoraria)other).equalKeys(this);
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
        i = getCodCargaHor();
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
        StringBuffer sb = new StringBuffer("[Cargahoraria |");
        sb.append(" codCargaHor=").append(getCodCargaHor());
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
        ret.put("codCargaHor", Integer.valueOf(getCodCargaHor()));
        return ret;
    }

}
