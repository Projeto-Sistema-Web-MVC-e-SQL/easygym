// Generated with g9.

package database;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Diautil implements Serializable {

    /** Primary key. */
    protected static final String PK = "codDiasTrab";

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

    private int codDiasTrab;
    private String diasTrab;
    private Set<Cargo> cargo;

    /** Default constructor. */
    public Diautil() {
        super();
    }

    /**
     * Access method for codDiasTrab.
     *
     * @return the current value of codDiasTrab
     */
    public int getCodDiasTrab() {
        return codDiasTrab;
    }

    /**
     * Setter method for codDiasTrab.
     *
     * @param aCodDiasTrab the new value for codDiasTrab
     */
    public void setCodDiasTrab(int aCodDiasTrab) {
        codDiasTrab = aCodDiasTrab;
    }

    /**
     * Access method for diasTrab.
     *
     * @return the current value of diasTrab
     */
    public String getDiasTrab() {
        return diasTrab;
    }

    /**
     * Setter method for diasTrab.
     *
     * @param aDiasTrab the new value for diasTrab
     */
    public void setDiasTrab(String aDiasTrab) {
        diasTrab = aDiasTrab;
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
     * Compares the key for this instance with another Diautil.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Diautil and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Diautil)) {
            return false;
        }
        Diautil that = (Diautil) other;
        if (this.getCodDiasTrab() != that.getCodDiasTrab()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Diautil.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Diautil)) return false;
        return this.equalKeys(other) && ((Diautil)other).equalKeys(this);
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
        i = getCodDiasTrab();
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
        StringBuffer sb = new StringBuffer("[Diautil |");
        sb.append(" codDiasTrab=").append(getCodDiasTrab());
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
        ret.put("codDiasTrab", Integer.valueOf(getCodDiasTrab()));
        return ret;
    }

}
