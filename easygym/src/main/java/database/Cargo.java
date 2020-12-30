// Generated with g9.

package database;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Cargo implements Serializable {

    /** Primary key. */
    protected static final String PK = "codCargo";

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

    private int codCargo;
    private String funcao;
    private float salario;
    private Cargahoraria cargahoraria;
    private Diautil diautil;
    private Set<Funcionario> funcionario;

    /** Default constructor. */
    public Cargo() {
        super();
    }

    /**
     * Access method for codCargo.
     *
     * @return the current value of codCargo
     */
    public int getCodCargo() {
        return codCargo;
    }

    /**
     * Setter method for codCargo.
     *
     * @param aCodCargo the new value for codCargo
     */
    public void setCodCargo(int aCodCargo) {
        codCargo = aCodCargo;
    }

    /**
     * Access method for funcao.
     *
     * @return the current value of funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * Setter method for funcao.
     *
     * @param aFuncao the new value for funcao
     */
    public void setFuncao(String aFuncao) {
        funcao = aFuncao;
    }

    /**
     * Access method for salario.
     *
     * @return the current value of salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * Setter method for salario.
     *
     * @param aSalario the new value for salario
     */
    public void setSalario(float aSalario) {
        salario = aSalario;
    }

    /**
     * Access method for cargahoraria.
     *
     * @return the current value of cargahoraria
     */
    public Cargahoraria getCargahoraria() {
        return cargahoraria;
    }

    /**
     * Setter method for cargahoraria.
     *
     * @param aCargahoraria the new value for cargahoraria
     */
    public void setCargahoraria(Cargahoraria aCargahoraria) {
        cargahoraria = aCargahoraria;
    }

    /**
     * Access method for diautil.
     *
     * @return the current value of diautil
     */
    public Diautil getDiautil() {
        return diautil;
    }

    /**
     * Setter method for diautil.
     *
     * @param aDiautil the new value for diautil
     */
    public void setDiautil(Diautil aDiautil) {
        diautil = aDiautil;
    }

    /**
     * Access method for funcionario.
     *
     * @return the current value of funcionario
     */
    public Set<Funcionario> getFuncionario() {
        return funcionario;
    }

    /**
     * Setter method for funcionario.
     *
     * @param aFuncionario the new value for funcionario
     */
    public void setFuncionario(Set<Funcionario> aFuncionario) {
        funcionario = aFuncionario;
    }

    /**
     * Compares the key for this instance with another Cargo.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Cargo and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Cargo)) {
            return false;
        }
        Cargo that = (Cargo) other;
        if (this.getCodCargo() != that.getCodCargo()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Cargo.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Cargo)) return false;
        return this.equalKeys(other) && ((Cargo)other).equalKeys(this);
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
        i = getCodCargo();
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
        StringBuffer sb = new StringBuffer("[Cargo |");
        sb.append(" codCargo=").append(getCodCargo());
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
        ret.put("codCargo", Integer.valueOf(getCodCargo()));
        return ret;
    }

}
