O que é uma View no Android Framework? 
R:Uma View é um espaço na tela que o programador define, podendo mudar tamanhos, adicionar componentes e alterar os demais atributos. Em resumo um espaço virtual que vai aparecer e interagir com o usuário, como exemplos: Botão e campo de texto.


O que é um ViewGroup no contexto da interface do Android? 
R: Seria uma View maior, sendo uma View Pai para as demais views, ela é responsável por definir na tela como as demais views vão se comportar. É como se fosse a tela inteira do aplicativo e todas as demais ficam dentro delas. Importante: Outras Views group podem estar dentro dela. 


Qual é a função dos LayoutParams dentro de um ViewGroup? 
R:São parâmetros passados para os layouts de como devem agir e se posicionar e quais atributos modificar, o posicionamento geralmente é em relação ao pai.


Por que diferentes ViewGroups (como LinearLayout, ConstraintLayout, FrameLayout) utilizam subclasses específicas de LayoutParams?
R: Pois cada um tem um uso especifico, o LinearLayout as views são posicionadas uma abaixo ou ao lado da outra, já o ConstraintLayout as views tem maior liberdade para se movimentar dentro do layout, logo devem usar subclasses específicas para mudar o comportamento de cada uma.
