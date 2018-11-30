$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/inserir_conta_declarativo.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Cadastro de contas",
  "description": "\r\nComo um usuário \r\nGostaria de cadastrar contas\r\nPara que eu possa distribuir meu dinheiro de uma forma mais organizada",
  "id": "cadastro-de-contas",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@funcionais"
    }
  ]
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Deve validar regras cadastro contas",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "comments": [
    {
      "line": 17,
      "value": "# ---- Cenário declarativo - Mais utilizado na comunidade, relfete o comportamento e não como  ----------"
    }
  ],
  "line": 18,
  "name": "adiciona a \"\u003cconta\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 19,
  "name": "recebo a mensagem \"\u003cmensagem\u003e\"",
  "keyword": "Então "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas;",
  "rows": [
    {
      "cells": [
        "conta",
        "mensagem"
      ],
      "line": 22,
      "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas;;1"
    },
    {
      "cells": [
        "Conta de Teste",
        "Conta adicionada com sucesso!"
      ],
      "line": 23,
      "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas;;2"
    },
    {
      "cells": [
        "",
        "Informe o nome da conta"
      ],
      "line": 24,
      "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas;;3"
    },
    {
      "cells": [
        "Conta mesmo nome",
        "Já existe uma conta com esse nome!"
      ],
      "line": 25,
      "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas;;4"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 196787,
  "status": "passed"
});
formatter.before({
  "duration": 70505,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 9,
      "value": "#Background em Ingles"
    }
  ],
  "line": 10,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "# ---- Cenário declarativo - Mais utilizado na comunidade, relfete o comportamento e não como  ----------"
    }
  ],
  "line": 13,
  "name": "que desejo adicionar uma conta",
  "keyword": "Dado "
});
formatter.match({
  "location": "inserirContasSteps.queDesejoAdicionarUmaConta()"
});
formatter.result({
  "duration": 8207002846,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Deve validar regras cadastro contas",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 2,
      "name": "@funcionais"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 17,
      "value": "# ---- Cenário declarativo - Mais utilizado na comunidade, relfete o comportamento e não como  ----------"
    }
  ],
  "line": 18,
  "name": "adiciona a \"Conta de Teste\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 19,
  "name": "recebo a mensagem \"Conta adicionada com sucesso!\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "Conta de Teste",
      "offset": 12
    }
  ],
  "location": "inserirContasSteps.adicionaA(String)"
});
formatter.result({
  "duration": 724053025,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Conta adicionada com sucesso!",
      "offset": 19
    }
  ],
  "location": "inserirContasSteps.receboAMensagem(String)"
});
formatter.result({
  "duration": 50485430,
  "status": "passed"
});
formatter.after({
  "duration": 563343735,
  "status": "passed"
});
formatter.after({
  "duration": 626876894,
  "status": "passed"
});
formatter.before({
  "duration": 50870,
  "status": "passed"
});
formatter.before({
  "duration": 51762,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 9,
      "value": "#Background em Ingles"
    }
  ],
  "line": 10,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "# ---- Cenário declarativo - Mais utilizado na comunidade, relfete o comportamento e não como  ----------"
    }
  ],
  "line": 13,
  "name": "que desejo adicionar uma conta",
  "keyword": "Dado "
});
formatter.match({
  "location": "inserirContasSteps.queDesejoAdicionarUmaConta()"
});
formatter.result({
  "duration": 11855864985,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Deve validar regras cadastro contas",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 2,
      "name": "@funcionais"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 17,
      "value": "# ---- Cenário declarativo - Mais utilizado na comunidade, relfete o comportamento e não como  ----------"
    }
  ],
  "line": 18,
  "name": "adiciona a \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 19,
  "name": "recebo a mensagem \"Informe o nome da conta\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 12
    }
  ],
  "location": "inserirContasSteps.adicionaA(String)"
});
formatter.result({
  "duration": 1123887830,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Informe o nome da conta",
      "offset": 19
    }
  ],
  "location": "inserirContasSteps.receboAMensagem(String)"
});
formatter.result({
  "duration": 307848316,
  "status": "passed"
});
formatter.after({
  "duration": 245968881,
  "status": "passed"
});
formatter.after({
  "duration": 631426643,
  "status": "passed"
});
formatter.before({
  "duration": 47747,
  "status": "passed"
});
formatter.before({
  "duration": 33021,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 9,
      "value": "#Background em Ingles"
    }
  ],
  "line": 10,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "# ---- Cenário declarativo - Mais utilizado na comunidade, relfete o comportamento e não como  ----------"
    }
  ],
  "line": 13,
  "name": "que desejo adicionar uma conta",
  "keyword": "Dado "
});
formatter.match({
  "location": "inserirContasSteps.queDesejoAdicionarUmaConta()"
});
formatter.result({
  "duration": 8333417224,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Deve validar regras cadastro contas",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas;;4",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 2,
      "name": "@funcionais"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 17,
      "value": "# ---- Cenário declarativo - Mais utilizado na comunidade, relfete o comportamento e não como  ----------"
    }
  ],
  "line": 18,
  "name": "adiciona a \"Conta mesmo nome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 19,
  "name": "recebo a mensagem \"Já existe uma conta com esse nome!\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "Conta mesmo nome",
      "offset": 12
    }
  ],
  "location": "inserirContasSteps.adicionaA(String)"
});
formatter.result({
  "duration": 495771313,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Já existe uma conta com esse nome!",
      "offset": 19
    }
  ],
  "location": "inserirContasSteps.receboAMensagem(String)"
});
formatter.result({
  "duration": 53377885,
  "status": "passed"
});
formatter.after({
  "duration": 241080445,
  "status": "passed"
});
formatter.after({
  "duration": 633711334,
  "status": "passed"
});
});