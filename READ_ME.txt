MANUAL IN PORTUGUESE AND ENGLISH

[pt] {
Olá! Para usar a barra de progresso, eis algumas dicas:

O primeiro método serve pra ficar continuamente carregando enquanto um processo corre. Primeiro, crie um objeto com a classe LoadingBar:

	LoadingBar obj = new LoadingBar();

Aí é só usar o primeiro método, informando sempre qual a ação atual que o programa performa e qual o total de ações que o programa irá fazer.

	obj.porcentagem(15, 1);
	// recomendo usar for ou while, e usar o último valor pra performar a leitura de 	   dados.

Os outros métodos servirão como uma forma mais manual de usar a LoadingBar:

Primeiro, use o método { obj.setLoadingBar(x); } para informar quantas ações o programa performará.

Depois, use o método { obj.pull(); } pra que a ação seja manualmente contada. Alí, a ação atual será atualizada na variável "acaoAtual" (adcionando 1 ao seu valor), então puxará o método { obj.porcentagem(); } pra imprimir a barra de progresso.

Obrigado pelo seu tempo! Sinta-se livre pra alterar o código, e bom proveito!
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