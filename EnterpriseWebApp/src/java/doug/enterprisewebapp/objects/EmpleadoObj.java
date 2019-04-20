package doug.enterprisewebapp.objects;

public class EmpleadoObj {
    private String m_strNombre;
    private String m_strApellido;
    private int m_iEdad;
    private String m_strCargo;
    private double m_dSalario;

    public EmpleadoObj(String p_strNombre, String p_strApellido, int p_iEdad, String p_strCargo, double p_dSalario) {
        setNombre(p_strNombre);
        setApellido(p_strApellido);
        setEdad(p_iEdad);
        setCargo(p_strCargo);
        setSalario(p_dSalario);
    }

    
    
    
    public String getNombre() {
        return m_strNombre;
    }

    private void setNombre(String p_strNombre) {
        m_strNombre = p_strNombre;
    }

    public String getApellido() {
        return m_strApellido;
    }

    private void setApellido(String p_strApellido) {
        m_strApellido = p_strApellido;
    }

    public int getEdad() {
        return m_iEdad;
    }

    private void setEdad(int p_iEdad) {
        m_iEdad = p_iEdad;
    }

    public String getCargo() {
        return m_strCargo;
    }

    private void setCargo(String p_strCargo) {
        m_strCargo = p_strCargo;
    }

    public double getSalario() {
        return m_dSalario;
    }

    private void setSalario(double p_dSalario) {
        m_dSalario = p_dSalario;
    }
    
    public double  getIVA(){
      double dSalary=getSalario();
      double IVA=dSalary*0.13;
      return IVA;
    }
    
    public double getRenta(){
      double dSalary=getSalario();
      double Renta=dSalary*0.10;
      return Renta;
    }
    
    public double getSalarioNeto(){
      double dIVA=getIVA();
      double dRenta=getRenta();
      double Salary=getSalario();
      
      double SalarioNeto= Salary-dRenta-dIVA;
      return SalarioNeto;
    }
}
