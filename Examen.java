package PrimeroJavaFX;

import Tema3.pctrunk.Categoria;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Examen extends Application {

/*
 * PARTE I (6 PUNTOS)

El alumno crear? una aplicaci?n en javafx con un formulario con los siguientes campos, con un Text o label a la izquierda de cada campo:

nombre textfield
edad desplegable de 1 a 20
raza desplegable (pastor alem?n, bulldog, chihuahua, pitbull)
Pedigr? checkbox
Precio slider 1-2000

PARTE II(4 PUNTOS)

En la parte inferior habr? un bot?n, al pulsar el bot?n aparecer? una ventana mostrando los datos del
 formulario de forma ordenada y con la presentaci?n adecuada.

 * */


	private Examen temporal;

	public void start(Stage stage)
	{

		GridPane grid= new GridPane();


		// nombre textfield
		Text txtnombre = new Text("Nombre ==> ");
		TextField nombre = new TextField();



		//edad desplegable de 1 a 20
		ComboBox edad = new ComboBox();

		Text txtedad = new Text("Edad==> ");

		for(int contador = 0; contador <= 100; contador++)
		{
		edad.getItems().add(contador);
		}



		// raza desplegable (pastor alem?n, bulldog, chihuahua, pitbull)

		ComboBox raza = new ComboBox();

		Text txtRaza = new Text("Raza==> ");

		raza.getItems().add("Pastor Aleman");
		raza.getItems().add("Bulldog");
		raza.getItems().add("Chihuahua");
		raza.getItems().add("pitbull");




		// Pedigr? checkbox

		CheckBox checkBox1 = new CheckBox("Pedigri");
		checkBox1.setSelected(true);

		// Precio slider 1-2000

		Text txtPrecio = new Text("Precio ==> ");

		Slider SliderPrecio = new Slider();

		SliderPrecio.setOnMouseDragged(value -> {
			txtPrecio.setText("Precio ==> [ " + (int)SliderPrecio.getValue()*20 + " ]");
		});











		/*
		En la parte inferior habr? un bot?n, al pulsar el bot?n aparecer? una ventana mostrando los datos del
		 formulario de forma ordenada y con la presentaci?n adecuada.
		*/

		Button formulario = new Button("Ver en Formulario");

		formulario.setOnAction(value -> {

		 	AnchorPane ventanaDos = new AnchorPane();
            Stage ventana = new Stage();

            GridPane gridFormulario= new GridPane();

            Scene escena = new Scene(gridFormulario, 325.0,225.0);


            Text formularioNombre = new Text("Nombre");
            Text formularioEdad = new Text("Edad");
            Text formularioRaza = new Text("Raza");
            Text formularioPrecio = new Text("Precio");
            Text formularioPerigri = new Text("Perigri");
            String Perigri = "Tiene Perigri";
            if(checkBox1.isSelected() == false) Perigri = "No tiene Perigri";


            formularioNombre.setText("Nombre [ " + nombre.getText() + " ]");
            formularioEdad.setText("Edad [ " + edad.getValue() + " ]");
            formularioRaza.setText("Raza [ " + raza.getValue() + " ]");
            formularioPrecio.setText("Precio [ " + (int) SliderPrecio.getValue()*20 + " ]");
            formularioPerigri.setText("Precio [ " + Perigri + " ]");


            gridFormulario.add(formularioNombre, 0, 0);
            gridFormulario.add(formularioEdad, 0, 1);
            gridFormulario.add(formularioRaza, 0, 2);
            gridFormulario.add(formularioPrecio, 0, 3);
            gridFormulario.add(formularioPerigri, 0, 4);

            gridFormulario.setPadding(new Insets(20.0,20.0,20.0,20.0));
            gridFormulario.setHgap(10);
            gridFormulario.setVgap(10);

            gridFormulario.setCenterShape(true);


            ventana.setScene(escena);
            ventana.show();


		//stage.close();
			});


		// 1
		grid.add(txtnombre, 0, 0);
		grid.add(nombre, 1, 0);
		// 1
		grid.add(txtedad, 0, 1);
		grid.add(edad, 1, 1);
		// 1
		grid.add(txtRaza, 0, 2);
		grid.add(raza, 1, 2);
		// 1
		grid.add(txtPrecio, 0, 3);
		grid.add(SliderPrecio, 1, 3);
		// 1
		grid.add(checkBox1, 0, 4);
		grid.add(formulario, 0, 5);


		// paddinnss
				grid.setPadding(new Insets(20.0,20.0,20.0,20.0));
				grid.setHgap(10);
				grid.setVgap(10);


		ScrollPane scroll = new ScrollPane();
		scroll.setContent(grid);


		VBox vbox = new VBox();
		vbox.getChildren().add(scroll);



	//escena
		Scene scene = new Scene(vbox, 325.0,225.0);
		stage.setScene(scene);
		stage.show();

	}



	public static void main(String[] args) {
		launch(args);
	}
}

