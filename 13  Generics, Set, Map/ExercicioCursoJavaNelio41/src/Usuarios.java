import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Usuarios {
    private String nameUsuario;
    private Instant data;

    public Usuarios(String nameUsuario, Instant data) {
        this.nameUsuario = nameUsuario;
        this.data = data;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuarios usuarios = (Usuarios) o;
        return Objects.equals(nameUsuario, usuarios.nameUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameUsuario);
    }


    public String getNameUsuario() {
        return nameUsuario;
    }

    public void setNameUsuario(String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }
}
