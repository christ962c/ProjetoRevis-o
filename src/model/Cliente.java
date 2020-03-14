
package model;


public class Cliente {
    
    private Integer codigo;
    private String nome;
    private String cpf;
    private String dataNacimento;
    private String telefone;
    private static int contador = 0; 
    
    public Cliente(){
      contador++;
      codigo = contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldcodigo = this.codigo;
        this.codigo = codigo;
        propertyChangeSupport.firePropertyChange("codigo",oldcodigo,codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldnome = this.nome;
        this.nome = nome;
        propertyChangeSupport.firePropertyChange("nome", oldnome, nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldcpf = this.cpf;
        this.cpf = cpf;
        propertyChangeSupport.firePropertyChange("cpf",oldcpf,cpf);
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        String olddataNacimento = this.dataNacimento;
        this.dataNacimento = dataNacimento;
        propertyChangeSupport.firePropertyChange("dataNacimento", olddataNacimento, dataNacimento);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldtelefone = this.telefone;
        this.telefone = telefone;
        propertyChangeSupport.firePropertyChange("telefone", oldtelefone, telefone);
    }
    
    
    private transient final java.beans.PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(java.beans.PropertyChangeListener listener )
    {
        propertyChangeSupport.addPropertyChangeListener( listener );
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(java.beans.PropertyChangeListener listener )
    {
        propertyChangeSupport.removePropertyChangeListener( listener );
    }

}
