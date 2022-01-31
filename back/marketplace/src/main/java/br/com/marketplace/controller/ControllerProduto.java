package br.com.marketplace.controller;

import br.com.marketplace.domain.Produto;
import br.com.marketplace.repository.ProdutoRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ControllerProduto {

    @Autowired
    private ProdutoRepositry produtoRepositry;

    @PostMapping
    public ResponseEntity criarProduto(@RequestBody Produto newProduto){
        produtoRepositry.save(newProduto);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("{id}")
    public ResponseEntity getProduto(@PathVariable int id){
        return ResponseEntity.of(produtoRepositry.findById(id));
    }

    @GetMapping
    public ResponseEntity getProdutos(){
        List<Produto> listProdutos = produtoRepositry.findAll();

        if(listProdutos.isEmpty()){
            return ResponseEntity.status(204).build();
        }
            return ResponseEntity.status(200).body(listProdutos);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deletarProduto(@PathVariable int id){
        if (produtoRepositry.existsById(id)){
            produtoRepositry.deleteById(id);
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }


    @PutMapping("{id}")
    public ResponseEntity updateProduto(@PathVariable int id, @RequestBody Produto updateProduto){
        if (produtoRepositry.existsById(id)){
            updateProduto.setIdproduto(id);
            produtoRepositry.save(updateProduto);
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }

    @PatchMapping("{id}")
    public ResponseEntity patchProduto(@PathVariable int id, @RequestBody Produto updateProduto){
        if (produtoRepositry.existsById(id)){
            updateProduto.setIdproduto(id);
            produtoRepositry.save(updateProduto);
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }


}
