# Jogo-da-Velha
# Tic-Tac-Toe

## Desenvolvimento de um jogo da velha completo, explorando conceitos do Java e da programação orientada a objetos. ##


 O game jogo da velha foi projetado para rodar no console (linha de comando). Embora seja um projeto simples ele é funcional e cumpre o seu objetivo, permitindo que duas pessoas possam jogar o jogo da velha através das informações impressas no console.

 Veja o funcionamento do Jogo da velha nas imagens abaixo:

 ## Imagem 1: Cadastro dos Jogadores.##
 
  Os jogadores Player 1 e Enemy inserem os seus nomes no console, e o sistema retorna com os símbolos atribuidos a cada jogador, neste exemplo o 'x' foi atribuido ao Player 1, e 'o' ao Jogador enemy.

<img align="center" src="img/tictactoe-img1.png" width="900">



## Imagem 2: Inserindo Jogadas. ##

 Nesta imagem o jogador insere a sua jogada na posição [0, 0] do array multidimensional eo símbolo x é registrado na memória e exibido na tela, em seguida o sistema pede para o jogador Enemy inserir a sua jogada, podemos observar que ele insere a sua jogada na posição [0, 1].
Para inserir jogadas neste game é muito simples, basta o usuário digitar o número da posição do array multidimensional desejada. O array que controla este jogo é um array de 'index[3, 3]'.

<img align="center" src="img/tictactoe-img2.png" width="900">


## Imagem 3: Vencedor da Partida ##

 O jogador que preencher as lacunas vertical, horizontal ou na diagonal primeiro, vencerá o jogo e o sistema mostrará na tela uma mensagem, informando que o jagodor cadastrado venceu o jogo. Nesta imagem podemos observar que o jogador Player 1 venceu o jogo.

<img align="center" src="img/tictactoe-img3.png" width="900">


## Imagem 4: Jogo Empatado ##

Caso o jogo termine empatado o sistema também mostrará uma mensagem no console informando aos usários que o game terminou empatado. Neste caso foi feita uma validação no projeto para verificar se todas os campos foram preenchidos e não houve nenhum jogador vencedor.

<img align="center" src="img/tictactoe-img-empatado.png" width="900">


## Imagem 5: Caso de Dígitos Inválidos ##

Caso o usuário inserir algum comando inválido como letras ou posição inexistente no array, foi feita uma validação para verificar e tratar esses tipos de excessões, fazendo que o sistema imprima no console que o dado inserido está incorreto, e o jogo continuará rodando até seu término.

<img align="center" src="img/tictactoe-img-erro.png" width="900">


