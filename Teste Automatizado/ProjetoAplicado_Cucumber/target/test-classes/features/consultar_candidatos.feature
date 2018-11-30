@candidato @test1
Feature: Visualizar candidatos a Presidente
  Como um usuário
  Eu quero consultar os candidatos a presidente
  Para que eu analise seu perfil

  Scenario: Visualizar Candidatos
    Given que acessei o website
    When clicar no link candidatos
    And selecionar presidente
    Then verei todos os candidatos

  Scenario: visualizar perfil do candidato
    Given que acessei o website
    When clicar no link candidatos
    And selecionar presidente
    And selecionar o candidato "Jair Bolsonaro"
    Then será apresentada suas informações
