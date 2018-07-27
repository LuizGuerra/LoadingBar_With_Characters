MANUAL IN PORTUGUESE AND ENGLISH

[pt] {
Ol�! Para usar a barra de progresso, eis algumas dicas:

O primeiro m�todo serve pra ficar continuamente carregando enquanto um processo corre. Primeiro, crie um objeto com a classe LoadingBar:

	LoadingBar obj = new LoadingBar();

A� � s� usar o primeiro m�todo, informando sempre qual a a��o atual que o programa performa e qual o total de a��es que o programa ir� fazer.

	obj.porcentagem(15, 1);
	// recomendo usar for ou while, e usar o �ltimo valor pra performar a leitura de 	   dados.

Os outros m�todos servir�o como uma forma mais manual de usar a LoadingBar:

Primeiro, use o m�todo { obj.setLoadingBar(x); } para informar quantas a��es o programa performar�.

Depois, use o m�todo { obj.pull(); } pra que a a��o seja manualmente contada. Al�, a a��o atual ser� atualizada na vari�vel "acaoAtual" (adcionando 1 ao seu valor), ent�o puxar� o m�todo { obj.porcentagem(); } pra imprimir a barra de progresso.

Obrigado pelo seu tempo! Sinta-se livre pra alterar o c�digo, e bom proveito!
}


==========================================================================================


[en]{
Hello! To use the progress bar, here are some tips:

The first method is to be continuously charged while a process runs. First, create an object with the LoadingBar class:

	LoadingBar obj = new LoadingBar ();

Then just use the first method, always telling you what the current action that the program performs and what the total actions that the program will do.

	percent (15, 1);
	// I recommend using for or while, and use the last value to perform the reading 	   of data.

The other methods will serve as a more manual way of using the LoadingBar:

First, use the {obj.setLoadingBar (x) method; } to inform you how many actions the program will perform.

Then use the {obj.pull () method; } for the action to be manually counted. Here, the current action will be updated in the variable "currentAction" (adding 1 to its value), then it will pull the {obj.porcentagem () method; } to print the progress bar.

Thank's for your time! Feel free to change the code, and enjoy it!
}