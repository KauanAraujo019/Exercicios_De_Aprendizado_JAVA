public class Adulto extends Pessoa{
    private boolean casado;
    private String nomeDaProfissao;
    private int DDDcnh;

    public void trabalhar(){
        System.out.println("Trabalhando... ");
    }

    

    /**
     * @return boolean return the casado
     */
    public boolean getCasado() {
        return casado;
    }

    /**
     * @param casado the casado to set
     */
    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    /**
     * @return String return the nomeDaProfissao
     */
    public String getNomeDaProfissao() {
        return nomeDaProfissao;
    }

    /**
     * @param nomeDaProfissao the nomeDaProfissao to set
     */
    public void setNomeDaProfissao(String nomeDaProfissao) {
        this.nomeDaProfissao = nomeDaProfissao;
    }

    /**
     * @return int return the DDDcnh
     */
    public int getDDDcnh() {
        return DDDcnh;
    }

    /**
     * @param DDDcnh the DDDcnh to set
     */
    public void setDDDcnh(int DDDcnh) {
        this.DDDcnh = DDDcnh;
    }

}