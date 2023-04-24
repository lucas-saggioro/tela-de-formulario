package formulariohospital;

import java.awt.*; //importa o pacote
public class FormularioHospital extends Frame { //define e extende a classe FormularioHospital

protected Dimension dQuadro, dRotulo, dCaixaTexto, dBotao; //herda a dimensão
protected Button bValidar, bSair; //herda o botão
protected TextField tfPaciente, tfSintomas; //herda a caixa de texto
protected Label lPaciente, lSintomas; //herda texto ou imagem

public FormularioHospital(){ //define a classe FormularioHospital

Dimension dQuadro = new Dimension(290,200); //cria nova dimensão do quadro
Dimension dRotulo = new Dimension(55,25); //cria nova dimensão do rótulo
Dimension dCaixaTexto = new Dimension(130,25); //cria nova dimensão da caixa de texto
Dimension dBotao = new Dimension(100,25); // cria nova dimensão do botão

setTitle("Formulário Hospital"); //Define o título
setResizable(false); //define que não será redimensionável
setSize(dQuadro); //define o tamanho
setLocation(400,200); //define o local
setLayout(null); //define o layout nulo

lPaciente = new Label("Paciente"); //vincula novo texto
lPaciente.setSize(dRotulo); //vincula o tamanho do texto
lPaciente.setLocation(25,50); //vincula o local do texto

tfPaciente = new TextField(); //vincula nova caixa de texto
tfPaciente.setSize(dCaixaTexto); //vincula o tamanho da caixa de texto
tfPaciente.setLocation(90,50); //vincula o local da caixa de texto

lSintomas = new Label("Sintomas");
lSintomas.setSize(dRotulo);
lSintomas.setLocation(25,100);

tfSintomas = new TextField();
tfSintomas.setSize(dCaixaTexto);
tfSintomas.setLocation(90,100);

bValidar = new Button("Validar");
bValidar.setSize(dBotao);
bValidar.setLocation(25,150);

bSair = new Button("Sair");
bSair.setSize(dBotao);
bSair.setLocation(130,150);

add(lPaciente);
add(tfPaciente);
add(lSintomas);
add (tfSintomas);
add(bValidar);
add(bSair);
}
}