# Atividade para exercitar o *princípio da resposabilidade única* _(Single responsability)_ do SOLID

# Exercício:

Criar um programa que mostre quanto um motorista deve receber por dia ápos informar a lista de passageiros que transportou.

O valor do minuto de corrida é de R$ 0,50
O valor do km rodado é de R$ 0,20

A fórmula para calcular é a seguinte

Valor da corrida = quantidade de minutos * valor do minuto + quantidade de km * valor do km rodado

o programa possui previamente cadastrado os seguintes valores:

```
<passageiro>;<km rodados>;<quantidade de minutos>
joao;6.7;17
pedro;3.1;11
maria;3.0;34
```

o sistema deve imprimir:
> O motorista deve receber: 33.56
