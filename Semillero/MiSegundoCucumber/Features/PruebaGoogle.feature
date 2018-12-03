#Author: juliangebe@gmail.com

@tag
Feature: Busqueda en googel

  @tag1
  Scenario: Busqueda exitosa
    Given Yo abro el navegador    
    When Abro la pagina de inicio de google    
    Then Busco "busqueda a realizar " una busqueda 
    

 
