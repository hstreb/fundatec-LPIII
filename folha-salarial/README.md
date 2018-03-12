# Atividade para exercitar o *princípio da resposabilidade única* _(Single responsability)_ do SOLID

Criar um programa para imprimir o valor do salário de um funcionário com base nas horas que ele trabalhou durante um mês.

Dado que o sistema já possui salvo os seguintes dados:

funcionário	cargo	salário
joao	operador	1000.0
pedro	operador 	1000.0 
maria	gerente	2000.0
O sistema espera que o usuário digite o nome do funcionário e depois a quantidade de horas trabalhadas no mês, logo após, deve imprimir o seguinte:
<nome> <quantidade de horas> <salario>

Exemplo:

Digitar o nome do funcionário:
> joao

Digitar a quantidade de horas:
> 180

> joao 180 1000.0



A carga horária normal é de 180 horas por mês, mais do que isso é pago horas extras e menos do que isso é descontado.

ex.

181 horas trabalhadas o salario final é de 1008.33 
180 horas trabalhadas o salario final é de 1000.0
179 horas trabalhadas o salario final é de 994.43

Fórmulas:
valor hora = salario do funcionário / 180
quantidade de horas extras = se número de horas digitado > 180 então número de horas digitado - 180, senão 0
valor hora extra = valor hora * 0.5 * quantidade de horas extras
salario final = número de horas digitado * valor hora * valor hora extra
