/*
CREATE TABLE users (
    Codigo INTEGER PRIMARY KEY autoincrement,
    Nome VARCHAR(80) NOT NULL, 
    Idade INTEGER, 
    Cidade VARCHAR(60)
);
*/
package br.com.senaisp.erley.crud;

import java.awt.EventQueue;

// Componentes visuais (aparecem na janela)
import javax.swing.JFrame; // janela
import java.awt.Font; // tipos de fontes (letras)
import javax.swing.JLabel; // textos fixos
import javax.swing.JOptionPane; // Dialogos (nós já utilziamos bastante)
import javax.swing.JPanel; // janela
import javax.swing.table.TableModel; // grids
import java.awt.Color; // cores
import javax.swing.border.EtchedBorder; // tipos de bordas (largura, formato, etc.)
import javax.swing.JTextField; // Campos para digitacao (Campos de digitacao)
import javax.swing.JButton; // botoes
import javax.swing.JScrollPane; // barras de rolagem
import javax.swing.JTable; // tabela (auxilia exibiçao em grid)
// Para os controle dos eventos
import java.awt.event.ActionListener; // Usado para ouvir eventos (clique, tecla pressionada, etc.)
import java.awt.event.ActionEvent; // Usado para atibuir uma ação ao evento
import java.awt.event.MouseAdapter; // Eventos do mouse
import java.awt.event.MouseEvent; // Eventos do mouse

// Para o SQL
import java.sql.*;

public class Users {
	// Criando campos para esta classe

	// guarda a referencia na memoria da nossa janela
	private JFrame frmCurdOperationSwing;
	// campo para guardar o codigo
	private JTextField txtCodigo;
	// campo para guardar o nome
	private JTextField txtNome;
	// campo para guardar a idade
	private JTextField txtIdade;
	// campo para guardar a cidade
	private JTextField txtCidade;
	// Controle do grid
	private JTable table;

	// campo para guardar os dados da conexao com o banco de dados
	Connection conn = null;
	// campo para preparar o texto SQL
	PreparedStatement pst;
	// Retorno das consultas SQL
	ResultSet rs;

	/**
	 * Construtor da classe. Monta a janela (Frame), conecta ao banco de dados e
	 * carrega dados na janela
	 */
	public Users() {
		inicializa();
		conecta();
		carregaDados();
	} // final do método construtor

