package nuevos;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FormularioArma extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		GridPane grid = new GridPane();
		
		
		// Nueva Version del CODIGO ESTO CUENTA COMO CAMBIO WIII
		
		
		//Nombre ARMA
		
			Text txtnombreArma = new Text("Nombre Arma");
			TextField nombreArma = new TextField();
			
		//slider POTENCIA DISPARO
				
			Text txtpotenciaDis = new Text("Potencia de Disparo");
			Slider sliderpotenciaDis = new Slider (0,1000,0);
			sliderpotenciaDis.setShowTickLabels(true);
				
		//slider TIPO ARMA
					
			Text txtArma = new Text("Tipo de Arma");
			Slider sliderArma = new Slider (0,1000,0);
			sliderArma.setShowTickLabels(true);
					
		//slider PESO
						
			Text txtPeso = new Text("Peso del Arma");
			Slider sliderPeso = new Slider (0,1000,0);
			sliderPeso.setShowTickLabels(true);
							
		//slider TIPO NAVE
							
			Text txtNave = new Text("Tipo de Nave");
			Slider sliderNave = new Slider (0,1000,0);
			sliderNave.setShowTickLabels(true);
			
		// BOTONES
			
			//Boton GUARDAR
			
				Button Guardar = new Button("Guardar");
			
			//BOTON ELIMINAR
			
				Button Eliminar = new Button("Borrar");
				
				
				
		//Primera fila del grid
						
				grid.add(txtnombreArma, 0, 0);
				grid.setMargin(txtnombreArma, new Insets(5.0,5.0,5.0,5.0));
				
				grid.add(nombreArma, 1, 0);
				grid.setMargin(nombreArma, new Insets(5.0,0.0,5.0,5.0));
		
		//Segunda fila del grid
				
				grid.add(txtpotenciaDis, 0, 1);
				grid.setMargin(txtpotenciaDis, new Insets(5.0,5.0,5.0,5.0));
				
				grid.add(sliderpotenciaDis, 1, 1);
				grid.setMargin(sliderpotenciaDis, new Insets(5.0,0.0,5.0,5.0));
				
		//Tercera fila del grid
				
				grid.add(txtArma, 0, 2);
				grid.setMargin(txtArma, new Insets(5.0,5.0,5.0,5.0));
				
				grid.add(sliderArma, 1, 2);
				grid.setMargin(sliderArma, new Insets(5.0,0.0,5.0,5.0));
				
		//Cuarta fila del grid
				
				grid.add(txtPeso, 0, 3);
				grid.setMargin(txtPeso, new Insets(5.0,5.0,5.0,5.0));
				
				grid.add(sliderPeso, 1, 3);
				grid.setMargin(sliderPeso, new Insets(5.0,0.0,5.0,5.0));
				
		//Cuarta fila del grid
				
				grid.add(txtNave, 0, 4);
				grid.setMargin(txtNave, new Insets(5.0,5.0,5.0,5.0));
				
				grid.add(sliderNave, 1, 4);
				grid.setMargin(sliderNave, new Insets(5.0,0.0,5.0,5.0));


		// Quinta fila del grid 
						
				grid.add(Guardar, 0, 5);
				grid.setMargin(Guardar, new Insets(5.0,5.0,5.0,5.0));

						
				grid.add(Eliminar, 1, 5);
				grid.setMargin(Eliminar, new Insets(5.0,0.0,5.0,5.0));
			
			
			
			

		Scene scene = new Scene(grid,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
