@propostas @test2
Feature: Visualizar propostas dos candidatos a Presidente
  Como um usuário
  Eu quero visualizar as propostas dos candidatos a presidente
  Para que eu possa analisar suas propostas

  Scenario: Visualizar Propostas pelo link de propostas
    Given que acessei o website
    When clicar no link propostas
    And selecionar presidente
    And selecionar o candidato "Jair Bolsonaro"
    Then será apresentada suas propostas

  Scenario: visualizar propostas do candidato através do link candidato
    Given que acessei o website
    When clicar no link candidatos
    And selecionar presidente
    And selecionar o candidato "Jair Bolsonaro"
    Then será apresentada suas informações
    And será apresentada suas propostas
