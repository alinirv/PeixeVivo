# PeixeVivo - Sistema de Monitoramento de Barragens
PeixeVivo é um sistema de monitoramento de barragens desenvolvido para detectar abalos sísmicos e garantir a segurança das barragens. Este projeto implementa o padrão de projeto Observer para manter os dispositivos de monitoramento sempre atualizados em relação ao estado da barragem.

## Funcionalidades

O sistema PeixeVivo permite adicionar dispositivos de monitoramento de três tipos: Sensores de Sismo (SS), Sensores de Sismo com Alarme (SSA) e Alarmes de Colapso (AC).
Os dispositivos SS detectam abalos sísmicos no terreno e notificam a barragem.
Os dispositivos SSA medem o nível dos abalos sísmicos e emitem um alarme sonoro caso ultrapassem o limiar de segurança.
Os dispositivos AC são instalados nas cidades próximas à barragem e emitem um alarme sonoro de evacuação caso a barragem tenha um número elevado de indicadores de sismo.
A barragem é identificada pelo seu nome, pelo nome da cidade onde está instalada e pelo contador de indicadores de sismo.
Padrão Observer
O padrão Observer é utilizado neste projeto para permitir que os dispositivos de monitoramento sejam observadores da barragem e sejam notificados sempre que ocorrerem alterações em seu estado.

A classe Barragem atua como o Subject (ou sujeito observado), enquanto as classes SS, SSA e AC são as Observers (ou observadores) que registram interesse na barragem e são notificados quando ocorrem sismos ou mudanças no estado da barragem.

## Estrutura do Projeto

O projeto PeixeVivo possui a seguinte estrutura de classes:

Barragem: Classe que representa a barragem e mantém uma lista de observadores (dispositivos de monitoramento). Ela notifica os observadores sempre que ocorre um sismo.

Observer: Interface que define o contrato para os observadores. Ela contém o método update() que é chamado pela barragem quando ocorre um sismo.

SS: Classe que representa um dispositivo de Sensor de Sismo. Ela implementa a interface Observer e atualiza seu estado quando é notificada pela barragem sobre a ocorrência de um sismo.

SSA: Classe que representa um dispositivo de Sensor de Sismo com Alarme. Ela também implementa a interface Observer e atualiza seu estado quando é notificada pela barragem. Caso o nível de abalos sísmicos ultrapasse o limiar de segurança, ela emite um alarme sonoro.

AC: Classe que representa um dispositivo de Alarme de Colapso. Ela implementa a interface Observer e emite um alarme sonoro de evacuação caso a barragem tenha um número elevado de indicadores de sismo.

## Como Executar o Projeto

Clone este repositório em sua máquina local.
Abra o projeto em sua IDE favorita.
Compile e execute o arquivo Main.java para testar o sistema PeixeVivo.

## Contribuição

Contribuições são bem-vindas! 
