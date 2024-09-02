//package app;
//
//import java.util.HashMap;
//
//import java.util.Map;
//
//class Usuario {
//
//    private int id;
//    private String nombre;
//
//    public Usuario(int id, String nombre) {
//        this.id = id;
//        this.nombre = nombre;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//}
//
//interface UsuarioDAO {
//
//    void crear(Usuario usuario);
//
//    Usuario leer(int id);
//
//    void actualizar(Usuario usuario);
//
//    void eliminar(int id);
//}
//
//class UsuarioDAOImpl implements UsuarioDAO {
//
//    private Map<Integer, Usuario> usuarios = new HashMap<>();
//
//    public void crear(Usuario usuario) {
//        usuarios.put(usuario.getId(), usuario);
//    }
//
//    public Usuario leer(int id) {
//        return usuarios.get(id);
//    }
//
//    public void actualizar(Usuario usuario) {
//        usuarios.put(usuario.getId(), usuario);
//    }
//
//    public void eliminar(int id) {
//        usuarios.remove(id);
//    }
//}
//
//public class DAO {
//
//    public static void main(String[] args) {
//        UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
//
//        Usuario usuario1 = new Usuario(1, "Juan");
//        usuarioDAO.crear(usuario1);
//
//        Usuario usuarioLeido = usuarioDAO.leer(1);
//        System.out.println("Usuario leído: " + usuarioLeido.getNombre());
//
//        usuarioLeido.setNombre("Juan Actualizado");
//        usuarioDAO.actualizar(usuarioLeido);
//
//        Usuario usuarioActualizado = usuarioDAO.leer(1);
//        System.out.println("Usuario actualizado: " + usuarioActualizado.getNombre());
//
//        usuarioDAO.eliminar(1);
//    }
//}
