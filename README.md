# vote-counter
Sistema simples em Java que lê um arquivo txt contendo votos por candidato e gera um relatório consolidado usando Map. O programa soma automaticamente os votos repetidos e exibe o total final por candidato.

---

# 🗳️ VoteCounter — Exercício de Prática com Arquivos e Map

Este é apenas um **exercício de prática em Java**, feito para treinar:

* leitura de arquivos (`BufferedReader`);
* manipulação de `Map`;
* tratamento de dados simples.

O programa lê um arquivo contendo nomes de candidatos e votos, soma os votos repetidos e mostra o total de cada um.

## 📌 Como Usar

Ao executar, o programa pede o **caminho do arquivo de entrada**.

Como o arquivo já está dentro do projeto, basta informar um caminho compatível com onde o projeto está salvo no seu computador.

## 📄 Formato do Arquivo

Cada linha deve estar assim:

```
NomeDoCandidato,QuantidadeDeVotos
```

Exemplo:

```
Alex Blue,150
Maria Green,220
Bob Brown,185
Alex Blue,30
```

## ▶️ Resultado

O programa soma os votos de cada candidato e exibe algo como:

```
Alex Blue: 180
Maria Green: 220
Bob Brown: 185
```

## 🛠️ Conteúdo Praticado

* Leitura de arquivo texto
* Uso de `HashMap` / `LinkedHashMap`
* `getOrDefault`
* Laços de repetição


