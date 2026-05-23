package ec.edu.espoch.diccionario.controller;

import ec.edu.espoch.diccionario.dao.DiccionarioDao;
import ec.edu.espoch.diccionario.model.Palabra;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class DiccionarioController {

    @FXML private TextField txtEspaniol;
    @FXML private TextField txtIngles;
    @FXML private TextField txtTraducir;

    private DiccionarioDao diccionarioDao = new DiccionarioDao();

    @FXML
    private void guardarPalabra() {
        String espanol = txtEspaniol.getText().trim();
        String ingles  = txtIngles.getText().trim();
        if (espanol.isEmpty() || ingles.isEmpty()) {
            mostrarAlerta("Error", "Completa los campos Español e Inglés.");
            return;
        }
        if (diccionarioDao.buscar(espanol) != null) {
            mostrarAlerta("Duplicado", "Esa palabra ya existe.");
            return;
        }
        diccionarioDao.guardar(new Palabra(espanol, ingles, ""));
        mostrarAlerta("Éxito", "Palabra guardada correctamente.");
        limpiarCampos();
    }

    @FXML
    private void handleTraducir() {
        String buscar = txtTraducir.getText().trim();
        if (buscar.isEmpty()) {
            mostrarAlerta("Atención", "Escribe una palabra para traducir.");
            return;
        }
        Palabra p = diccionarioDao.buscar(buscar);
        if (p != null) {
            txtEspaniol.setText(p.getEspanol());
            txtIngles.setText(p.getIngles());
        } else {
            mostrarAlerta("No encontrado", "\"" + buscar + "\" no está en el diccionario.");
            txtEspaniol.clear();
            txtIngles.clear();
        }
    }

    private void limpiarCampos() {
        txtEspaniol.clear();
        txtIngles.clear();
        txtTraducir.clear();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}