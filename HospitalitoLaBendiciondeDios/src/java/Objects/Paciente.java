package Objects;

public class Paciente 
{
//variables de instancia
private String m_strNombre;
private String m_strApellido;
private String m_strGenero;
private String m_strSintomas;

private int m_iBirthYear;
private int m_iBirthMonth;
private int m_iBirthDay;

    public Paciente(String m_strNombre, String m_strApellido, String m_strGenero, String m_strSintomas, int m_iBirthYear, int m_iBirthMonth, int m_iBirthDay) {
        this.m_strNombre = m_strNombre;
        this.m_strApellido = m_strApellido;
        this.m_strGenero = m_strGenero;
        this.m_strSintomas = m_strSintomas;
        this.m_iBirthYear = m_iBirthYear;
        this.m_iBirthMonth = m_iBirthMonth;
        this.m_iBirthDay = m_iBirthDay;
    }

    public String getM_strNombre() {
        return m_strNombre;
    }

    public void setM_strNombre(String m_strNombre) {
        this.m_strNombre = m_strNombre;
    }

    public String getM_strApellido() {
        return m_strApellido;
    }

    public void setM_strApellido(String m_strApellido) {
        this.m_strApellido = m_strApellido;
    }

    public String getM_strGenero() {
        return m_strGenero;
    }

    public void setM_strGenero(String m_strGenero) {
        this.m_strGenero = m_strGenero;
    }

    public String getM_strSintomas() {
        return m_strSintomas;
    }

    public void setM_strSintomas(String m_strSintomas) {
        this.m_strSintomas = m_strSintomas;
    }

    public int getM_iBirthYear() {
        return m_iBirthYear;
    }

    public void setM_iBirthYear(int m_iBirthYear) {
        this.m_iBirthYear = m_iBirthYear;
    }

    public int getM_iBirthMonth() {
        return m_iBirthMonth;
    }

    public void setM_iBirthMonth(int m_iBirthMonth) {
        this.m_iBirthMonth = m_iBirthMonth;
    }

    public int getM_iBirthDay() {
        return m_iBirthDay;
    }

    public void setM_iBirthDay(int m_iBirthDay) {
        this.m_iBirthDay = m_iBirthDay;
    }
    
    


}
