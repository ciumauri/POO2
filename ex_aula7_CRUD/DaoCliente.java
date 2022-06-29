import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoCliente {
    private Connection conn;
    private Statement st;

    private void conectar() {
        try {
            this.conn = GerenciadorConexao.pegarConexao();
            st = conn.createStatement();
        } catch (ClassNotFoundException e1) {
            System.out.println(e1.getMessage());
        } catch (SQLException e2) {
            System.out.println(e2.getMessage());
        }
    }

    private void desconectar() {
        try {
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao fechar a conexao: "
                    + e.getMessage());
        }
    }

    public boolean inserir(Cliente c) {
        boolean resultado = false;
        try {
            this.conectar();
            String comando = "INSERT INTO tb_clientes VALUES (NULL, '"
                    + c.getNome() + "', '" + c.getEmail() + "', '"
                    + c.getFone() + "', " + c.getCpf() + ");";

            // System.out.println(comando);
            st.executeUpdate(comando);
            resultado = true;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir o registro: "
                    + e.getMessage());
        } finally {
            this.desconectar();
        }
        return resultado;
    }

    public ArrayList<Cliente> buscarTodos() {
        ArrayList<Cliente> resultados = new ArrayList<Cliente>();
        try {
            this.conectar();
            ResultSet rs = st.executeQuery("select * from tb_clientes order by nome;");
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCodigo(rs.getInt("codigo"));
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setFone(rs.getString("telefone"));
                c.setCpf(rs.getString("cpf"));

                resultados.add(c);
            }
        } catch (Exception e) {
            System.out.println("Erro..." + e.getMessage());
        } finally {
            this.desconectar();
        }
        return resultados;
    }

    public int excluir(int cod) {
        int qtde = 0;
        try {
            this.conectar();
            String comando = "delete from tb_clientes where codigo = " + cod + ";";
            st.executeUpdate(comando);
            qtde = st.getUpdateCount();
        } catch (Exception e) {
            System.out.println("Erro... " + e.getMessage());
        } finally {
            this.desconectar();
        }
        return qtde;
    }

    public int editar(int cod) {
        int qtde = 0;
        try {
            this.conectar();
            String comando = "update from tb_clientes where codigo = " + cod + ";";
            st.executeUpdate(comando);
            qtde = st.getUpdateCount();
        } catch (Exception e) {
            System.out.println("Erro... " + e.getMessage());
        } finally {
            this.desconectar();
        }
        return qtde;
    }

    public boolean editar(Cliente cliente) {
        return false;
    }
}
