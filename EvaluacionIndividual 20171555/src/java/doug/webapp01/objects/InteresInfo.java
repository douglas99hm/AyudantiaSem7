package doug.webapp01.objects;

public class InteresInfo {
    
    private String m_strCliente;
    private double m_dCapital;
    private double m_dTasa;
    private double m_dTiempo;

    public InteresInfo(String p_strCliente, double p_dCapital, double p_dTasa, double p_dTiempo) {
        setCliente(p_strCliente);
        setCapital(p_dCapital);
        setTasa(p_dTasa);
        setTiempo(p_dTiempo);
    }

    
    
    public String getCliente() {
        return m_strCliente;
    }

    private void setCliente(String p_strCliente) {
        m_strCliente = p_strCliente;
    }

    public double getCapital() {
        return m_dCapital;
    }

    private void setCapital(double p_dCapital) {
        m_dCapital = p_dCapital;
    }

    public double getTasa() {
        return m_dTasa;
    }

    private void setTasa(double p_dTasa) {
        m_dTasa = p_dTasa;
    }

    public double getTiempo() {
        return m_dTiempo;
    }

    private void setTiempo(double p_dTiempo) {
        m_dTiempo = p_dTiempo;
    }
    
    public double getInteres(){
        double dCapital=getCapital();
        double dTasa=getTasa()/100;
        double dTiempo=getTiempo();
        double diFinal=dCapital*Math.pow(1+dTasa, dTiempo);
        
        return diFinal;
    }
    
}