	/**
	 * Inicializar o conteudo da janela (Que em ingles é window, imagina de onde vem
	 * o nome do sistema operacional)
	 */
	private void inicializa() {
		// comeca a montar a tela
		frmCurdOperationSwing = new JFrame();
		frmCurdOperationSwing.setTitle("Operações de Manutenção banco de dados com SQLite");
		// seleciona o tipo de fonte para a janela, ao inves de utilizar o padrao
		frmCurdOperationSwing.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		// diz que nao vou utilizar os layouts preedefinidos do swing
		frmCurdOperationSwing.getContentPane().setLayout(null);

		// cria texto (rótulo) para colocar na tela
		JLabel lblNewLabel = new JLabel("Sistema de Gerenciamento de usuários");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		// posiciona o define o tamanho do rótulo. Os dados são posição X, Posicao Y,
		// Largura e Altura. tudo em Pixels
		lblNewLabel.setBounds(10, 11, 400, 60);
		// Adiciona este rótulo recem criado a janela. Note a palavrinha ADD.
		frmCurdOperationSwing.getContentPane().add(lblNewLabel);

		// Painel que será colocado dentro da janela
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		// posiciona o define o tamanho do rótulo. Os dados são posição X, Posicao Y,
		// Largura e Altura. tudo em Pixels
		panel.setBounds(20, 71, 387, 284);
		// Adiciona este painel recem criado a janela. Note a palavrinha ADD.
		frmCurdOperationSwing.getContentPane().add(panel);
		panel.setLayout(null);

		// cria rótulo para o usuário saber que é o código
		JLabel lblNewLabel_1 = new JLabel("Código");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(21, 46, 46, 24);
		panel.add(lblNewLabel_1);

		// cria rótulo para o usuário saber que é o nome
		JLabel lblNewLabel_1_1 = new JLabel("Nome");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(21, 81, 46, 24);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Idade");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(21, 116, 46, 24);
		panel.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Cidade");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(21, 154, 46, 24);
		panel.add(lblNewLabel_1_3);

		// aqui começa a criacao dos objetos para pegar textos que o usuário digitar
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		// definingo a quantidade de caracteres maxima
		txtCodigo.setColumns(5); // aqui não tem utilidade
		txtCodigo.setBounds(78, 46, 287, 24);
		panel.add(txtCodigo);
		

		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNome.setColumns(3);
		txtNome.setBounds(78, 81, 287, 24);
		panel.add(txtNome);

		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIdade.setColumns(10);
		txtIdade.setBounds(78, 120, 287, 24);
		panel.add(txtIdade);

		txtCidade = new JTextField();
		txtCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCidade.setColumns(10);
		txtCidade.setBounds(78, 155, 287, 24);
		panel.add(txtCidade);

		// criação do botão Gravar
		JButton btnSave = new JButton("Gravar");

		// Manda o Java ficar ouvindo para escutar o evento de CLIQUE neste botao
		btnSave.addActionListener(new ActionListener() {
			// Quando o Listener (ouvinte) Ouvir um clique nO BOTÃO SALVAR faça a ação abaixo
			public void actionPerformed(ActionEvent e) {
				// lembra dos gets e setters? O que o "get" FAZ?
				//String codigo = txtCodigo.getText();
				String nome = txtNome.getText();
				String idade = txtIdade.getText();
				String cidade = txtCidade.getText();

				if (nome == null || nome.isEmpty() || nome.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor entre com o nome");
					txtNome.requestFocus();
					return;
				}
				if (idade == null || idade.isEmpty() || idade.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor entre com a idade");
					txtIdade.requestFocus();
					return;
				}
				if (cidade == null || cidade.isEmpty() || cidade.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor entre com a cidade");
					txtCidade.requestFocus();
					return;
				}

				// só entra dentro do if se o código estiver vazio
				if (txtCodigo.getText().isEmpty()) {
					try {
						// monta a SQL preparada para receber os valores. É preparada para evitar SQL Injection
						String sql = "insert into users (Nome, Idade, Cidade) values (?,?,?)";
						pst = conn.prepareStatement(sql);
						// trocar o 1º parametro "?" pelo nome
						pst.setString(1, nome);
						// trocar o 2º parametro "?" pela idade
						pst.setString(2, idade);
						// trocar o 3º parametro "?" pelo cidade
						pst.setString(3, cidade);
						// executa o SQL. Lembra do triangulo AZUL no SQLiteSudio?
						pst.executeUpdate();
						// Exibe um diálogo informando da conclusao da execucao
						JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
						// limpa os campos na tela
						limpaTela();
						// Recarrega os dados no grid
						carregaDados();
					} catch (SQLException e1) {
						// se der erro na inclusao entra aqui e exibe o erro
						e1.printStackTrace();
					}
				}

			}
		});
		// altera o fonte da letra exibida no botao paa Tahoma, tamanho 14
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 14));
		// define posicao x e y do botao na janela alem da largura e altura
		btnSave.setBounds(78, 195, 89, 23);
		//inclui o botao no painel
		panel.add(btnSave);
		
		// cria o botão para atualizar os dados digitados
		JButton btnUpdate = new JButton("Atualizar");
		// manda o JAVA ficar oubindo se houve um clique neste botão
		btnUpdate.addActionListener(new ActionListener() {
			// ação para quando ouvir um clique neste botão
			public void actionPerformed(ActionEvent e) {
				// Pega os dados que foram digitados ou alterados. Enfim, o que estiver na tela
				String codigo = txtCodigo.getText();
				String nome = txtNome.getText();
				String idade = txtIdade.getText();
				String cidade = txtCidade.getText();

				if (nome == null || nome.isEmpty() || nome.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor entre com o nome");
					// joga o cursor (foco) para o campo
					txtNome.requestFocus();
					return;
				}
				if (idade == null || idade.isEmpty() || idade.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor entre com a idade");
					// joga o cursor (foco) para o campo
					txtIdade.requestFocus();
					return;
				}
				if (cidade == null || cidade.isEmpty() || cidade.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor entre com a cidade");
					// joga o cursor (foco) para o campo
					txtCidade.requestFocus();
					return;
				}
				
				// se o campo codigo NÃO estiver vazio
				if (!txtCodigo.getText().isEmpty()) {
					try {
						String sql = "update users set Nome=?,Idade=?,Cidade=? where Codigo=?";
						pst = conn.prepareStatement(sql);
						pst.setString(1, nome);
						pst.setString(2, idade);
						pst.setString(3, cidade);
						pst.setString(4, codigo);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");
						// limpe a tela
						limpaTela();
						// atualize o grid com os dados
						carregaDados();

					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnUpdate.setBounds(177, 195, 89, 23);
		panel.add(btnUpdate);

		// Cria botão para excluir
		JButton btnDelete = new JButton("Excluir");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Delete Details
				String codigo = txtCodigo.getText();
				if (!txtCodigo.getText().isEmpty()) {

					int result = JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Exclusão",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

					if (result == JOptionPane.YES_OPTION) {
						try {
							String sql = "delete from users where Codigo=?";
							pst = conn.prepareStatement(sql);
							pst.setString(1, codigo);
							pst.executeUpdate();
							JOptionPane.showMessageDialog(null, "Dados excluídos com successo!");
							limpaTela();
							carregaDados();

						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				}

			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDelete.setBounds(276, 195, 89, 23);
		panel.add(btnDelete);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(417, 71, 467, 284);
		frmCurdOperationSwing.getContentPane().add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int index = table.getSelectedRow();
				TableModel model = table.getModel();
				// Codigo Nome Idade Cidade
				txtCodigo.setText(model.getValueAt(index, 0).toString());
				txtNome.setText(model.getValueAt(index, 1).toString());
				txtIdade.setText(model.getValueAt(index, 2).toString());
				txtCidade.setText(model.getValueAt(index, 3).toString());
			}
		});
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setRowHeight(30);
		scrollPane.setViewportView(table);
		frmCurdOperationSwing.setBounds(100, 100, 910, 522);
		frmCurdOperationSwing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Limpa os campos da tela, jogando uma string vazia no campo texto
	 */
	public void limpaTela() {
		txtCodigo.setText(""); // atribui uma string vazia para o objeto txtCodigo
		txtNome.setText(""); // atribui uma string vazia para o objeto txtNome
		txtIdade.setText(""); // atribui uma string vazia para o objeto txtIdade
		txtCidade.setText(""); // atribui uma string vazia para o objeto txtCidade
		txtNome.requestFocus(); // Joga o foco (cursor) para o campo de nome
	} // final do método limpaTela

	/**
	 * Estabelece conexao com o banco de dados
	 */
	public void conecta() {
		try {
			Class.forName("org.sqlite.JDBC");
			// vai criar um banco chamado BDCadastro.db na raiz do seu projeto
			conn = DriverManager.getConnection("jdbc:sqlite:BDCadastro.db");
			
		} catch (Exception ex) {
			ex.printStackTrace();
			// forcar o encerramento do programa
			System.exit(0);
		} // final do try/catch
	}

	/**
	 * Carrega dados de uma consulta SQL para dentro de um RecordSet E para uma
	 * tabela
	 */
	public void carregaDados() {
		try {
			pst = conn.prepareStatement("SELECT * FROM users ORDER BY Nome");
			rs = pst.executeQuery();
			// chama um metodo estático criado em DbUtils. Por ser estático eu não preciso instanciar
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception ex) {
			// ocorreu um erro ao tentar recuperar dados do banco de dados
			ex.printStackTrace();
		}
	}

	/**
	 * 
	 * /** Executa a aplicação
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// criando instância/objeto da classe Users
					Users window = new Users();
					window.frmCurdOperationSwing.setVisible(true);
				} catch (Exception e) {
					// Se ocorrer erro, vem pra cá e exibe oerro
					e.printStackTrace();
				}
			}
		});
	} // final do método main

}
