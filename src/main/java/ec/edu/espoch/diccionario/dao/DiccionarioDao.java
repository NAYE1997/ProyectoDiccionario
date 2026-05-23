package ec.edu.espoch.diccionario.dao;

import ec.edu.espoch.diccionario.model.Palabra;
import java.util.ArrayList;
import java.util.List;

public class DiccionarioDao {
    private static List<Palabra> lista = new ArrayList<>();

    public void guardar(Palabra p) {
        lista.add(p);
    }

    public List<Palabra> obtenerTodo() {
        return lista;
    }

    public Palabra buscar(String busqueda) {
        for (Palabra p : lista) {
            if (p.getEspanol().equalsIgnoreCase(busqueda) ||
                p.getIngles().equalsIgnoreCase(busqueda)) {
                return p;
            }
        }
        return null;
    }
}