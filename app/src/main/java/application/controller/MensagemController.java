package application.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class MensagemController {
    /**Vetor do tipo string que tem tres dados */
    private String[] frutas = {"Maça", "Banana", "Morango"};
    /*criando o método para retornar o vetor, com o nome list e poderia ser qualquer um. */
    /*Endpoint aqui ó */
    @GetMapping("/frutas")
    public String[] list(){
        return this.frutas;
    }

    @GetMapping("/frutas/{id}")
    public String list(@PathVariable int id) {
        return this.frutas[id];
    }

}
/**put e patch são poucos utilizados, porém geralmente usam mais e apenas o put. O put muda tudo e o patch só o campo */
 /**#todo tipo de funcionalidade que o outro está expondo para que consuma é uma API  
    * diferença de api rest para uma API comum é que a rest possui alguns padrões, já a webapi posso usar qualquer coisa. API = responde qualquer proceso da net, agr se trabalha dentro dos modelos rest ele é uma rest api*/ 
