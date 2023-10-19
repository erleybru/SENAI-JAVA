package br.com.senaisp.bauru.erley.secao09.exemplo01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXMain extends Application {

	@Override
	public void start(Stage primeiraScena) throws Exception {
		// criando nó principal da tela (janela) ou painel principal
		StackPane root = new StackPane();
		
		// adicionando componentes graficos ao painel
		adicionarComponentes(root);
		
		// criando a scene com o painel principal
		Scene scene = new Scene(root, 800, 600, Color.BEIGE);
		
		// atribuimos o título pra a scene e para a aplicação
		primeiraScena.setTitle("Título da minha aplicação");
		primeiraScena.setScene(scene);
		// mostra a aplicação (janela)
		primeiraScena.show();
	}

	private void adicionarComponentes(StackPane root) {
		// Adicionar os itens graficos aqui
		// Botão
		Button btn01 = new Button("Diga Olá Mundo!");
		
		// Evento a ser disparado quando o botão for clicado
		btn01.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Alert msgDlg = new Alert(AlertType.INFORMATION);
				msgDlg.setTitle("Diálogo de mensagem");
				msgDlg.setHeaderText("Este é o Header (cabeçalho) da mensagem");
				msgDlg.setContentText("Olá mundo!");
				msgDlg.showAndWait();
			}
		}); // final do EVENTO do click do botão
		// adicionando o botão ao painel
		root.getChildren().add(btn01);
	}

	// método principal
	public static void main(String[] args) {
		launch(args);
	}
}
